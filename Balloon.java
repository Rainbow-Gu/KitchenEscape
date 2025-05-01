public class Balloon extends Item{
    
    public Balloon (){
        super("Balloon");
    }
    
    public void pop () {

        if (collection.contains(fork)) {
            System.out.println("Pop! The balloon bursts. You see a piece of key!");
        } else {
            System.out.println("You need a fork to pop the balloon.");
        }
    }
}
