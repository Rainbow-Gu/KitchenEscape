import java.util.ArrayList;

public class Cabinet extends Containment {

    //Constructor
    public Cabinet () {
        super(new Bowl(),new Pot());
        items.add(new Bowl());
        items.add(new Pot());
    }

    public boolean open () {
        if (Inventory.exist(key)) {
            openClose = true;
            System.out.println("The door of the cabinet is open.");
            return openClose;
        }
    }

}