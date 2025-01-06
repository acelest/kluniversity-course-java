package SkillProgram;

public class SummationIndices {

    // Méthode pour trouver les indices
    public static int[] findIndices(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // Si aucune combinaison trouvée
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int target = 9;

        int[] result = findIndices(numbers, target);

        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }
}
