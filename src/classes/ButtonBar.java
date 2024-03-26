package classes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.*;

public class ButtonBar extends JPanel {
	
	private JButton newQuest;
	private JButton clearQuest;
	
	Border emptyBorder = BorderFactory.createEmptyBorder();
	
	//Constructor
	ButtonBar(QuestList questList)
	{
		this.setPreferredSize(new Dimension(400,60));
		this.setBackground(Color.orange);	
		
		newQuest = new JButton("New Quest");
		newQuest.setBorder(emptyBorder);
		newQuest.setFont(new Font("Sans-serif", Font.PLAIN, 20));
		
		this.add(newQuest);
		
		this.add(Box.createHorizontalStrut(20));
		
		clearQuest = new JButton("Clear Completed Quests");
		clearQuest.setBorder(emptyBorder);
		clearQuest.setFont(new Font("Sans-serif", Font.PLAIN, 20));
		newQuest.addActionListener(e -> {
		    String questName = JOptionPane.showInputDialog("Enter Quest Name:");
		    if (questName != null && !questName.trim().isEmpty()) {
		        questList.addQuest(questName);
		    }
		});
		this.add(clearQuest);
		clearQuest.addActionListener(e -> clearCompletedQuests(questList));
		
	}
	

	//Method for clearing completed quests
	private void clearCompletedQuests(QuestList questList) {
	    Component[] components = questList.getComponents();
	    for (Component component : components) {
	        if (component instanceof Quest) {
	            Quest questItem = (Quest) component;
	            if (questItem.isCompleted()) {
	                questList.remove(questItem);
	            }
	        }
	    }
	    questList.revalidate();
	    questList.repaint(); // Ensure the UI updates to reflect the removal
	}

	
	public JButton getNewQuest()
	{
		return newQuest;
	}
	public JButton getClearQuest()
	{
		return clearQuest;
	}
}
