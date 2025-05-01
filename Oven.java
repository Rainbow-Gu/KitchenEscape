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

    public void open () {
        opened = true;
        System.out.println("Oven opened.");
        if (items.isEmpty()) {
            System.out.println("The oven is empty.");
        } else {
            System.out.println("Inside the oven:");
            for (Item i : items) {
                System.out.println("- " + i.getName());
            }
        }
    }
    
    public void close () {
        opened = false;
        System.out.println("Oven closed."); // cannot see what's inside
    }

    public void addItemOven (Item i) {
        items.add(i);
    }

    public boolean checkPan () {
        if (collection.contains(pan)) {
            if(pan.containItems.contains(egg) && pan.containItems.contains(flour)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void cook() {
        if(this.checkPan()) {
            if (this.checkSwitch() && !this.opened) {
                System.out.println("Oven is on. Baking...");
                collection.add(cake);
                System.out.println("You made a cake!");
            } else {
                System.out.println("How to correctly use the oven?");
            }
        } else {
            System.out.println("You don't have a ready pan yet.");
        }
    }
}