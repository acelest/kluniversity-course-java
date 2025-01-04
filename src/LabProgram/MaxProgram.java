package LabProgram;
// import java.io.*;
import java.util.Scanner;

// write a program java to compute the average of an array of integers except the largest and smallest values
// use while loop : lcm=Maxwhile (lcm=, i=0, lcm!==0) {
// lcm+=Max } return lcm

public class MaxProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;
        int i = 0;

        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            i++;
        }

        i = 0;
        while (i < arr.length) {
            if (arr[i] != max && arr[i] != min) {
                sum += arr[i];
                count++;
            }
            i++;
        }

        double average = (double) sum / count;
        System.out.println("Max value is: " + max);
        System.out.println("Min value is: " + min);
        System.out.println("Average excluding the largest and smallest values: " + average);
    }
}