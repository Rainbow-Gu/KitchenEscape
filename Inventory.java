import java.util.ArrayList;

public class Inventory {
    /**
     * Attributes
     */

    static ArrayList<Item> items;

    public static void addItem(Item i) {
        items.add(i);
    }

    public static void removeItem(Item i) {
        items.remove(i);
    }

    public static boolean exist(Item i) {
        // I want to check an item
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(i)) {
                return true;
            }
        }
        return false;
    } 
    
    public void printInventory() {
        if (items.isEmpty()){
            System.out.println("You have nothing in your bag...");
        } else {
            System.out.println("Bag Inventory: \n");
            for (Item i :items) {
                System.out.println("- " + i.getName());
            }
        }
    }

}
