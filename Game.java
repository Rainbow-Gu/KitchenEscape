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
            System.out.println("Explore the 4 walls around you and find a way out...");
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
                } else {
                    System.out.println("You cannot access the fridge from here.");
                }
                break;
            case "TAKE EGG":
                if (walls.wallContents.get(currentDirection).contains(fridge)) {
                    addItem(egg);
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
                if (walls.wallContents.get(currentDirection).contains(key)) {
                    addItem(key);
                    System.out.println("You found the key!");
                } else {
                    System.out.println("You cannot take the key from here.");
                }
                break;
            case "READ TODO LIST":
                System.out.println("1. Make Noodle\n2. Bake Cake");
                break;
            case "READ CAKE RECIPE":
                System.out.println("To make a cake you need: flour, an egg, and a baking pan in the oven.");
                break;
            case "READ POSER":
                System.out.println("🍜 ～ 🎂 ～ 💡");
                break;
            case "TURN OFF SWITCH":
                lightOn = false;
                System.out.println("The room is dark.");
                walls.showWallContents(currentDirection);
                break;
            case "TURN ON SWITCH":
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
                if (walls.wallContents.get(currentDirection).contains(noodle)) {
                    addItem(noodle);
                } else {
                    System.out.println("You can’t take the noodle from here.");
                }
                break;
            case "TAKE FLOUR":      
                if (walls.wallContents.get(currentDirection).contains(flour)) {
                    addItem(flour);
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
            case "CLOSE DRAWER1":
                if (walls.wallContents.get(currentDirection).contains(drawer1)) {
                    drawer1.close();
                } else {
                    System.out.println("You can’t access the drawer from here.");
                }
                break;
            case "CLOSE DRAWER2":
                if (walls.wallContents.get(currentDirection).contains(drawer1)) {
                    drawer1.close();
                } else {
                    System.out.println("You can’t access the drawer from here.");
                }
                break;
            case "TAKE CANDLE":
                if (walls.wallContents.get(currentDirection).contains(candle)) {
                    addItem(candle);
                } else {
                    System.out.println("You can’t take the candle from here.");
                }
                break;
            case "TURN ON FAUCET":
                if (walls.wallContents.get(currentDirection).contains(faucet)) {
                    faucet.turnOn();
                } else {
                    System.out.println("You can’t access the faucet from here.");
                }
                break;
            case "FILL POT": 
                if (walls.wallContents.get(currentDirection).contains(faucet)) {
                    faucet.fillPot(pot, true);
                } else {
                    System.out.println("You can’t fill the pot from here.");
                }
                break;
            case "TURN OFF FAUCET":
                if (walls.wallContents.get(currentDirection).contains(faucet)) {
                    faucet.turnOff();
                } else {
                    System.out.println("You can’t access the faucet from here.");
                }
                break;
            case "PUT POT ON STOVE":
                if (walls.wallContents.get(currentDirection).contains(stove)) {
                    stove.addItemStove(pot);
                } else {
                    System.out.println("You can’t put the pot on the stove from here.");
                }
                break;
            case "TURN ON STOVE":
                if (walls.wallContents.get(currentDirection).contains(stove)) {
                    stove.turnOn();
                    System.out.println("Stove is on. Water boiling…");
                } else {
                    System.out.println("You can’t turn on the stove from here.");
                }
                break;
            case "PUT NOODLE IN POT":
                bowl.addFood(noodle);
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
                if (walls.wallContents.get(currentDirection).contains(bowl)) {
                    addItem(bowl);
                    System.out.println("You took the bowl.");
                } else {
                    System.out.println("You can’t take the bowl from here.");
                }
                break;
            case "TAKE PAN":
                if (walls.wallContents.get(currentDirection).contains(pan)) {
                    addItem(pan);
                    System.out.println("You took the pan.");
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
            case "PUT NOODLE IN BOWL":
                bowl.addFood(noodle);
                System.out.println("Cooked noodle is in bowl, ready to eat.");
                break;
            case "TAKE FORK":
                if (walls.wallContents.get(currentDirection).contains(fork)) {
                    addItem(fork);
                    System.out.println("You took the fork.");
                } else {
                    System.out.println("You can’t take the fork from here.");
                }
                break;
            case "EAT NOODLE":
                if (walls.wallContents.get(currentDirection).contains(fork)) {
                    noodle.eat();
                } else {
                    System.out.println("You can’t eat the noodle from here.");
                }
                break;
            case "PUT EGG IN PAN":
                pan.addFood(egg);
                System.out.println("Egg is in pan.");
                break;
            case "PUT FLOUR IN PAN":
                pan.addFood(flour);
                System.out.println("Egg is in pan.");
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
                    System.out.println("Pan is in oven.");
                } else {
                    System.out.println("You can’t put the pan in the oven from here.");
                }
                break;
            case "TURN ON OVEN":
                if (walls.wallContents.get(currentDirection).contains(oven)) {
                    oven.turnOn();
                    System.out.println("Oven is on. Baking...");
                } else {
                    System.out.println("You can’t turn on the oven from here.");
                }
                break; 
            case "TAKE CAKE":
                if (walls.wallContents.get(currentDirection).contains(oven)) {
                    addItem(cake);
                    System.out.println("You took the cake.");
                } else {
                    System.out.println("You can’t take the cake from here.");
                }
                break;
            case "LIGHT CANDLE":
                if (walls.wallContents.get(currentDirection).contains(stove)) {
                    candle.light();
                    System.out.println("Candle is lit.");
                } else {
                    System.out.println("You can’t light the candle from here.");
                }
                break;
            case "PUT CANDLE ON CAKE":
                cake.burnt();
                System.out.println("Candle is on the cake.");
                break;
            case "OPEN DOOR":
                System.out.println("The door is locked. Please type the 3-digit password:");
                // Then handle input like scanner.nextLine() again
                break;
            case "123":
                System.out.println("Congratulations, you WIN!");
                System.exit(0);
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
            System.out.println("You didn't start the game. Exiting...");
        }

        // Initialize game state...
        Game game = new Game();  // Your Game class holds objects, room layout, etc.
        game.start();            // Start game logic in a method

        scanner.close();
    }
}
