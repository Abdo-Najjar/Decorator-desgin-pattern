package Decorator;

public class Red extends ShapeDecorator {

    @Override
    public void Color(Shape shape) {
        if (shape.returnShape().equalsIgnoreCase(Shape.cir)) {
            System.out.println("Red " + Shape.cir);
        } else if (shape.returnShape().equalsIgnoreCase(Shape.squ)) {
            System.out.println("Red " + Shape.squ);
        } else {
            System.out.println("Red unknown Shape");
        }
    }

}
