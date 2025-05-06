public class Door extends Item {

    /*
     * Attributes
     */
    int password;

    /**
     * Constructor
     */
    public Door() {
        super("door");
    }

    /**
     * checks if the password is correct and opens the door
     * @param password the 3 digits input by the player
     * @return true if the password is correct
     */
    public boolean open(int password) {
        if (password == 123) {
            System.out.println("Hooray! You have successfully complete the game!");
            return true;
        } else {
            System.out.println("No! The password is incorrect.");
            return false;
        }
    }
}