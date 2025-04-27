import java.util.ArrayList;

public class Oven extends Switch {

    /*
     * Attributes
     */

    boolean opened; 
    ArrayList<Item> items;

    public void open () {
        opened = true;
    }
    
    public void close () {
        opened = false;
    }

    public void addItem (Item i) {
        items.add(i);
    }

    public boolean checkPan () {
        if (items.contain(Pot)) {
            return true;
        }
        return false;
    }

    public cook() {
        
    }
}