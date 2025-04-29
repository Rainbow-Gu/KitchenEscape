public class Pot extends Utility {

    static boolean waterFill;

    public Pot(){
        super("pot");
    }

    public void fillWater() {
        waterFill = true;
    }

    public static boolean isFilled() {
        return waterFill;
    }
    
    
}