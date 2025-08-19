package twoSum;

import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] resultado = new int[2];
		int suma = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
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

//    Objetivo: mejorar el tiempo de resolucion del problema
	public int[] twoSumWithHashMap(int[] nums, int target) {
		HashMap<Integer, Integer> contenedor = new HashMap<>();
		int[] resultado = new int[2];

		for (int i = 0; i < nums.length; i++) {
			int numRepetido = target - nums[i] ;
			if (contenedor.containsKey(numRepetido)) {
				resultado[0] = contenedor.get(numRepetido);
				resultado[1] = i;
				return resultado;
			}
			contenedor.put(nums[i], i);
		}
		return null;
	}

//	public static void main(String[] args) {
//		int[] nums = { 2, 11, 15, 7 };
//		int target = 9;
//		System.out.println(Arrays.toString(twoSumWithHashMap(nums, target)));
//	}
}
