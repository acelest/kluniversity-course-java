public class Palindrome {
    public boolean isPalindrome(int number) {
        int original = number, reversed = 0;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        int num = 121;
        System.out.println(num + " Palindrome right ? " + palindrome.isPalindrome(num));
    }
}


//    121 : Inverse = 121
//           777 : Inverse ->> 777 (same)
//            444 : Inverse = 444
