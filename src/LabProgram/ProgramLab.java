package LabProgram;

public class ProgramLab {
  public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      // sum and count
      int sum = 0;
      int count = 0;
      int i = 0;

      // cherche la valeur max et min
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
      // Compute the sum excluding max and min values
      while (i < arr.length) {
          if (arr[i] != max && arr[i] != min) {
              sum += arr[i];
              count++;
          }
          i++;
      }

      // Compute the average
      double average = (double) sum / count;
      System.out.println("Max value: " + max);
      System.out.println("Min value:" + min);
    //   System.out.println("Average excluding the largest and smallest values: " + average);
  }
}