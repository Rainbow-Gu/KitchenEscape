import java.util.ArrayList;

public class Stove extends Switch {

    ArrayList<Item> items;

    public Stove (String name) {
        super(name);
    }

    public boolean checkPot () {
        if (collection.contain("pot")) {
            return true;
        }
        return false;
    }

    public void addItem (Item i) {
        items.add(i);
    }

    public void cook () {}

    public void addToBowl () {}
}