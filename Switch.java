public class Switch extends Item{

    /**
     * Attributes
     */
    boolean onOff; //On = true, Off = false
    String name;

    public Switch (String name, boolean onOff) {
        super(name);
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
