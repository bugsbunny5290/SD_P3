package test;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Map;

public class Edge {

    protected Vertex beg;
    protected Vertex end;

    /*Add new edge*/
    public void addEdge(Vertex beg1, Vertex end1) {
        beg = beg1;
        end = end1;
    }
}
