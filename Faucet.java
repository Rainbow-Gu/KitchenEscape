public class Faucet extends Switch{
    
    public Faucet (boolean onOff) {
        super("faucet", onOff);
    }

    public void fillPot(Pot pot){
        if(collection.contains(pot)) {
            pot.fillWater();
        } else {
            System.out.println("Method inapplicable.");
        }
    }
}
