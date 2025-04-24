import java.util.ArrayList;

public class Containment {
    
    /**
     * Attributes
     */

    boolean openClose; //true if it is open
    boolean lock; // whether the item is locked, if doesn't have a lock, set this never is false
    ArrayList<Item> items;

    public boolean open() {
        openClose = true;
        return openClose;
    }

    public boolean close() {
        openClose = false;
        return openClose;
    }
}
