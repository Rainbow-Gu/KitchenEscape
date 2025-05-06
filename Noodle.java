public class Noodle extends Item {
    
    /**
     * Attributes
     */
    static boolean cooked; //true if noodle is cooked

    /**
     * Constructor
     */
    public Noodle(){
        super("noodle");
        cooked = false;
    }

    /**
     * checks if noodle is cooked
     * @return true if noodle is cooked
     */
    public boolean isCooked() {
        return cooked;
    }

    /**
     * sets the status of noodle to being cooked
     */
    public void setCooked() {
        cooked = true;
    }

    /**
     * checks if noodle is ready to eat
     * @return true if noodle is ready to eat
     */
    // QUESTION - make it a string? these can also happen in game
    public boolean eatCondition() {
        if (collection.contains(bowl) && bowl.containItems.contains(noodle)) {
            if (stove.addToBowl(bowl, noodle) && collection.contains(fork)) {
                return true;
            } return false; 
        } return false;
    }
    
    /**
     * shows one digit of the password
     */
    public void eat() {
        if(eatCondition()){
            removeItem(this);
            System.out.println("A number shows up on the outside of the bowl because of heat. It is 2.");
        } else {
            System.out.println("Noodle is not ready.");
        }
    }
}
