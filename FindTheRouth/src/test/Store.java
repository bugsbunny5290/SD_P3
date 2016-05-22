package test;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Store extends Vertex {

    /* the main store that will send all the orders to the other stores */
    private Store mainStore;

    /* Add new store */
    public void addNewStore(String name1, int x, int y, Store mainStore, Graph j) {
        addNewVertex(name1, x, y, j);
        this.mainStore = mainStore;
    }

    /* search for the connection between this store and the main store */
    public boolean search() {
        return areConnected(new ArrayList<Vertex>(), mainStore);
    }

    /*draw the store*/
    public void drawStore() {
        j.drawVertex(this);
    }

}
