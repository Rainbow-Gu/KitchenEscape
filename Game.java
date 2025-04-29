import java.util.Scanner;

public class Game {

    Switch light = new Switch("light");
    Switch faucet = new Switch("faucet");
    Pot pot = new Pot();
    Item egg = new Item("egg");
    Item flour = new Item("flour");
    Item fork = new Item("fork");
    Item key = new Item("key");

    Utility bowl = new Utility("bowl");
    Utility pan = new Utility("pan");
    Noodle noodle = new Noodle();
    Candle candle = new Candle();
    Inventory collection = new Inventory();
    Containment drawer1 = new Containment(fork, null);
    Containment drawer2 = new Containment(noodle, flour);
    Containment drawer3 = new Containment(candle, null);
    Containment fridge = new Containment(egg, null);
    Cabinet cabinet = new Cabinet(bowl, pot);


    
    public static void main(String[] args) {

        

        // create cake after checks all procedure
        

        

        Scanner input = new Scanner(System.in);
        
    }
}
