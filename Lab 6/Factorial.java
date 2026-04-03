public class Factorial {
    public static void main(String[] args) {
        int result = recursiveFactorial(5);
        System.out.println("Factorial is: " + result);
    }

    public static int recursiveFactorial(int n) {
        if(n <= 1) {
            return 1;
        } else {
            return n * recursiveFactorial(n - 1);
        }
    }
}
