import java.util.ArrayList;

public class Cabinet extends Containment {

    //Constructor
    public Cabinet (Utility item1, Pot item2) {
        super(item1,item2);
        items.add(item1);
        items.add(item2);
    }

    public boolean open () {
        if (collection.contains("key")) {
            openClose = true;
            System.out.println("The door of the cabinet is open.");
            return openClose;
        }
    }

}