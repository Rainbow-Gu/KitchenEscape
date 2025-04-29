import java.util.ArrayList;

public class Inventory {
    /**
     * Attributes
     */

    ArrayList<Item> items;

    public void addItem(Item i) {
        items.add(i);
    }

    public void removeItem(Item i) {
        items.remove(i);
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
