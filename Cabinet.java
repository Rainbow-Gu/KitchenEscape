public class Cabinet extends Containment {

    //Constructor
    public Cabinet (Item item1, Item item2, boolean openClose) {
        super(item1, item2, openClose);
        items.add(item1);
        items.add(item2);
    }

    public boolean open () {
        if (collection.contains(key)) {
            openClose = true;
            System.out.println("The door of the cabinet is open.");
            return openClose;
        } else {
            return false;
        }
    }

}