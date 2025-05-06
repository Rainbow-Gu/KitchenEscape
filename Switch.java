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
     * accessor for name
     */
    public String getName() {
        return name;
    }

    /**
     * turns on
     * @return true if it is on
     */
    public boolean turnOn() {
        onOff = true;
        return onOff;
    }

    /**
     * turns off
     * @return false if it is off
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
