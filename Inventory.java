import java.util.ArrayList;

public class Inventory {
    /**
     * Attributes
     */

    ArrayList<Item> items;

    public void addItem(Item i) {
        items.add(i);
    }

    public boolean exist(Item i) {
        if (items.contains(i)) {
            return true;
        }
        return false;
    } // check whether something exists, thus can be used 

}
