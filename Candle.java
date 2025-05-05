public class Candle extends Switch {
    

    public Candle (boolean onOff) {
        super("candle", onOff);
    }

    public boolean lightCandle () {
        if (stove.turnOn() && collection.contains(candle)) {
            System.out.println("Candle is lit.");
            onOff = true;
            return onOff;
        } else {
            System.out.println("You can't light the candle.");
            onOff = false;
            return onOff;
        }
    }

    public boolean lit() {
        return lightCandle(); 
    }
}
