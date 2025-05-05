import java.util.ArrayList;

public class Oven extends Switch {

    /*
     * Attributes
     */

    boolean opened; 
    static ArrayList<Item> items;

    public Oven (boolean onOff){
        super("oven", onOff);
        items = new ArrayList<Item>();
    }

    public boolean open () {
        opened = true;
        System.out.println("Oven opened.");
        return opened;
    }
    
    public boolean close () {
        opened = false;
        System.out.println("Oven closed."); // cannot see what's inside
        return opened;
    }

    public void addItemOven (Item i) {
        if (opened) {
            System.out.println("Pan is in the oven.");
        } else {
            System.out.println("You need to open the oven first.");
        }
        items.add(i);
        collection.remove(i);
    }

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

    public void cook() {
        if(this.checkPan()) {
            if(!opened) {
                if (this.checkSwitch()) {
                    System.out.println("Oven is on. Baking...");
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