package monsters.view;

import javax.swing.JOptionPane;

import monstser.controller.MonsterAppController;

public class MonsterView
{
	private MonsterAppController baseController;
	
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;
	}

	public void displayInformation()
	{
		JOptionPane.showMessageDialog(null, "stuff to show XD");
		JOptionPane.showMessageDialog(null,  "It's name is " + baseController.getMyMonster().getName());
	}
}
