import java.util.ArrayList;

public class Stove extends Switch {

    /**
     * Attributes
     */
    ArrayList<Item> items; //list of items on the stove

    /**
     * Constructor
     * @param onOff true if stove is on
     */
    public Stove (boolean onOff) {
        super("stove", onOff);
        items = new ArrayList<Item>();
    }

    /**
     * Checks if pot is on the stove and there is noodle in the pot
     * @return true if pot is ready
     */
    public boolean checkPot () {
        if (items.contains(pot) && pot.containItems.contains(noodle) ) {
            if(pot.isFilled()){
                return true;
            } else {
                return false;
            }
        } return false;
    }

    /**
     * Adds item (pot) to stove
     * @param i pot
     */
    public void addItemStove (Item i) {
        items.add(i);
    }

    /**
     * Cooks noodle when the pot is ready and the stove is on
     */
    public void cook () {
        if(this.checkPot()) {
            if (this.checkSwitch()) {
                if (noodle.isCooked()){
                    System.out.println("Noodle is already cooked.");
                } else {
                    System.out.println("Cooking...");
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

    /**
     * Adds cooked noodle to bowl
     * @param bowl bowl
     * @param noodle cooked noodle
     * @return true if action is accomplished
     */
    public boolean addToBowl (Utility bowl, Noodle noodle) {
        if (noodle.isCooked()) {
            bowl.addFood(noodle);
            return true;
        } return false;
    }
}