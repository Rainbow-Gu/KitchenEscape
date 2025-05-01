import java.util.ArrayList;

public class Item {

    /**
     * Attributes
     */
    String name;
    public static ArrayList<Item> collection;

    // North Wall
    static Item egg = new Item("egg");
    static Containment fridge = new Containment(egg, null, false);
    Item key = new Item("key");
    static Balloon balloon = new Balloon();
    static Switch light = new Switch("light", false);
    static Poster todoList = new Poster("todoList");
    static Poster cakeRecipe = new Poster("cakeRecipe");

    // West Wall
    static Utility bowl = new Utility("bowl");
    static Utility pan = new Utility("pan");
    Cake cake = new Cake();
    static Cabinet cabinet = new Cabinet(bowl, pan, false);
    static Pot pot = new Pot();
    static Stove stove = new Stove(false);
    static Oven oven = new Oven(false);

    // East Wall
    static Poster hint = new Poster("hint");
    static Item fork = new Item("fork");

    // South Wall
    static Item flour = new Item("flour");
    static Noodle noodle = new Noodle();
    static Candle candle = new Candle(false);
    static Containment drawer1 = new Containment(noodle, flour, false);
    static Containment drawer2 = new Containment(candle, null, false);
    static Switch faucet = new Switch("faucet", false);

    // Constructor
    public Item(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

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