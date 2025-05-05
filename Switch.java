public class Switch extends Item{

    /**
     * Attributes
     */
    boolean onOff; //On = true, Off = false

    public Switch (String name, boolean onOff) {
        super(name);
        this.onOff = onOff;
    }

    public String getName() {
        return name;
    }
    public boolean turnOn() {
        onOff = true;
        return onOff;
    }

    public boolean turnOff() {
        onOff = false;
        return onOff;
    }

    public boolean checkSwitch() {
        return onOff;
    }

}
