import java.util.ArrayList;

public class Utility extends Item {

    /*
     * Attributes
     */

    ArrayList<Item> containItems;

    // Constructor
    public Utility(String name) {
        super(name);
        this.containItems = new ArrayList<Item>();
    }

    // put food in utility
    public void addFood (Item food) {
        containItems.add(food);
        System.out.println(food + " is added to " + this);
    }
}