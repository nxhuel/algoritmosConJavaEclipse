```
Algoritmo TwoSum
	Escribir "Ingrese la cantidad de numeros: "
	Leer cantNums
	Dimension nums[cantNums]
	
	Para i <- 1 Hasta cantNums
		Escribir "Ingrese el numero de la posicion ", i
		Leer nums[i]
	FinPara
	
	target <- 9	
	
	res <- sumarDosNums(nums, cantNums, target)
FinAlgoritmo

SubAlgoritmo Entero <- sumarDosNums(nums, cantNums, target)
	Dimension resultado[2]

	Para i <- 1 Hasta cantNums-1 Hacer
		Para j <- i+1 Hasta cantNums Hacer
			suma <- nums[i] + nums[j]
			Si suma = target Entonces
				resultado[1] <- i
				resultado[2] <- j
			FinSi
		FinPara
	FinPara

	Escribir "Resultado: ", resultado[1]-1, ", ", resultado[2]-1
FinSubAlgoritmo
```