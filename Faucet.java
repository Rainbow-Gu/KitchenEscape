public class Faucet extends Switch{
    
    public Faucet (boolean onOff) {
        super("faucet", onOff);
    }

    public void fillPot(Pot pot, boolean OnOff){
        if(collection.contains(pot) && OnOff == true) {
            pot.fillWater();
            System.out.println("Pot is filled with water.");
        } else {
            System.out.println("Method inapplicable.");
        }
    }
}
