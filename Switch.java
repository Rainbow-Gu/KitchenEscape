public class Switch extends Item{

    /**
     * Attributes
     */
    static boolean onOff; //On = true, Off = false
    String name;

    public Switch (String name, boolean onOff) {
        super(name);
    }

    public String getName() {
        return name;
    }
    public static boolean turnOn() {
        onOff = true;
        return onOff;
    }

    public static boolean turnOff() {
        onOff = false;
        return onOff;
    }

    public boolean checkSwitch() {
        return onOff;
    }

}
