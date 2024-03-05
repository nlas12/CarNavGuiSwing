package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import interfaces.Map;

@SuppressWarnings("serial")
public class MyFrame extends JFrame{

	public MyFrame(Map map) {
        this(map, null);
    }

    public MyFrame(Map map, ButtonPanel btnPanel) {
        setTitle("Car Navigation GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FieldPanel fieldPanel = new FieldPanel(map);
        JPanel containerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        containerPanel.add(fieldPanel);
        Box box = new Box(BoxLayout.Y_AXIS);
        box.setAlignmentX(CENTER_ALIGNMENT);
        box.add(Box.createVerticalGlue());
        box.add(containerPanel);
        box.add(Box.createVerticalGlue());
        add(box);
        
        
        if (btnPanel != null) {
            getContentPane().add(btnPanel, BorderLayout.EAST);
        }

        pack();
        setSize(800, 800);
        setLocationRelativeTo(null);

    }
}
