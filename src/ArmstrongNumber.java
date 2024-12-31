public class ArmstrongNumber {
    public boolean isArmstrong(int number) {
        int original = number, sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        ArmstrongNumber armstrong = new ArmstrongNumber();
        int num = 153;
        System.out.println(num + " is Armstrong? " + armstrong.isArmstrong(num));
    }
}



//
//ArmstrongArmstrong An **Armstrong number** is a number that is equal to the sum of its digits each raised to the power of the number of digits.
//For example, 153 is an Armstrong number because \(1^3 + 5^3 + 3^3 = 153\).