//2.1.1 Created a subclass which inherits the Superclass
public class Subclass extends Superclass{
    // 2.1.1 Created an instance of subclass
    public int subInt;
    public Subclass(String S, int k, int i, int subInt ){
        // 2.1.7 Use of super keyword for a parent constructor call
        super(S,k, i);
        this.subInt = subInt;
    }
//2.1.5 Overriden superclass method in the child class
    @Override
    public void OverMethod(){
        System.out.println("Overriden method in Subclass");
        super.OverMethod();
    }
}
