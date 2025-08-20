package palindromeNumber;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		String palabra = String.valueOf(x);
		char[] listaCaracteres = palabra.toCharArray();

		String cadenaInversa = "";
		for (int i = palabra.length() - 1; i >= 0; i--) {
			cadenaInversa = cadenaInversa + listaCaracteres[i];
		}

		return palabra.equals(cadenaInversa);
	}

//	public static void main(String[] args) {
//		System.out.println(isPalindrome(101));
//	}
}
