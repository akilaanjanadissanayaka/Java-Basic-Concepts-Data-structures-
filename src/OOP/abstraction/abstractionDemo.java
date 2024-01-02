package OOP.abstraction;

public class abstractionDemo {
    public static void main(String args[]){
        GraphicObject c=new Circle();
        c.draw();
        c.moveTo();
        GraphicObject r=new Rectangle();
//        r.draw();
        r.moveTo();// can call normal methods in the abstract class

//        GraphicObject g=new GraphicObject(); //'GraphicObject' is abstract; cannot be instantiated
    }
}
