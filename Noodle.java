public class Noodle extends Item {
    
    private boolean cooked;

    public Noodle(String name){
        super(name);
        this.cooked = false;
    }

    // QUESTION - make it a string? these can also happen in game
    public boolean eatCondition() {

        if (Inventory.collection.contains("bowl")) {
            if (cooked && Inventory.collection.contains("fork")) {
                this.cooked = true;
                return true; 
            } return false; 
        } return false; 
    }

    public void eat() {
        if(eatCondition()){
            Inventory.removeItem(this);
        } else {
            System.out.println("Noodle not ready.");
        }
    }

}
