public class Candle extends Switch {
    
    /**
     * Constructor
     * @param onOff true if the candle is lit
     */
    public Candle (boolean onOff) {
        super("candle", onOff);
    }

    /**
     * 
     * @return true if the candle is lit
     */
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

    /**
     * lights the candle
     * @return true if candle is lit
     */
    public boolean lit() {
        return lightCandle(); 
    }
}
