package com.kcaluru.burlapbot.actions;

import com.kcaluru.burlapbot.helpers.BurlapAIHelper;
import com.kcaluru.burlapbot.helpers.NameSpace;
import com.kcaluru.burlapbot.helpers.Pos;

import burlap.oomdp.core.Domain;
import burlap.oomdp.core.ObjectInstance;
import burlap.oomdp.core.State;
import burlap.oomdp.singleagent.SADomain;

public class MovementAction extends AgentAction {
	
	protected int[][] movementMap;

	public MovementAction(String name, Domain domain, int[][][] map) {
		super(name, domain, map);
		movementMap = getMovementMap();
	}

	@Override
	void doAction(State state) {
		
		ObjectInstance agent = state.getFirstObjectOfClass(NameSpace.CLASSAGENT);
		Pos curPos = BurlapAIHelper.getPlayerPosition();
		BurlapAIHelper.moveForward(false, curPos.x, curPos.y, curPos.z);
		
		
		
		
		//get resulting position
		int [] newPos = this.moveResult(curX, curZ, dir);
		
		//set the new position
		agent.setValue(NameSpace.ATX, newPos[0]);
		agent.setValue(NameSpace.ATY, 1);
		agent.setValue(NameSpace.ATZ, newPos[1]);
		
		//return the state we just modified
		return s;
	}

}