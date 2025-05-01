public class Cake extends Item {
    
    public Cake () {
        super("cake");
    }

    public boolean burnCondition() {
        if (collection.contains(candle) && candle.light()) {
            if (collection.contains(fork) && collection.contains(cake)) {
                return true; 
            } return false; 
        } return false; 
    }

    public void burnt() {
        if(burnCondition()){
            removeItem(this);
            System.out.println(1);
        } else {
            System.out.println("Cake is not ready for celebration.");
        }
    }

}
