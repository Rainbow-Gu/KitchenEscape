public class Poster extends Item{
    
    //Attributes
    String type; //todo list, cake recipe, or hint for password

    public Poster (String type) {
        super("poster");
        this.type = type;
    }

    public void read (String type) {
        if (type == "todoList") {
            System.out.println("Things to do on birthday:\n-make and eat a cake\n-eat noodles");
        } if (type == "cakeRecipe") {
            System.out.println("You need an egg and some flour to a cake.");
        } if (type == "hint") {
            System.out.println("1 from cake, 2 from noodle, 3 from wall");
        }
    }
}
