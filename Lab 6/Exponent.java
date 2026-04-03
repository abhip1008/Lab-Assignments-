/**
 * powerFast is faster for large n because it reduces the problem size by half
 * everytime the method is recursively called. While powerSlow only reduces by 1 each time
 */
public class Exponent {
    public static long powerSlow(long x, int n) {
        if(n == 0) {
            return 1;
        }
        return x * powerSlow(x, n - 1);
    }
    public static long powerFast(long x, int n) {
        if(n == 0) {
            return 1;
        }
        long half = powerFast(x, n / 2);

        if(n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }

    public static void main(String[] args) {
        int n = 40;
        long x = 2;


        System.out.println("Slow: " + powerSlow(x, n));
        System.out.println("Fast: " + powerFast(x, n));

        long start1 = System.nanoTime();
        powerSlow(x, n);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        powerFast(x, n);
        long end2 = System.nanoTime();

        System.out.println("Slow time: " + (end1 - start1));
        System.out.println("Fast time: " + (end2 - start2));
    }
}
