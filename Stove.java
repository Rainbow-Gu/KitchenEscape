import java.util.ArrayList;

public class Stove extends Switch {

    ArrayList<Item> items;

    public boolean checkPot () {
        if (items.contain(Pot)) {
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