import java.util.*;

public class Walls extends Item {

    /**
     * Attributes
     */
    String direction;
    static HashMap<String, List<Item>> wallContents;

    /**
     * Constructor
     */
    public Walls() {
        super("<Name Unknown>");
    }

    /**
     * Initializes the 4 walls
     */
    public static void setupWalls() {
        wallContents = new HashMap<>();

        wallContents.put("face north", new ArrayList<>(Arrays.asList(fridge, balloon, light, todoList, cakeRecipe, door)));
        wallContents.put("face west", new ArrayList<>(Arrays.asList(pot, stove, oven, cabinet)));
        wallContents.put("face east", new ArrayList<>(Arrays.asList(poster, fork)));
        wallContents.put("face south", new ArrayList<>(Arrays.asList(faucet, drawer1, drawer2)));

    }

    /**
     * Shows what the player should see when facing certain direction and shows one digit of the password conditionally
     * @param direction which wall the player is facing
     */
    public void showWallContents(String direction) {

        if (!Game.lightOn) {
            if ("face east".equals(direction)) {
                System.out.println("It is dark. You can barely make out a number 3 on the wall.");
            } else {
                System.out.println("It's too dark to see anything. Try facing other walls.");
            }
            return;
        }
        List<Item> items = wallContents.get(direction);
        if (items != null) {
            if ("face east".equals(direction)) {
                System.out.println("You are facing East. You see:");
                for (Item item : items) {
                    System.out.println("- " + item.getName());
                }
            }
            if ("face north".equals(direction)) {
                System.out.println("You are facing North. You see:");
                for (Item item : items) {
                    System.out.println("- " + item.getName());
                }
            }
            if ("face west".equals(direction)) {
                System.out.println("You are facing West. You see:");
                for (Item item : items) {
                    System.out.println("- " + item.getName());
                }
            }
            if ("face south".equals(direction)) {
                System.out.println("You are facing South. You see:");
                for (Item item : items) {
                    System.out.println("- " + item.getName());
                }
            }
        } else {
            System.out.println("You are facing an unknown direction.");
        }
    }
}
