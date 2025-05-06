public class Switch extends Item{

    /**
     * Attributes
     */
    boolean onOff; //true if switch is on

    /**
     * Constructor
     * @param name name of the switch instance
     * @param onOff true if it is on
     */
    public Switch (String name, boolean onOff) {
        super(name);
        this.onOff = onOff;
    }

    /**
     * Accessor for name
     */
    public String getName() {
        return name;
    }

    /**
     * Turns on Switch
     * @return true to turn on the switch
     */
    public boolean turnOn() {
        onOff = true;
        return onOff;
    }

    /**
     * Turns off Switch
     * @return false to turn off the switch
     */
    public boolean turnOff() {
        onOff = false;
        return onOff;
    }

    /**
     * checks if the switch is on
     * @return true if it is true
     */
    public boolean checkSwitch() {
        return onOff;
    }
}
