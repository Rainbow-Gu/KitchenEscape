import java.util.*;

public class Game extends Item {

    String direction;
    HashMap<String, List<Item>> wallContents;

    public Game(String direction) {
        super("Kitchen Escape");
        this.direction = direction.toLowerCase();
        setupWalls();
        showWallContents();
    }

    private void setupWalls() {
        wallContents = new HashMap<>();

        wallContents.put("face north", Arrays.asList(fridge, balloon, light, todoList, cakeRecipe));
        wallContents.put("face west", Arrays.asList(pot, stove, oven, cabinet));
        wallContents.put("face east", Arrays.asList(hint, fork)); // REMEMBER number that shows when light close
        wallContents.put("face south", Arrays.asList(faucet, drawer1, drawer2));

    }

    private void showWallContents() {
        List<Item> items = wallContents.get(direction);
        System.out.println(items);
        if (items != null) {
            System.out.println("You are facing " + direction + ". You see:");
            for (Item item : items) {
                System.out.println("- " + item);
            }
        } else {
            System.out.println("You are facing an unknown direction.");
        }
    }

    public static void main(String[] args) {
        System.out.println("intro:");
        System.out.println("Which direction do you want to face? (north / south / east / west)");
        Scanner scanner = new Scanner(System.in);
        String inputDirection = scanner.nextLine();

        Game game = new Game(inputDirection);
        game.setupWalls();
        game.showWallContents();

        scanner.close(); // optional, good practice
    }
}
