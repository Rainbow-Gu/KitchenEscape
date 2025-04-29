public class Faucet extends Switch{
    
    public Faucet () {
        super("faucet");
    }

    public void fillPot(Pot pot){
        if(Inventory.collection.contains(pot)) {
            pot.fillWater();
        }
        else {
            System.out.println("Method inapplicable.");
        }
    }
}
