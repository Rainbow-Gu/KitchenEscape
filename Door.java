public class Door extends Item {

    /*
     * Attributes
     */
    int password;

    public Door() {
        super("door");
    }

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