package facotrial_recurstion;

public class FactorialViaRecursion {

    public static void main(String[] args) {
        int x = factorial(10);
        System.out.println(x);
    }

    private static int factorial(int i) {
        if(i == 1) return 1;

        return i * factorial(i-1);
    }

}
