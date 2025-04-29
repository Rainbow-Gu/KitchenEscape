public class Switch {

    /**
     * Attributes
     */
    boolean onOff;
    String name;

    public Switch (String name) {
        this.name = name;
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
