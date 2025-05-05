import java.util.ArrayList;

public class Containment extends Item {
    
    /**
     * Attributes
     */

    boolean openClose; //true if it is open
    ArrayList<Item> items;

    //Constructor
    public Containment (String name, Item i1, boolean openClose) {
        super(name);
        this.items = new ArrayList<Item>();
        items.add(i1);
    }
    public Containment (String name, Item i1, Item i2, boolean openClose) {
        super(name);
        this.items = new ArrayList<Item>();
        items.add(i1);
        items.add(i2);
    }
    
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

    public boolean close() {
        openClose = false;
        return openClose;
    }
}
