public class Candle extends Switch {
    
    public Candle (String name) {
        super(name);
    }

    public boolean light () {
        if (stove.turnOff() == true) {
            return true;
        } return false;
    }
}
