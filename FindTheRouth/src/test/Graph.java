/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;

public class Graph extends JPanel {

    public void drawVertex(Vertex v1) {
        Graphics g;
        g = getGraphics();
        g.fillOval(v1.getCoordX(), v1.getCoordY(), v1.getVertexSize(), v1.getVertexSize());
        g.drawString(v1.getVertexName(), v1.getCoordX(), v1.getCoordY());
    }

    public void drawEdge(Vertex v1, Vertex v2, int availability) {
        Graphics g;
        g = getGraphics();

        if (availability == 1) {
            g.setColor(Color.black);
            g.drawLine(v1.getCoordX() + 10, v1.getCoordY() + 10, v2.getCoordX() + 10, v2.getCoordY() + 10);

        } else if (availability == 0) {
            g.setColor(Color.RED);
            g.drawLine(v1.getCoordX() + 10, v1.getCoordY() + 10, v2.getCoordX() + 10, v2.getCoordY() + 10);
        } else if (availability == 3) {
            g.setColor(Color.GREEN);
            g.drawLine(v1.getCoordX() + 10, v1.getCoordY() + 10, v2.getCoordX() + 10, v2.getCoordY() + 10);
        }
    }

}
