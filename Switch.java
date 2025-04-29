public class Switch {

    /**
     * Attributes
     */
    static boolean onOff;
    String name;

    public Switch (String name) {
        this.name = name;
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
