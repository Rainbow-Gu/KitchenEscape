public class Faucet extends Switch{
    
    public Faucet () {
        super("faucet", false);

    }

    public void fillPot(){
        if(collection.contains(pot) && this.onOff == true) {
            pot.fillWater();
            System.out.println("Pot is filled with water.");
        } else {
            System.out.println("Method inapplicable.");
        }
    }
}
