import java.util.ArrayList;

public class Stove extends Switch {

    ArrayList<Item> items;

    public Stove (boolean onOff) {
        super("stove", onOff);
        items = new ArrayList<Item>();
    }

    public boolean checkPot () {
        if (collection.contains(pot) && collection.contains(noodle) ) {
            if(pot.isFilled()){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void addItemStove (Item i) {
        items.add(i);
    }

    public void cook () {
        if(this.checkPot()) {
            if (this.checkSwitch()) {
                if (noodle.isCooked()){
                    System.out.println("Noodle is already cooked.");
                } else {
                    System.out.println("Stove is on. Cooking...");
                    noodle.setCooked();
                    System.out.println("Noodle is cooked!");
                }
            } else {
                System.out.println("Stove is off. Turn it on first.");
            }
        } else {
            System.out.println("You don't have a ready pot yet.");
        }
    }

    public boolean addToBowl (Utility bowl, Noodle noodle) {
        if (noodle.isCooked()) {
            bowl.addFood(noodle);
            return true;
        } return false;
    }
}