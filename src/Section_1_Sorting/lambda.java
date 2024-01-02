package Section_1_Sorting;



//functional interface
interface MyFunction {
    int apply(int x, int y);
}
public class lambda {


    public static void main(String[] args) {
        // Using a lambda expression to implement the apply method
        MyFunction addFunction = (x, y) -> x + y;
        MyFunction multiplyFunction = (x, y) -> x * y;

        // Applying the lambda expressions
        int resultAdd = addFunction.apply(3, 5);
        int resultMultiply = multiplyFunction.apply(3, 5);

        System.out.println("Result of addition: " + resultAdd);
        System.out.println("Result of multiplication: " + resultMultiply);
    }

}
