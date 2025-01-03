public class primeNumber {
    public boolean isPrime(int number) {
        if (number <= 1) return false;
//        iteration with for, why ? : to find if number have sqrt
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
public void main(String[] args) {
    primeNumber prime = new primeNumber();
    int num = -3;
    System.out.println(num+ " is PRIME??? " + prime.isPrime(num));
}

//prime number stricty sup than 1 and have 2 divisers