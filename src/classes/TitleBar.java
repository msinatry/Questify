package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class TitleBar extends JPanel{

	//Constructor
	TitleBar(){
		this.setPreferredSize(new Dimension(400,80));
		
		JLabel titleText = new JLabel("Questify");
		titleText.setPreferredSize(new Dimension (200, 80));
		this.setBackground(Color.orange);
		titleText.setFont(new Font("Sans-serif",Font.BOLD, 20));
		titleText.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(titleText);
		
				
	}
}
