public class Pot extends Utility {

    boolean waterFill;

    public Pot(String name){
        super(name);
    }

    public void fillWater() {
        this.waterFill = true;
    }

    public boolean isFilled() {
        return waterFill;
    }
    
    
}