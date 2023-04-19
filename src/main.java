public class main{
    public static void main(String[] args){
    // 2.1.2 Created an instance of subclass as a type of superclass
    Superclass a = new Subclass("Super", 10, 20, 22);
    Subclass c = new Subclass("Sub", 1, 2, 55);
    System.out.println("Sub class: " + c.getClass());
    System.out.println("Super class: " + a.getClass());

    //2.1.4 Overloaded method example
        OverloadedMethod obj1 = new OverloadedMethod();
        obj1.squareArea(10);
        obj1.squareArea(2.22);

    // We can access superclass variables inside subclass methods
    c.k = 5;

    //
    Superclass superc = new Superclass();
    superc.abstractMethod();

}
}