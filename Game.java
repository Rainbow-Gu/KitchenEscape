import java.util.Scanner;

public class Game {

    Switch light = new Switch("light");
    Switch faucet = new Switch("faucet");
    Pot pot = new Pot("pot");

    public void showNumOnly(){
        if (light.getName().equalsIgnoreCase("light")) {
            if(light.checkSwitch()) {
                // show number on WallE
            }
        } else {
            System.out.println("Method inapplicable.");
        }
    }

    public void fillPot(){
        if (faucet.getName().equalsIgnoreCase("faucet")) {
            if(Inventory.exist(pot)) {
              pot.fillWater();
            }
        } else {
            System.out.println("Method inapplicable.");
        }
    }
    
    public static void main(String[] args) {

        Item egg = new Item("egg");
        Item flour = new Item("flour");
        Item fork = new Item("fork");
        Item key = new Item("key");

        Utility bowl = new Utility("bowl");
        Pot pot = new Pot("pot");
        Utility pan = new Utility("pan");

        // create cake after checks all procedure
        

        Containment drawer1 = new Containment(knife, fork);
        Containment drawer2 = new Containment(noodle, flour);
        Containment drawer3 = new Containment(candle, null);
        Containment fridge = new Containment(egg, null);




        Scanner input = new Scanner(System.in);
        
    }
}
