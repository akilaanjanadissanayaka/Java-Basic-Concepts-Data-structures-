package OOP.multipleInheritance;

public class Dog implements Animal,TerrestrianAnimal{

    @Override
    public void specialCapabilities() {
        System.out.println("I can bark As Dog");
    }

    @Override
    public void livesIn() {
        System.out.println("I lives in land");
    }
}
