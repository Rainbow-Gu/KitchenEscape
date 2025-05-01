public class Cake extends Item {
    
    public Cake () {
        super("cake");
    }

    public boolean eatCondition() {
        if (collection.contains(candle) && Candle.light()) {
            if (collection.contains(fork) && collection.contains(cake)) {
                return true; 
            } return false; 
        } return false; 
    }

    public void eat() {
        if(eatCondition()){
            removeItem(this);
            System.out.println(1);
        } else {
            System.out.println("Cake is not ready to eat.");
        }
    }

}
