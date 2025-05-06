import java.util.ArrayList;
import java.util.List;

public class Item {

    /**
     * Attributes
     */
    String name;
    public static ArrayList<Item> collection = new ArrayList<Item>();

    // North Wall
    static Item egg = new Item("egg");
    static Containment fridge = new Containment("Fridge", egg, false);
    static Item key = new Item("key");
    static Balloon balloon = new Balloon();
    static Switch light = new Switch("Light", false);
    static Item todoList = new Item("todo List");
    static Item cakeRecipe = new Item("Cake recipe");
    static Door door = new Door();

    // West Wall
    static Utility bowl = new Utility("Bowl");
    static Utility pan = new Utility("Pan");
    static Cake cake = new Cake();
    static Cabinet cabinet = new Cabinet("Cabinet", bowl, pan, false);
    static Pot pot = new Pot();
    static Stove stove = new Stove(false);
    static Oven oven = new Oven(false);

    // East Wall
    static Item poster = new Item("poster");
    static Item fork = new Item("fork");

    // South Wall
    static Item flour = new Item("flour");
    static Noodle noodle = new Noodle();
    static Candle candle = new Candle(false);
    static Containment drawer1 = new Containment("Drawer 1", noodle, flour, false);
    static Containment drawer2 = new Containment("Drawer 2", candle, false);
    static Faucet faucet = new Faucet();

    /**
     * Constructor
     * @param name the name of the instance item
     */
    public Item(String name){
        this.name = name;
    }

    /**
     * Accessor for item's name
     * @return item's name
     */
    public String getName(){
        return name;
    }

    /**
     * Adds an item to the collection when it is collected
     * @param i the item to add
     */
    public static void addItem(Item i) {
        if (!collection.contains(i)) {
            collection.add(i);
        } else {
            System.out.println("You already took the " + i.getName() + ".");
        }

        for (List<Item> wall : Walls.wallContents.values()) {
        wall.remove(i);
        }

        String name = i.getName();
        String capitalized = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println(capitalized + " taken.");
    }

    /**
     * Removes an item from the collection when it is used
     * @param i the item to remove
     */
    public static void removeItem(Item i) {
        collection.remove(i);
    }
    
    /**
     * Prints the list of items in the collection when the player wants to check collection
     */
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