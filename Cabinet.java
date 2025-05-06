import java.util.ArrayList;

public class Cabinet extends Containment {

    /**
     * Constructor
     * @param name cabinet
     * @param item1 one item in the cabinet
     * @param item2 another item in the cabinet
     * @param openClose true if cabinet is open
     */
    public Cabinet (String name, Item item1, Item item2, boolean openClose) {
        super(name, item1, item2, openClose);
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(item1);
        items.add(item2);
    }

    /**
     * checks if the player has gotten the key, opens the cabinet, and shows what it contains
     * @return true if cabinet is open
     */
    public boolean open() {
        if (collection.contains(key)) {
            if (!openClose) {
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
        } else {
            System.out.println("The door of the cabinet is locked.");
            return false;
        }
    }
}

