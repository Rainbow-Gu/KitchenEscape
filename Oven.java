import java.util.ArrayList;

public class Oven extends Switch {

    /*
     * Attributes
     */
    boolean opened; //true if oven is open
    static ArrayList<Item> items; //list of items inside the oven

    /**
     * Constructor
     * @param onOff true if oven is on
     */
    public Oven (boolean onOff){
        super("oven", onOff);
        items = new ArrayList<Item>();
    }

    /**
     * Opens oven
     * @return true if oven is open
     */
    public boolean open () {
        opened = true;
        System.out.println("Oven opened.");
        return opened;
    }
    
    /**
     * Closes oven
     * @return false if oven is close
     */
    public boolean close () {
        opened = false;
        System.out.println("Oven closed."); // cannot see what's inside
        return opened;
    }

    /**
     * Puts item (cake) into oven
     * @param i item to be put into oven
     */
    public void addItemOven (Item i) {
        if (opened) {
            System.out.println("Pan is in the oven.");
        } else {
            System.out.println("You need to open the oven first.");
        }
        items.add(i);
        collection.remove(i);
    }

    /**
     * Checks if pan is in the oven
     * @return true if pan is in the oven
     */
    public boolean checkPan () {
        if (items.contains(pan)) {
            if(pan.containItems.contains(egg) && pan.containItems.contains(flour)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    /**
     * Bakes cake
     */
    public void cook() {
        if(this.checkPan()) {
            if(!opened) {
                if (this.checkSwitch()) {
                    System.out.println("Baking...");
                    pan.containItems.add(cake);
                    System.out.println("You made a cake!");
                } else {
                    System.out.println("How to correctly use the oven?");
                }
            } else {
                System.out.println("You need to close the oven first.");
            }
        } else {
            System.out.println("You don't have a ready pan yet.");
        }
    }

    /**
     * Takes cake and adds to the collection
     * @param i cake
     */
    public void take(Item i) {
        if (opened && !onOff) {
            if (pan.containItems.contains(i)) {
                addItem(i);
                pan.containItems.remove(i);
                System.out.println("You took the cake.");
            } else {
                System.out.println("That item isn't here.");
            }
        } else {
            System.out.println("You need to make sure the oven is off and opened.");
        }
    }
}