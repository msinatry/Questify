package classes;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;



public class QuestList extends JPanel{
	
	QuestList(){
		
		GridLayout layout = new GridLayout(10,1);
		layout.setVgap(5);
		
		this.setLayout(layout);
		this.setBackground(Color.WHITE);
	}
	
	 // Method to add a new quest
	public void addQuest(String questName){
		
		Quest newQuest = new Quest(questName);
		this.add(newQuest);
		this.revalidate();
		this.repaint(); // Refresh the panel to display the new Quest component
	}
	


}