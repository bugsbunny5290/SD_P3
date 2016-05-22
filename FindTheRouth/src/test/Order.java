/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;

public class Order {

    /* the objects from the order */
    private String order_objects;
    /* the store that needs the order */
    private Store store;

    /* Add a new order for a specific store(s) */
    public void addNewOrder(Store s) {
        store = s;
        order_objects = "";
    }

    /* Set the order objects */
    public void setOrderItems(String objects) {
        order_objects = objects;
    }

    /* Get the order objects*/
    public String getOrderItems() {
        return order_objects;
    }

    /* The order was send, so the order_object is reinitialized to nothing*/
    public void sendOrder() {
        if (this.order_objects.compareTo("") != 0) {
            if (store.search() == true) {
                this.order_objects = "";
            }
        }
    }
}
