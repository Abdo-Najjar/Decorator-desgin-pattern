package Decorator;

public class Blue extends ShapeDecorator{

    @Override
    public void Color(Shape shape) {
        if(shape.returnShape().equalsIgnoreCase(Shape.cir)){
            System.out.println("Blue " + Shape.cir);
        }else if(shape.returnShape().equalsIgnoreCase(Shape.squ)){
            System.out.println("Blue " + Shape.squ);
        }else{
            System.out.println("Blue unknown");
        }
    }
    
}
