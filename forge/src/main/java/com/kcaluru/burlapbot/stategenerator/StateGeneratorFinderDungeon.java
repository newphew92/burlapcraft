package com.kcaluru.burlapbot.stategenerator;

import net.minecraft.client.Minecraft;

import com.kcaluru.burlapbot.BurlapWorldGenHandler;
import com.kcaluru.burlapbot.helpers.BurlapAIHelper;
import com.kcaluru.burlapbot.helpers.NameSpace;
import com.kcaluru.burlapbot.helpers.Pos;

import burlap.oomdp.core.Domain;
import burlap.oomdp.core.ObjectInstance;
import burlap.oomdp.core.State;

public class StateGeneratorFinderDungeon {

	public static State getCurrentState(Domain domain) {
		
		State s = new State();		

		Pos curPos = BurlapAIHelper.getPlayerPosition();
		int rotateDirection = BurlapAIHelper.getRotateDirection();
		int rotateVertDirection = BurlapAIHelper.getRotateVertDirection();
		
		ObjectInstance agent = new ObjectInstance(domain.getObjectClass(NameSpace.CLASSAGENT), "agent0");
		agent.setValue(NameSpace.ATX, curPos.x - BurlapWorldGenHandler.finderX);
		agent.setValue(NameSpace.ATY, curPos.y - BurlapWorldGenHandler.finderY);
		agent.setValue(NameSpace.ATZ, curPos.z - BurlapWorldGenHandler.finderZ);
		agent.setValue(NameSpace.ATROTDIR, rotateDirection);
		agent.setValue(NameSpace.ATVERTDIR, rotateVertDirection);
		
		s.addObject(agent);
		
		return s;
	}
	
}
