public class Faucet extends Switch{
    
    /**
     * Constructor
     */
    public Faucet () {
        super("faucet", false);
    }

    /**
     * Fill the pot if pot is in the collection and faucet is turned on
     */
    public void fillPot(){
        if(collection.contains(pot) && this.onOff == true) {
            pot.fillWater();
            System.out.println("Pot is filled with water.");
        } else {
            System.out.println("You do not have a container yet to hold water.");
        }
    }
}
