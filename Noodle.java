public class Noodle extends Item {
    
    private boolean cooked;

    public Noodle(String name){
        super(name);
        this.cooked = false;
    }

    // QUESTIoN - make it a string? these can also happen in game
    public boolean eatCondition() {
        if (Inventory.exist.getName(bowl)) {
            if (cooked) {
              if (Inventory.exist(fork)) {
                this.cooked = true;
                return true;
              } else {
                return false;
              }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void eat() {
        if(eatCondition()){
            Inventory.removeItem(Item.getName == "noodle");
        } else {
            System.out.println("Noodle not ready.");
        }
    }

}
