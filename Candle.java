public class Candle extends Switch {
    

    public Candle (boolean onOff) {
        super("candle", onOff);
    }

    public static boolean light () {
        if (Stove.turnOn()) {
            return true;
        } return false;
    }
}
