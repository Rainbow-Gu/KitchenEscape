public class Candle extends Switch {
    

    public Candle (boolean onOff) {
        super("candle", onOff);
    }

    public boolean light () {
        if (stove.turnOn()) {
            return true;
        } return false;
    }
}
