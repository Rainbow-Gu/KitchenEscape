import java.util.ArrayList;

public class Utility extends Item {

    /*
     * Attributes
     */

    static ArrayList<Item> containItems;

    // Constructor
    public Utility(String name) {
        super(name);
    }

    // put food in utility
    public void addFood (Item food) {
        containItems.add(food);
        System.out.println(food + " is added to " + this);
    }
}