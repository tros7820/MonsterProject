package monstser.controller;

import monsters.model.MarshmallowMonster;
import monsters.view.MonsterView;

public class MonsterAppController
{

	private MonsterView myAppView;
	private MarshmallowMonster myMonster;
	private MarshmallowMonster otherMonster;
	
	public MonsterAppController()
	{
		myAppView = new MonsterView(this);
		myMonster = new MarshmallowMonster("Bobby Jay", 4.0, 5.0, 6, 3, 3, true);
		otherMonster = new MarshmallowMonster("P Jizzy", 3.2, .5, 3, 2, 1, false);
		//Create your monster here!
	}
	public Object getMyMonster()
	{
		return myMonster;
	}
	public void start()
	{
		myAppView.displayInformation();
	}

}

