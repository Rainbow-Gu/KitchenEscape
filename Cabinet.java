import java.util.ArrayList;

public class Cabinet extends Containment {

    //Constructor
    public Cabinet (String name, Item item1, Item item2, boolean openClose) {
        super(name, item1, item2, openClose);
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(item1);
        items.add(item2);
    }

    public boolean open () {
        if (collection.contains(key)) {
            openClose = true;
            System.out.println("You found a(n) " + items.get(0).getName()+ " and " + items.get(1).getName() + ".");
            return openClose;
        } else {
            System.out.println("The door of the cabinet is locked.");
            return false;
        }
        }
}

