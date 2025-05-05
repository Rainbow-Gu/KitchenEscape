public class Cake extends Item {
    
    public Cake () {
        super("cake");
    }

    public boolean burnCondition() {
        if (candle.lit()) {
            if (collection.contains(cake)) {
                return true; 
            } return false; 
        } return false; 
    }

    public void burnt() {
        if(burnCondition()){
            removeItem(this);
            System.out.println("Candle is on the cake. As it burns, you see the number 1 on it.");
        } else {
            System.out.println("Action inapplicable.");
        }
    }

}
