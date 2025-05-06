import java.util.ArrayList;

public class Utility extends Item {

    /*
     * Attributes
     */

    ArrayList<Item> containItems;

    // Constructor
    public Utility(String name) {
        super(name);
        containItems = new ArrayList<Item>();
    }

    // put food in utility
    public void addFood (Item food) {
        if(collection.contains(this) || stove.items.contains(this) || oven.items.contains(this)) {
            if(collection.contains(food)|| pot.containItems.contains(food)) {
                containItems.add(food);
                collection.remove(food);
                System.out.println(food.getName() + " is added to " + this.getName());
            } else {
                System.out.println("You can't do this.");
            }
        } else {
            System.out.println("You need something to put food in.");
        }
    }

}