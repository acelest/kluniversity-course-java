package SkillProgram;

public class Average {

    public static double computeAverage(int[] numbers) {
        if (numbers == null || numbers.length <= 2) {
            throw new IllegalArgumentException("Array must contain more than two elements.");
        }

        // Find smallest and largest elements
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }

        // Calculate the average excluding min and max
        return (double) (sum - min - max) / (numbers.length - 2);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            System.out.println("Average (excluding smallest and largest): " + computeAverage(numbers));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
