package OOP.abstraction;


//in a abstract calss there mus be at least one abstract method and can have normall methods also
//but in interfaces it only can have abstract methods
public  abstract class GraphicObject {
    int x, y;
    GraphicObject(){
        System.out.println("base class constructer is called");
    }
    void moveTo() {
        System.out.println("Im base class ");
    }

    abstract void draw();
    abstract void resize();
}
