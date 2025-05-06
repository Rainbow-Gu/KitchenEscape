import java.util.ArrayList;

public class Utility extends Item {

    /*
     * Attributes
     */
    ArrayList<Item> containItems; //list of items in the utility

    /**
     * Constructor
     * @param name name of the utility instance
     */
    public Utility(String name) {
        super(name);
        containItems = new ArrayList<Item>();
    }

    /**
     * puts food in utility
     * @param food food to be put
     */
    public void addFood (Item food) {
        if(collection.contains(this) || stove.items.contains(this) || oven.items.contains(this)) {
            if(collection.contains(food)|| pot.containItems.contains(food)) {
                containItems.add(food);
                collection.remove(food);
                System.out.println(food.getName() + " is added to " + this.getName());
            } else {
                System.out.println("You do not yet have " + food.getName());
            }
        } else {
            System.out.println("You need something to put food in.");
        }
    }
}