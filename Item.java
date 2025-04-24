import java.util.ArrayList;

public class Item {

    /**
     * Attributes
     */
    boolean isTaken;
    public ArrayList<Item> items;

    public void take(Item i) {
        if (isTaken == false) {
            items.remove(i);
        }
        isTaken = true;
    }

    public void put(Item i) {
        if (isTaken == true) {
            items.add(i);
        }
        isTaken = false;
    }
}