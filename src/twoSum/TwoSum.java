package twoSum;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] resultado = new int[2];
        int suma = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                suma = nums[i] + nums[j];
                if (suma == target) {
                    resultado[0] = i;
                    resultado[1] = j;
                    return resultado;
                }
            }
        }
        return null;
    }
}
