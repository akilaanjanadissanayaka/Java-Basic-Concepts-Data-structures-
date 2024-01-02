package OOP.Interfaces;

//in interface we cant add normal methods, this only allow abstract methods
interface Bicycle {
    void applyBrake (int decrement);
    void speedUp (int increment);
    default void test(){
        System.out.println("Hello");
    }
}
