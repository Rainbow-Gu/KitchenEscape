import java.util.Scanner;

public class Game extends Item{

    private static String currentDirection = "face north"; // default starting direction
    private Walls walls;
    static boolean lightOn = true; // true if light is on

    public Game() {
        super("Kitchen Escape");
        walls = new Walls();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String command;
        System.out.println("It is your birthday, but you are locked in the kitchen...");
        
        walls.showWallContents(currentDirection);

        while (true) {
            System.out.print("> ");
            command = scanner.nextLine().trim().toUpperCase();

            // Handle quit
            if (command.equals("QUIT") || command.equals("EXIT")) {
                System.out.println("Thanks for playing!");
                break;
            }
            // Pass command to handler
            handleCommand(command);
        }

        scanner.close();
    }

    private void handleCommand(String command) {
        switch (command) {
            case "FACE NORTH":
                currentDirection = command.toLowerCase();
                walls.showWallContents(currentDirection);
                break;
            case "FACE SOUTH":
                currentDirection = command.toLowerCase();
                walls.showWallContents(currentDirection);
                break;
            case "FACE EAST":
                currentDirection = command.toLowerCase();
                walls.showWallContents(currentDirection);
                break;
            case "FACE WEST":
                currentDirection = command.toLowerCase();
                walls.showWallContents(currentDirection);
                break;
            case "OPEN FRIDGE":
                if (Walls.wallContents.get(currentDirection).contains(fridge)) {
                    fridge.open();
                } else {
                    System.out.println("You cannot access the fridge from here.");
                }
                break;
            case "CLOSE FRIDGE":
                if (walls.wallContents.get(currentDirection).contains(fridge)) {
                    fridge.close();
                    System.out.println("Fridge closed.");
                } else {
                    System.out.println("You cannot access the fridge from here.");
                }
                break;
            case "TAKE EGG":
                if (walls.wallContents.get(currentDirection).contains(fridge)) {
                    fridge.take(egg);
                } else {
                    System.out.println("You cannot access the egg from here.");
                }
                break;
            case "POP BALLOON":
                if (walls.wallContents.get(currentDirection).contains(balloon)) {
                    balloon.pop();
                } else {
                    System.out.println("You cannot pop the balloon from here.");
                }
                break;
            case "TAKE KEY":
                if (walls.wallContents.get(currentDirection).contains(balloon)) {
                    if (balloon.isPopped()) {
                        addItem(key);
                    } else if (!balloon.isPopped()) {
                        System.out.println("You need to pop the balloon first.");
                    }
                } else {
                    System.out.println("You cannot take the key from here.");
                }
                break;
            case "READ TODO LIST":
                System.out.println("1. Make Noodle\n2. Bake Cake");
                break;
            case "READ CAKE RECIPE":
                System.out.println("To make a birthday cake you need: flour, an egg, and a baking pan in the oven, as well as a lit candle");
                break;
            case "READ POSTER":
                System.out.println("[🍜 ～ 🎂 ～ 💡]");
                break;
            case "TURN OFF LIGHT":
                lightOn = false;
                System.out.println("The room is dark.");
                walls.showWallContents(currentDirection);
                break;
            case "TURN ON LIGHT":
                lightOn = true;
                System.out.println("The light is on.");
                walls.showWallContents(currentDirection); // re-show what's in front
                break;
            case "TAKE POT":
                if (walls.wallContents.get(currentDirection).contains(pot)) {
                    addItem(pot);
                } else {
                    System.out.println("You can’t take the pot from here.");
                }
                break;
            case "OPEN CABINET":
                if (walls.wallContents.get(currentDirection).contains(cabinet)) {
                    cabinet.open();

                } else {
                    System.out.println("You can’t access the cabinet from here.");
                }
                break;
            case "CLOSE CABINET":
                if (walls.wallContents.get(currentDirection).contains(cabinet)) {
                    cabinet.close();
                    System.out.println("Cabinet closed.");
                } else {
                    System.out.println("You can’t access the cabinet from here.");
                }
                break;
            case "OPEN DRAWER":
                System.out.println("The drawer has 2 drawers.");
            case "OPEN DRAWER 1":
                if (walls.wallContents.get(currentDirection).contains(drawer1)) {
                    drawer1.open();
                } else {
                    System.out.println("You can’t access the drawer from here.");
                }
                break;
            case "TAKE NOODLE":
                if (walls.wallContents.get(currentDirection).contains(drawer1)) {
                    drawer1.take(noodle);
                } else {
                    System.out.println("You can’t take the noodle from here.");
                }
                break;
            case "TAKE FLOUR":      
                if (walls.wallContents.get(currentDirection).contains(drawer1)) {
                    drawer1.take(flour);
                } else {
                    System.out.println("You can’t take the flour from here.");
                }
                break;
            case "OPEN DRAWER 2":
                if (walls.wallContents.get(currentDirection).contains(drawer2)) {
                    drawer2.open();
                } else {
                    System.out.println("You can’t access the drawer from here.");
                }
                break;
            case "CLOSE DRAWER 1":
                if (walls.wallContents.get(currentDirection).contains(drawer1)) {
                    drawer1.close();
                    System.out.println("Drawer 1 closed.");
                } else {
                    System.out.println("You can’t access the drawer from here.");
                }
                break;
            case "CLOSE DRAWER 2":
                if (walls.wallContents.get(currentDirection).contains(drawer1)) {
                    drawer1.close();
                    System.out.println("Drawer 2 closed.");
                } else {
                    System.out.println("You can’t access the drawer from here.");
                }
                break;
            case "TAKE CANDLE":
                if (Walls.wallContents.get(currentDirection).contains(drawer2)) {
                    drawer2.take(candle);
                } else {
                    System.out.println("You can’t take the candle from here.");
                }
                break;
            case "TURN ON FAUCET":
                if (walls.wallContents.get(currentDirection).contains(faucet)) {
                    faucet.turnOn();
                    System.out.println("Faucet is on. Water running...");
                } else {
                    System.out.println("You can’t access the faucet from here.");
                }
                break;
            case "FILL POT": 
                if (walls.wallContents.get(currentDirection).contains(faucet)) {
                    faucet.fillPot();
                } else {
                    System.out.println("You can’t fill the pot from here.");
                }
                break;
            case "POT STATUS":
                if (pot.isFilled()){
                    System.out.println("The pot is filled with water.");
                } else {
                    System.out.println("The pot is empty.");
                }
                break;
            case "TURN OFF FAUCET":
                if (walls.wallContents.get(currentDirection).contains(faucet)) {
                    faucet.turnOff();
                    System.out.println("Faucet is off.");
                } else {
                    System.out.println("You can’t access the faucet from here.");
                }
                break;
            case "PUT POT ON STOVE":
                if (walls.wallContents.get(currentDirection).contains(stove)) {
                    stove.addItemStove(pot);
                    System.out.println("Pot is on the stove.");
                } else {
                    System.out.println("You can’t put the pot on the stove from here.");
                }
                break;
            case "TURN ON STOVE":
                if (walls.wallContents.get(currentDirection).contains(stove)) {
                    stove.turnOn();
                    System.out.println("Stove is on. Cook noodle?");
                } else {
                    System.out.println("You can’t turn on the stove from here.");
                }
                break;
            case "TURN OFF STOVE":
                if (walls.wallContents.get(currentDirection).contains(stove)) {
                    stove.turnOff();
                    System.out.println("Stove is off.");
                } else {
                    System.out.println("You can’t turn off the stove from here.");
                }
                break;
            case "TAKE BOWL":
                if (walls.wallContents.get(currentDirection).contains(cabinet)) {
                    cabinet.take(bowl);
                } else {
                    System.out.println("You can’t take the bowl from here.");
                }
                break;
            case "TAKE PAN":
                if (walls.wallContents.get(currentDirection).contains(cabinet)) {
                    cabinet.take(pan);
                } else {
                    System.out.println("You can’t take the pan from here.");
                }
                break; 
            case "COOK NOODLE":
                if (walls.wallContents.get(currentDirection).contains(stove)) {
                    stove.cook();
                } else {
                    System.out.println("You can’t cook the noodle from here.");
                }
                break;
            case "PUT NOODLE IN POT":
                pot.addFood(noodle);
                break;
            case "PUT NOODLE IN BOWL":
                bowl.addFood(noodle);
                break;
            case "TAKE FORK":
                if (walls.wallContents.get(currentDirection).contains(fork)) {
                    addItem(fork);
                } else {
                    System.out.println("You can’t take the fork from here.");
                }
                break;
            case "EAT NOODLE":
                noodle.eat();
                break;
            case "PUT EGG IN PAN":
                pan.addFood(egg);
                break;
            case "PUT FLOUR IN PAN":
                pan.addFood(flour);
                break;
            case "OPEN OVEN":
                if (walls.wallContents.get(currentDirection).contains(oven)) {
                    oven.open();
                } else {
                    System.out.println("You can’t access the oven from here.");
                }
                break;
            case "CLOSE OVEN":  
                if (walls.wallContents.get(currentDirection).contains(oven)) {
                    oven.close();
                } else {
                    System.out.println("You can’t access the oven from here.");
                }
                break;
            case "PUT PAN IN OVEN":
                if (walls.wallContents.get(currentDirection).contains(oven)) {
                    oven.addItemOven(pan);
                } else {
                    System.out.println("You can’t put the pan in the oven from here.");
                }
                break;
            case "TURN ON OVEN":
                if (walls.wallContents.get(currentDirection).contains(oven)) {
                    oven.turnOn();
                    System.out.println("Oven is on. Bake cake?");
                } else {
                    System.out.println("You can’t turn on the oven from here.");
                }
                break;
            case "TURN OFF OVEN":
                if (walls.wallContents.get(currentDirection).contains(oven)) {
                    oven.turnOff();
                    System.out.println("Oven is turned off.");
                } else {
                    System.out.println("You can’t turn on the oven from here.");
                }
                break;
            case "BAKE CAKE":
                if (walls.wallContents.get(currentDirection).contains(oven)) {
                    oven.cook();
                } else {
                    System.out.println("You can’t bake cake from here.");
                }
                break; 
            case "TAKE CAKE":
                if (walls.wallContents.get(currentDirection).contains(oven)) {
                    oven.take(cake);
                } else {
                    System.out.println("You can’t take the cake from here.");
                }
                break;
            case "PUT CANDLE ON CAKE":
                cake.burnt();
                break;
            case "OPEN DOOR":
                System.out.println("The door is locked. Please type a 3-digit password:");
                // Then handle input like scanner.nextLine() again
                break;
            case "123":
                System.out.println("Congratulations, you WIN!");
                System.exit(0);
                break;
            case "CHECK COLLECTION":
                System.out.println("You have:");
                for (Item item : Item.collection) {
                    System.out.println("- " + item.getName());
                }
                break;
            case "HELP":
                System.out.println("------------[GAME MENU - Commands]----------");
                System.out.println("|================ Actions =================|");
                System.out.println("|            'face' -> Face a direction    |");
                System.out.println("|            'take' -> Take a found item   |");
                System.out.println("|            'open' -> Open doors          |");
                System.out.println("|           'close' -> Close doors         |");
                System.out.println("|     'turn on/off' -> Turn on/off sth.    |");
                System.out.println("|             'put' -> Put sth. in/on sth. |");
                System.out.println("|             'pop' -> pop sth.            |");
                System.out.println("|            'fill' -> Fill container      |");
                System.out.println("|            'cook' -> Cook noodle         |");
                System.out.println("|            'bake' -> Bake cake           |");
                System.out.println("|             'eat' -> Eat cooked food     |");
                System.out.println("|            'read' -> Read sth.           |");
                System.out.println("|================= Helpers ================|");
                System.out.println("|'check collection' -> see what you have   |");
                System.out.println("|      'pot status' -> pot have water?     |");
                System.out.println("|       'quit/exit' -> Quit the game       |");
                System.out.println("|            'help' -> Get all commands    |");
                System.out.println("--------------[CONTINUE PLAYING]-----------");
                break;
            default:
                System.out.println("I don’t understand that command.");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Walls.setupWalls();
        // Game intro
        System.out.println("Welcome to Birthday Escape Game! Enter “START” to start the Game!");

        String input = scanner.nextLine().trim().toUpperCase();
        if (!input.equals("START")) {
            System.out.println("You didn't start the game. Bye 👋 ");
        } else  {
            System.out.println("------------[GAME MENU - Commands]----------");
            System.out.println("|================ Actions =================|");
            System.out.println("|            'face' -> Face a direction    |");
            System.out.println("|            'take' -> Take a found item   |");
            System.out.println("|            'open' -> Open doors          |");
            System.out.println("|           'close' -> Close doors         |");
            System.out.println("|     'turn on/off' -> Turn on/off sth.    |");
            System.out.println("|             'put' -> Put sth. in/on sth. |");
            System.out.println("|             'pop' -> pop sth.            |");
            System.out.println("|            'fill' -> Fill container      |");
            System.out.println("|            'cook' -> Cook noodle         |");
            System.out.println("|            'bake' -> Bake cake           |");
            System.out.println("|             'eat' -> Eat cooked food     |");
            System.out.println("|            'read' -> Read sth.           |");
            System.out.println("|================= Helpers ================|");
            System.out.println("|'check collection' -> see what you have   |");
            System.out.println("|      'pot status' -> pot have water?     |");
            System.out.println("|       'quit/exit' -> Quit the game       |");
            System.out.println("|            'help' -> Get all commands    |");
            System.out.println("--------------[CONTINUE PLAYING]------------");
            System.out.println();
            System.out.println("            |   [Game Starts]   |");
            System.out.println("            V   [Game Starts]   V");
            System.out.println("                                            ");
    
            // Initialize game state...
            Game game = new Game();  // Your Game class holds objects, room layout, etc.
            game.start();            // Start game logic in a method
    
            scanner.close();

        }
    }
}
