package SkillProgram;

import java.util.Scanner;

public class FinNumber {

    // Méthode pour trouver le plus petit et le plus grand nombre
    public static void findMinMax(int[] numbers, int[] result) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // Stock
        result[0] = min; // Smallest
        result[1] = max; // Biggest
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int[] result = new int[2]; // Pour stocker min et max
        findMinMax(numbers, result);

        System.out.println("Smallest number: " + result[0]);
        System.out.println("Biggest number: " + result[1]);
    }
}
