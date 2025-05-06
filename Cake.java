public class Cake extends Item {
    
    /**
     * Constructor
     */
    public Cake () {
        super("cake");
    }

    /**
     * checks if candle is lit and the player has made a cake
     * @return true if conditions are met
     */
    public boolean burnCondition() {
        if (candle.lit()) {
            if (collection.contains(cake)) {
                return true; 
            } return false; 
        } return false; 
    }

    /**
     * shows one digit of the password
     */
    public void burnt() {
        if(burnCondition()){
            removeItem(this);
            System.out.println("Candle is on the cake. As it burns, you see the number 1 on it.");
        } else {
            System.out.println("Action inapplicable.");
        }
    }
}
