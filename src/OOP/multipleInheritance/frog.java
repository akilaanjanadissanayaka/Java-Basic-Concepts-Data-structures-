package OOP.multipleInheritance;

public class frog implements Animal,TerrestrianAnimal,aquaticAnimal{
    @Override
    public void specialCapabilities() {
        System.out.println("frog is an Ambigues animal");
        System.out.println("frog is lives in water and land");

    }

    @Override
    public void livesIn() {
        System.out.println("frog is lives in water and land");
    }
    //even both interface has same method then also it not be a problem here

}
