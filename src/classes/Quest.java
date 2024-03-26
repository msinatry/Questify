package classes;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Quest extends JPanel {
    private JLabel nameLabel;
    private JButton completeButton;
    private boolean isCompleted = false;

    public Quest(String name) {
        nameLabel = new JLabel(name);
        completeButton = new JButton("Mark as Complete");
        completeButton.addActionListener(e -> markAsCompleted());
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(nameLabel);
        add(completeButton);
    }

    private void markAsCompleted() {
        if (!isCompleted) {
            isCompleted = true;
            nameLabel.setText("<html><strike>" + nameLabel.getText() + "</strike></html>"); // Strikethrough text
            completeButton.setEnabled(false); // Disable button after marking as complete
        }
    }

    public boolean isCompleted() {
        return isCompleted;
    }
}
