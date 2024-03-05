package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class ButtonPanel extends JPanel {

    public ButtonPanel() {
        setLayout(new GridLayout(5, 1)); // Vertical layout with 5 rows

        for (int i = 1; i <= 5; i++) {
            JButton button = createButton(i);
            add(button);
        }
    }

    // Abstract method for button action
    public abstract void actionButton(int buttonNumber);

    // Factory method to create buttons with specified actions
    private JButton createButton(int buttonNumber) {
        JButton button = new JButton("Button " + buttonNumber);
        button.addActionListener(e -> actionButton(buttonNumber));
        return button;
    }
}
