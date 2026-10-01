##Eficiencia y complejidad algorítmica

Fragmento (a):
imprimir arr[0] // complejidad O(1) - Constante 
//Justificación: no tiene bucles ni repeticiones, se accede al arreglo una sola vez y su tiempo de ejecución no depende del tamaño de la entrada.

Fragmento (b):
para i de 0 a n
  para j de 0 a n
    imprimir i, j //complejidad de tiempo cuadrática O(n^2)
//Justificación: el algoritmo tiene dos bucles anidados, el bucle exterior se ejecuta n veces.
//Por cada iteración individual del bucle externo, el bucle interno (controlado por j) se ejecuta de principio a fin otras n veces completas. Si tenemos un arreglo de 10 elementos esto se recorrerá 100 veces, el bucle externo 10 veces y por cada vez el bucle interno recorre otras 10 veces.

Fragmento (c):
mientras n > 1
  n = n / 2
    contador++ //complejidad de tiempo logarítmica O(log n).
//Justificación: el tamaño de entrada de reduce a la mitad, disminuyendo en cada iteración.

Fragmento (d):
  para i de 0 a n
    para j de 0 a n
      para k de 0 a n
        imprimir i, j, k // complejidad exponencial O(n^3)
//Justificación: tiene 3 bucles anidadados. El bucle externo i se ejecuta n veces. Por cada iteración de ese bucle, el segundo bucle j se ejecuta otras n veces completas. Y a su vez, por cada una de esas iteraciones internas, el tercer bucle k vuelve a correr n veces.
Si tengo 10 elementos se realizará 1,000 operaciones en total.
