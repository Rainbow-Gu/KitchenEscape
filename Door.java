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
     * Checks if the password is correct and opens the door
     * @param password the 3 digits input by the player
     * @return true if the password is correct
     */
    public boolean open(int password) {
        if (password == 213) {
            return true;
        } else {
            return false;
        }
    }
}