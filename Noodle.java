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
        if (stove.addToBowl() && collection.contains(fork)) {
            return true;
        } return false;
    }

    public void eat() {
        if(eatCondition()){
            removeItem(this);
            System.out.println("A number shows up on the outside of the bowl because of heat. It is 2.");
        } else {
            System.out.println("Noodle is not ready.");
        }
    }

}
