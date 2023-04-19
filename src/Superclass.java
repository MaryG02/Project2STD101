// 2.1.1 Created a superclass
public class Superclass extends AbstractClass {
    //2.1.3 Variables with different access modifiers
    private String S;
    protected int i;
    public int k;
    // Default constructor
    public Superclass(){
        System.out.println("Super constructor is called");

    }
    public Superclass(String S, int i, int k){ // Constructor for Superclass with variables
        this.S = S;
        this.k = k;
        this.i = i;
    }
    public void OverMethod(){
        System.out.println("Overriden method in Superclass");

    }
//2.1.8 Implementing the abstract method inherited from abstract class
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method inherited from Abstract Class");
    }
}
