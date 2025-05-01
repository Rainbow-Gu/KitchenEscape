import java.util.*;

public class Walls extends Item {

    String direction;
    static HashMap<String, List<Item>> wallContents;

    public Walls() {
        super("<Name Unknown>");
    }

    public static void setupWalls() {
        wallContents = new HashMap<>();

        wallContents.put("face north", Arrays.asList(fridge, balloon, light, todoList, cakeRecipe));
        wallContents.put("face west", Arrays.asList(pot, stove, oven, cabinet));
        wallContents.put("face east", Arrays.asList(poster, fork)); // REMEMBER number that shows when light close
        wallContents.put("face south", Arrays.asList(faucet, drawer1, drawer2));

    }

    public void showWallContents(String direction) {

        if (!Game.lightOn) {
            if ("face east".equals(direction)) {
                System.out.println("It is dark. You can barely make out a number 3 on the wall.");
            } else {
                System.out.println("It's too dark to see anything. Try turning around");
            }
            return;
        }
        List<Item> items = wallContents.get(direction);
        if (items != null) {
            System.out.println("You are facing " + direction + ". You see:");
            for (Item item : items) {
                System.out.println("- " + item.getName());
            }
        } else {
            System.out.println("You are facing an unknown direction.");
        }
    }
}
