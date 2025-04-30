public class Balloon extends Item{
    
    public Balloon (){
        super("Balloon");
    }
    
    public void pop () {

        if (collection.contains(fork)) {
            collection.add(key);
        }
    }
}
