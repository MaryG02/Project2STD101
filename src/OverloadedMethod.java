//2.1.4 Overloaded method
public class OverloadedMethod {
    public void squareArea (int a){
        int area = a*a;
        System.out.println("With int arg: "+area);
    }
    public void squareArea (double a){
        double area = a*a;
        System.out.println("With double arg: "+area);
    }
}
