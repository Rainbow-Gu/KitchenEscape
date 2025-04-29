import java.util.ArrayList;

public class Oven extends Switch {

    /*
     * Attributes
     */

    boolean opened; 
    ArrayList<Item> items;

    public Oven (String name){
        super(name);
    }

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
        if (collection.contains("pot")) {
            return true;
        }
        return false;
    }

    public void cook() {
        
    }
}