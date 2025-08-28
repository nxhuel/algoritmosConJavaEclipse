```
Entrada
	s <- "IV"

Proceso
	HashMap<Caracter, Entero> nums_romanos = new HashMap<>();
	nums_romanos.put('I', 1);
	nums_romanos.put('V', 5);
	nums_romanos.put('X', 10);
	nums_romanos.put('L', 50);
	nums_romanos.put('C', 100);
	nums_romanos.put('D', 500);
	nums_romanos.put('M', 1000);
	
	s <- s.aMayuscula() Como Cadena
	resultado_final <- 0 Como Entero
	prev <- 0 Como Entero
	
	Para i <- Longitud(s) - 1 Hasta i >= 0 Con Paso i-- Hacer
		pk_caracter <- s.charAt(i) Como Caracter
		valor_actual <- nums_romanos.get(pk_caracter) Como Entero
		
		Si valor_actual < prev Entonces
			resultado_final -= valor_actual
		SiNo
			resultado_final += valor_actual
		FinSi
		prev <- valor_actual
	FinPara
	Retorna resultado_final
	
Salida

	resultado_final <- 4
```
