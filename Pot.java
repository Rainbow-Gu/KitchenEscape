public class Pot extends Utility {

    boolean waterFill;

    public Pot(){
        super("pot");
    }

    public void fillWater() {
        waterFill = true;
    }

    public boolean isFilled() {
        return waterFill;
    }
}