package LabProgram;

public class MaxProgram {
// write a program java to compute the average of an array of integers except the largest and smallest values
// use while loop : lcm=Maxwhile (lcm=, i=0, lcm!==0) {
// lcm+=Max } return lcm
    public int Max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public int Min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public double Average(int[] arr) {
        int max = Max(arr);
        int min = Min(arr);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max && arr[i] != min) {
                sum += arr[i];
                count++;
            }
        }
        return (double) sum / count;
    }


    
    public static void main(String[] args) {
        MaxProgram max = new MaxProgram();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Average of array except the largest and smallest values: " + max.Average(arr));
    }


}