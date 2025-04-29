import java.util.ArrayList;

public class Stove extends Switch {

    static ArrayList<Item> items;

    public Stove () {
        super("stove");
    }

    public boolean checkPot () {
        if (Inventory.collection.contains("pot") && Inventory.collection.contains("noodle") ) {
            if(Pot.isFilled()){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void addItem (Item i) {
        items.add(i);
    }

    public void cook () {
        if(this.checkPot()) {
            if (this.checkSwitch()) {
                if (Noodle.isCooked()){
                    System.out.println("Noodle is already cooked.");
                } else {
                    System.out.println("Stove is on. Cooking...");
                    Noodle.setCooked();
                    System.out.println("Noodle is Cooked!");
                }
            } else {
                System.out.println("Stove is off. Turn it on first.");
            }
        } else {
            System.out.println("You don't have a ready pot yet.");
        }
    }

    public void addToBowl () {}
}