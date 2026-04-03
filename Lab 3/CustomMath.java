public class CustomMath {

    public static final double PI = 3.141592653589793;
    public static final double E = 2.718281828459045;

    /**
     * They are final, which means they cannot be changed
     *
     * CustomMath.PI or CustomMath.e
     */

    public static int max(int a, int b) {
        if(a > b) {
            return a;
        }
        return b;
    }

    public static double max(double a, double b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int power(int base, int exponent) {
        int result = 1;
        for(int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
