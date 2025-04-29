import java.util.ArrayList;

public class Inventory {
    /**
     * Attributes
     */

    public static ArrayList<Item> collection;

    public static void addItem(Item i) {
        collection.add(i);
    }

    public static void removeItem(Item i) {
        collection.remove(i);
    }
    
    public static void printInventory() {
        if (collection.isEmpty()){
            System.out.println("You have nothing in your bag...");
        } else {
            System.out.println("Bag Inventory: \n");
            for (Item i :collection) {
                System.out.println("- " + i.getName());
            }
        }
    }

}
