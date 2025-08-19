package algoritmos;

public class Inicio {

	@SuppressWarnings("unused")
	private static String sayHello() {
		return "Hola Mundo desde Linux";
	}

	public static boolean PrimeNumbers(int num) {
		boolean esPrimo;
		if (num <= 1) {
			esPrimo = false;
		} else {
			esPrimo = true;
			for (int i = 2; i < Math.sqrt(num); i++) {
				if (num % i == 0) {
					esPrimo = false;
					break;
				}
			}
		}
		return esPrimo;
	}

}
