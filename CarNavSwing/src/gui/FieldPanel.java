package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;
import app.Street;
import interfaces.Map;
import interfaces.Vertex;

@SuppressWarnings("serial")
public class FieldPanel extends JPanel {

    private int cellSize;
    private Vertex[][] mapData;

    public FieldPanel(Map map) {
        this.mapData = map.getMyMapArray();
        this.cellSize = 25; // Default cell size
        setBackground(Color.BLUE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < mapData.length; i++) {
            for (int j = 0; j < mapData[i].length; j++) {
                Rectangle rectangle = new Rectangle(j * cellSize, i * cellSize, cellSize, cellSize);

                if (mapData[i][j] instanceof Street) {
                    g.setColor(Color.GRAY);
                } else {
                    g.setColor(Color.GREEN);
                }

                g.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
                g.setColor(Color.BLACK);
                g.drawRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
            }
        }
    }

    @Override
    public Dimension getPreferredSize() {
        // Calculate preferred size based on the actual size of the painted map
        return new Dimension(mapData[0].length * cellSize, mapData.length * cellSize);
    }
}
