public class Pot extends Utility {

    /**
     * Attributes
     */
    boolean waterFill; //true if pot is filled with water

    /**
     * Constructor
     */
    public Pot(){
        super("pot");
    }

    /**
     * fills the pot
     */
    public void fillWater() {
        waterFill = true;
    }

    /**
     * check if pot is filled with water
     * @return true if pot is filled
     */
    public boolean isFilled() {
        return waterFill;
    }
}