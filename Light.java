public class Light extends Switch {

    public Light(boolean onOff) {
        super("light", onOff);
    }

    public void showNumOnly(){
        if(!this.checkSwitch()) {
                // show number on WallE - hide contents elsewhere
        } else {
            System.out.println("Method inapplicable.");
        }
    }
}

