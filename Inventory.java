import java.util.ArrayList;

public class Inventory {
    /**
     * Attributes
     */

    public ArrayList<Item> collection;

    public Inventory () {
        this.collection = new ArrayList<Item> ();
    }

    public void addItem(Item i) {
        collection.add(i);
    }

    public void removeItem(Item i) {
        collection.remove(i);
    }
    
    public void printInventory() {
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
