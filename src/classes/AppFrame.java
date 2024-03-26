package classes;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class AppFrame extends JFrame{
	
	private TitleBar title;
	private QuestList questList;
	private ButtonBar btnBar;

	//Constructor
	AppFrame()
	{
		this.setSize(400,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		title = new TitleBar();
		questList= new QuestList();
		btnBar = new ButtonBar(questList);
		this.add(title,BorderLayout.NORTH);
		this.add(questList,BorderLayout.CENTER);
		this.add(btnBar,BorderLayout.SOUTH);
		
		
	}
}
