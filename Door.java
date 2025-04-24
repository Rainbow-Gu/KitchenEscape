public class Door extends Containment {

    /*
     * Attributes
     */
    int password;

    public boolean open() {
        if (password == 835) {
            lock = false;
            openClose = true;
            return openClose;
        }
        return false;
    }
}