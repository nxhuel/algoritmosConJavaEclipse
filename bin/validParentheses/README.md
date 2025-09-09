```
Entrada:
	String s = "()"
Proceso:
	Si (Longitud(s) % 2 != 0 ) Entonces
		Retornar falso
	FinSi
	
	mapa Como Map<Caracter, Caracter>
	mapa.colocar(')', '(')
	mapa.colocar('}', '{')
	mapa.colocar(']', '[')
	
	// crear pila: ultimo en entrar, primero en salir
	stack Como Pila<Caracter>
	
	// se convierte el String s en un array de caracteres
	caracter[] sConvertido <- s.aArrayCaracter()
	
	// c recorre sConvertido
	Para (caracter c : sConvertido) 
		// si c es un caracter de cierre 
		Si (mapa.contieneClave(c)) Entonces
			// guardar el ultimo elemento que se guardo en stack 
			top Como caracter <- stack.estaVacio() ? '#' : stack.pop()
			Si (top != mapa.traer(c)) Entonces
				Retornar falso
			FinSi
		SiNo
			// es un caracter de apertura -> se apila
			stack.empujar(c)
		FinSi
	FinPara
	
	Retornar stack.estaVacio() // true
Salida:
	true
```