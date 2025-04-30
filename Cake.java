public class Cake extends Item {
    
    public Cake () {
        super("cake");
    }

    public boolean eatCondition() {
        if (Inventory.collection.contains("candle") && Candle.light()) {
            if (Inventory.collection.contains("fork") && Inventory.collection.contains("cake")) {
                return true; 
            } return false; 
        } return false; 
    }

    public void eat() {
        if(eatCondition()){
            Inventory.removeItem(this);
            System.out.println(1);
        } else {
            System.out.println("Cake not ready to eat.");
        }
    }

}
