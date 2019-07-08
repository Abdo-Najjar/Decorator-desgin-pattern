package Decorator;

public class Square implements Shape {

    @Override
    public void view() {
        System.out.println("Square");
    }
    
    @Override
    public String returnShape() {
        return Shape.squ;

    }

}
