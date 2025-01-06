package SkillProgram;

public class SummationIndices {

    public static int[] findIndices(int[] numbers, int target) {

        for (int i=0; i<numbers.length; i++) {
            for (int j=1; j<numbers.length;j++) {
                if (numbers[i]+numbers[j] == target){
                    return new int[]{i, j};
                }
            }
        }


        return new int[] {-1,1};
    }

    public static void main(String[] args) {
        int[]numbers={1,3,4,5,6};

        int target = 5;

        int[] result = findIndices(numbers, target);

        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }
}
