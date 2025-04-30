public class Balloon extends Item{
    
    public Balloon (){
        super("Balloon");
    }
    
    public void pop () {

        Item key = new Item("key");

        if (Inventory.collection.contains(fork)) {
            Inventory.collection.add(key);
        }
    }
}
