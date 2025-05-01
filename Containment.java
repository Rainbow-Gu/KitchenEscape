import java.util.ArrayList;

public class Containment extends Item {
    
    /**
     * Attributes
     */

    boolean openClose; //true if it is open
    ArrayList<Item> items;

    //Constructor
    public Containment (Item i1, Item i2, boolean openClose) {
        super("Containment");
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(i1);
        items.add(i2);
    }

    public boolean open() {
        if (openClose == false) {
            openClose = true;
            if (items.get(1) != null){
                System.out.println("You found " + items.get(0).getName()+ " and " + items.get(1).getName() + " .");
            } else {
                System.out.println("You found " + items.get(0).getName() + " .");
            }
        } return openClose;
    }

    public void take (Item i) {
        if (openClose == true) {
            addItem(i);
            items.remove(i);
        }
    }

    public boolean close() {
        openClose = false;
        System.out.println("You closed it.");
        return openClose;
    }
}
