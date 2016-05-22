package test;

//import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Vertex extends JPanel {

    /* the 2 coordonated of the vertex*/
    private int coordX, coordY;
    /*the list of connections between the vertices */
    private ArrayList<Vertex> connections;
    /* the name of the vertex */
    private String name;
    /* the graph for drawing*/
    protected Graph j;
    /* the size we want to draw the vertex with */
    protected int vertexSize = 20;

    /*Add new vertex*/
    public void addNewVertex(String name1, int x, int y, Graph j)
    {
        this.coordX = x;
        this.coordY = y;
        this.name = name1;
        connections = new ArrayList<Vertex>();
        this.j = j;
    }
    
    /* Get coordonate X of the vertex */
    public int getCoordX() {
        return coordX;
    }

    /* Get coordonate Y of the vertex */
    public int getCoordY() {
        return coordY;
    }

    /* Get the size we want the vertex to have */
    public int getVertexSize() {
        return vertexSize;
    }

    /* Get the name of the vertex */
    public String getVertexName() {
        return name;
    }

    /* Connect 2 vertices */
    public void connect(Vertex s1) {
        if (connections.contains(s1) == false) {
            connections.add(s1);
        }
    }

    /* Disconnect 2 vertices */
    public void disconnect(Vertex s1) {
        connections.remove(s1);
    }

    /* Search to see if they are connected and draws them */
    public boolean areConnected(ArrayList<Vertex> visited, Vertex v) {
        if (connections.contains(v)) {
            j.drawEdge(this, v, 3);
            return true;
        } else {
            visited.add(this);
            for (Vertex i : connections) {
                if (visited.contains(i) == false) {
                    if (i.areConnected(visited, v) == true) {
                        j.drawEdge(this, i, 3);
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
