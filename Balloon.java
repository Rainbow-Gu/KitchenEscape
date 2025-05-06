public class Balloon extends Item{
    
    /**
     * Attributes
     */
    private boolean popped = false; //false if balloon is intact

    /**
     * Constructor
     */
    public Balloon (){
        super("Balloon");
    }
    
    /**
     * Pops the balloon to get the key
     */
    public void pop () {

        if (collection.contains(fork)) {
            popped = true;
            System.out.println("Pop! The balloon bursts. You see a piece of key!");
        } else {
            System.out.println("You need a fork to pop the balloon.");
        }
    }

    /**
     * Check if the balloon is popped
     * @return true if the balloon is popped
     */
    public boolean isPopped() {
        return popped;
    }
}
