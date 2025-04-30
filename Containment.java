import java.util.ArrayList;

public class Containment extends Item {
    
    /**
     * Attributes
     */

    boolean openClose; //true if it is open
    ArrayList<Item> items;

    //Constructor
    public Containment (Item i1, Item i2) {
        super("Containment");
        this.items = new ArrayList<Item> ();
        items.add(i1);
        items.add(i2);
    }

    public boolean open() {
        if (openClose == false) {
            openClose = true;
        } return openClose;
    }

    public void take (Item i) {
        if (openClose == true) {
            Inventory.addItem(i);
            items.remove(i);
        }
    }

    public boolean close() {
        openClose = false;
        return openClose;
    }
}
