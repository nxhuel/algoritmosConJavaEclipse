```
Algoritmo two_sum
	Escribir "Ingrese la cantidad de numeros que desea ingresar"
	Leer cant_nums
	Dimension nums[cant_nums]
	Para i<-1 Hasta cant_nums Con Paso 1 Hacer
		Escribir "Ingrese el numero de la lista ", i, ":"
		Leer nums[i]
	Fin Para
	
	//	Para i<-1 Hasta cant_nums Con Paso 1 Hacer
	//	Escribir nums[i]
	// 	Fin Para
	
	target <- 9
	suma <- 0
	Dimension resultado[2]
	
	Para i<-1 Hasta cant_nums Con Paso 1 Hacer
		Para j<- i+1 Hasta cant_nums Con Paso 1 Hacer
			suma <- nums[i] + nums[j]
			Si suma = target Entonces
				resultado[1] <- i
				resultado[2] <- j
			Fin Si
		FinPara
	FinPara
	
	Para i<-1 Hasta 2 Con Paso 1 Hacer
		Escribir resultado[i] -1
	FinPara
FinAlgoritmo
```

```
Algoritmo two_sum_hashmap
	Declarar nums como lista de enteros <- {2, 11, 15, 7}
	Declarar target como entero <- 9
	Declarar contenedor como hashmap<Integer, Integer>
	Declarar resultado como lista de enteros[2]
	
	Para i <- 1 Hasta i < nums.length Con Paso 1 Hacer
		num_repetido <- target - nums[i] 
		Si contenedor.ContieneLaClave(num_repetido) Entonces
			resultado[1] <- contenedor.get(num_repetido)
			resultado[2] <- contenedor.get(i) 
		FinSi
		contenedor.Colocar(nums[i], i);
	FinPara
FinAlgoritmo
```