public class Fibonacci {
    public void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.println("Fibonacci sequence up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        fib.generateFibonacci(10); // Exemple : 10 termes
    }
}