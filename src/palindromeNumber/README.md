```
Algoritmo num_palindrome
	Escribir "Ingrese un numero entero: "
	Leer x
	
	palabra <- ConvertirATexto(x)
	long <- Longitud(palabra)
	Dimension lista_caracteres[long]

	Para i<-1 Hasta long Con Paso 1 Hacer
		caracter_separado = Subcadena(palabra, i, i);
		lista_caracteres[i] <- caracter_separado
	FinPara
	
	cadena_inversa <- ""
	Para i<-long Hasta 1 Con Paso -1 Hacer
		// Escribir lista_caracteres[i]
		cadena_inversa <- cadena_inversa + lista_caracteres[i]
	FinPara
	
	Si palabra = cadena_inversa Entonces
		Escribir Verdadero
	SiNo
		Escribir Falso
	FinSi
FinAlgoritmo
```