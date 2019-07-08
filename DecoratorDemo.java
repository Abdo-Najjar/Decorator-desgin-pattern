package Decorator;

public class DecoratorDemo {
    
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape s = new Square();
        c.view();
        s.view();
        ShapeDecorator b = new Blue();
        ShapeDecorator r = new Red();
        b.Color(s);
        b.Color(c);
        r.Color(c);
        r.Color(s);
    }
    
}
