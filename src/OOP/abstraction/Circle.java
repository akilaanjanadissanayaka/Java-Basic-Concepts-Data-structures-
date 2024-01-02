package OOP.abstraction;

public class Circle extends GraphicObject {
    Circle(){
        System.out.println("circle class contructer called"); // this will call after the parent runnes
    }
    void draw() {
        System.out.println("Drawing a circle");

    }
    void resize() {
        System.out.println("Resizing a circle");
    }
    void moveTo() {
        System.out.println("im new in circle moveTo"); //override moveTo in parent
    }
}
