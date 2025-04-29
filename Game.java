import java.util.Scanner;

public class Game {

    Switch light = new Switch("light");
    Switch faucet = new Switch("faucet");
    Pot pot = new Pot("pot");
    Item egg = new Item("egg");
    Item flour = new Item("flour");
    Item fork = new Item("fork");
    Item key = new Item("key");

    Utility bowl = new Utility("bowl");
    Utility pan = new Utility("pan");
    Noodle noodle = new Noodle("noodle");
    Candle candle = new Candle("candle");
    Inventory collection = new Inventory();
    Containment drawer1 = new Containment(fork, null);
    Containment drawer2 = new Containment(noodle, flour);
    Containment drawer3 = new Containment(candle, null);
    Containment fridge = new Containment(egg, null);
    Cabinet cabinet = new Cabinet(bowl, pot);

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

        

        // create cake after checks all procedure
        

        

        Scanner input = new Scanner(System.in);
        
    }
}
