package test;

public class Road extends Edge {
    // the availability of the store,at the beginning all the stores are available
    public int availability = 1;
    private Graph j;

    /* Add a new road */
    public void addNewRoad(Store v1, Store v2, Graph j) {
        addEdge(v1, v2);
        this.j = j;
    }

    /* Draw the road */
    public void drawRoad() {
        setRoadAvailability(availability);
        j.drawEdge(beg, end, availability);
    }

    /* Change the road availability; 0=unavailable; 1=available */
    public void setRoadAvailability(int newAvailability) {
        availability = newAvailability;
        if (availability == 0) {
            beg.disconnect(end);
            end.disconnect(beg);
        } else {
            beg.connect(end);
            end.connect(beg);
        }
    }
}
