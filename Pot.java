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
     * Fills the pot
     */
    public void fillWater() {
        waterFill = true;
    }

    /**
     * Check if pot is filled with water
     * @return true if pot is filled
     */
    public boolean isFilled() {
        return waterFill;
    }
}