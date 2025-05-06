import java.util.ArrayList;

public class Containment extends Item {
    
    /**
     * Attributes
     */
    boolean openClose; //true if it is open
    ArrayList<Item> items; //list of items in the containment

    /**
     * Constructor for containment with only one item
     * @param name the name of the containment
     * @param i1 one item
     * @param openClose true if the containment is open
     */
    public Containment (String name, Item i1, boolean openClose) {
        super(name);
        this.items = new ArrayList<Item>();
        items.add(i1);
    }

    /**
     * Overloaded constructor for containment with two items
     * @param name the name of the containment
     * @param i1 one item
     * @param i2 another item
     * @param openClose true if the containment is open
     */
    public Containment (String name, Item i1, Item i2, boolean openClose) {
        super(name);
        this.items = new ArrayList<Item>();
        items.add(i1);
        items.add(i2);
    }
    
    /**
     * Opens the containment and shows what it contains
     * @return true if the containment is open
     */
    public boolean open() {
        if (openClose == false) {
            openClose = true;
            if (items.isEmpty()) {
                System.out.println("It is empty.");
            } else {
                System.out.print("You found a(n) ");
                for (int i = 0; i < items.size(); i++) {
                    Item item = items.get(i);
                    if (i == 0) {
                        System.out.print(item.getName());
                    } else {
                        System.out.print(" and " + item.getName());
                    }
                }
                System.out.println(".");
            }
        } else {
            System.out.println("It is already opened.");
        }
        return openClose;
    }
    
    /**
     * Takes an item from the containment and adds to the collection
     * @param i item to take
     */
    public void take(Item i) {
        if (openClose) {
            if (items.contains(i)) {
                addItem(i);
                items.remove(i);
            } else {
                System.out.println("That item isn't here.");
            }
        } else {
            System.out.println("You need to open it first.");
        }
    }

    /**
     * Close the containment
     * @return false if the containment is close
     */
    public boolean close() {
        openClose = false;
        return openClose;
    }
}
