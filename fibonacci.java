public class fibonacci {
    static int fibonacci(int a) {
        if (a == 1 && a == 2) {
            return 1;
        }
        int[] fib = new int[a + 1];
        fib[1] = 1;
        fib[2] = 1;

        for (int i = 3; i <= a; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[a];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
