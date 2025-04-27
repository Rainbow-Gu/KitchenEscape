import java.util.Scanner;

public class Game {
    
    public static void main(String[] args) {

        Item egg = new Item();
        Item flourFlour = new Item();
        Item fork = new Item();
        Item key = new Item();

        Utility bowl = new Utility();
        Utility pot = new Pot();
        Utility pan = new Utility();

        Containment drawer1 = new Containment(knife, fork);
        Containment drawer2 = new Containment(noodle, flour);
        Containment drawer3 = new Containment(candle, null);
        Containment fridge = new Containment(egg, null);




        Scanner input = new Scanner(System.in);
        
    }
}
