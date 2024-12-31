public class PrimeNumber {
    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumber prime = new PrimeNumber();
        int num = 29;
        System.out.println(num + " is Prime? " + prime.isPrime(num));
    }
}

//prime number stricty sup than 1 and have 2 divisers