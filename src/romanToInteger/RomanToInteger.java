package romanToInteger;

import java.util.HashMap;

public class RomanToInteger {
	public int romanToInt(String s) {
		HashMap<Character, Integer> numsRomanos = new HashMap<>();
		numsRomanos.put('I', 1);
		numsRomanos.put('V', 5);
		numsRomanos.put('X', 10);
		numsRomanos.put('L', 50);
		numsRomanos.put('C', 100);
		numsRomanos.put('D', 500);
		numsRomanos.put('M', 1000);

		s = s.toUpperCase();
		int resultadoFinal = 0;
		int prev = 0;
	
		if (s.length() <= 0 ||s.length() >= 15 ) {
            throw new IllegalArgumentException("Longitud inválida para número romano");
		}
	
		
		for (int i = s.length()-1; i >= 0; i--) {
			Character pkCharacter = s.charAt(i);
			if (!numsRomanos.containsKey(pkCharacter)) {
			    throw new IllegalArgumentException("Carácter romano inválido: " + pkCharacter);
			}
			int valorActual = numsRomanos.get(pkCharacter);
			

		
			if (valorActual < prev) {
			    resultadoFinal -= valorActual;
			} else {
			    resultadoFinal += valorActual;
			}
			
			prev = valorActual;
		}

		return resultadoFinal;
	}
	
//	public static void main(String[] args) {
//		String s = "XV";
//		System.out.println(romanToInt(s));
//	}
}
