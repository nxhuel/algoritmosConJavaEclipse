```
solucion
    entrada:
        strs Como Array <- []{"flor", "flujo", "vuelo"} 
    proceso:
        Si (strs.esVacio()) Entonces Devolver ""
        
        prefix Como Cadena <- strs[0] // "flor" 
        
        Para (i Desde 1 Hasta Longitud(strs) Con Paso 1) Hacer   
            Mientras (prefix[i].indiceDe(prefix) != 0) Hacer // 0 indica que es igual 
                prefix = prefix.subCadena(0, Longitud(prefix) -1) 
                if (prefix.esVacio()) Entonces Devolver ""           
            FinMientras
        FinPara
    
        Devolver prefix
    salida:
        "fl"
```