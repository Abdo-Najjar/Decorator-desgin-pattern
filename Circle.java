package Decorator;

public class Circle implements Shape {

    @Override
    public void view() {
        System.out.println("Circle");
    }

    @Override
    public String returnShape() {
        return Shape.cir;
    }

}
