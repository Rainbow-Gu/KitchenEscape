import java.util.*;

public class Game extends Item{

    String direction;
    Map<String, List<Item>> wallContents;

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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which direction do you want to face? (face north / face south / face east / face west)");
        String inputDirection = scanner.nextLine();

        new Game(inputDirection);

        scanner.close(); // optional, good practice
    }
}
