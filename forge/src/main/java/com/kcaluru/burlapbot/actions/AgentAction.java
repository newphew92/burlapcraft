package com.kcaluru.burlapbot.actions;

import burlap.oomdp.core.Domain;
import burlap.oomdp.core.State;
import burlap.oomdp.singleagent.Action;

public abstract class AgentAction extends Action {
	
	protected int [][] movementMap;
	protected final int height;
	
	abstract void doAction(State state);
	
	/**
	 * 
	 * @param name
	 * @param domain
	 * @param map
	 */
	public AgentAction(String name, Domain domain, int [][][] map) {
		super(name, domain, "");
		this.height = map.length;
		this.movementMap = map[1];
	}
	
	protected int[][] getMovementMap() {
		return this.movementMap;
	}
	
	protected AgentAction getAction() {
		return this;
	}

	@Override
	protected State performActionHelper(State s, String[] params) {
		AgentAction action = this.getAction();
		
		action.doAction(s);
		
		return s;
	}

}