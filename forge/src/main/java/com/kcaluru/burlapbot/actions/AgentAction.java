package com.kcaluru.burlapbot.actions;

import java.util.concurrent.TimeUnit;

import com.kcaluru.burlapbot.domaingenerator.DomainGeneratorReal;
import com.kcaluru.burlapbot.stategenerator.StateGenerator;

import burlap.oomdp.core.Domain;
import burlap.oomdp.core.State;
import burlap.oomdp.singleagent.Action;

public abstract class AgentAction extends Action {
	
	abstract void doAction(State state);
	
	/**
	 * 
	 * @param name
	 * @param domain
	 */
	public AgentAction(String name, Domain domain) {
		super(name, domain, "");
	}
	
	protected AgentAction getAction() {
		return this;
	}

	@Override
	protected State performActionHelper(State s, String[] params) {
		AgentAction action = this.getAction();
		
		System.out.println(action.toString());
		
		action.doAction(s);
		
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		State newState = StateGenerator.getCurrentState(domain, DomainGeneratorReal.dungeonID);
		
		System.out.println(newState.toString());
		
		return newState;
	}

}
