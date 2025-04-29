public class Candle extends Switch {
    
    public Candle () {
        super("candle");
    }

    public static boolean light () {
        if (Stove.turnOn()) {
            return true;
        } return false;
    }
}
