public class Noodle extends Item {
    
    static boolean cooked;

    public Noodle(){
        super("noodle");
        cooked = false;
    }

    public static boolean isCooked() {
        return cooked;
    }

    public static void setCooked() {
        cooked = true;
    }

    // QUESTION - make it a string? these can also happen in game
    public boolean eatCondition() {
        if (Inventory.collection.contains(bowl)) {
            if (cooked && Inventory.collection.contains(fork)) {
                cooked = true;
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
