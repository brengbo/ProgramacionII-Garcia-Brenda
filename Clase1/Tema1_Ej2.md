Algoritmo Triangulo 
Ambiente a,b,c

    Escribir ("Ingrese el tamaño del lado a: ")
    Leer (a)
    Escribir ("Ingrese el tamaño del lado b: ")
    Leer (b)
    Escribir ("Ingrese el tamaño del lado c: ")
    Leer (c)

    Si a+b > c y a+c > b y b+c>a Entonces // y esto agregue para que antes de empezar el codigo, el programa chequee si es un triangulo valido
        Si a=b y b=c Entonces
            Escribir ("Es equilatero")
         Sino Si a=b o b=c o a=c Entonces //acá agregue a=c pq sino no contempla esa situacion y seria escaleno para el prog
             Escribir("Es isósceles")
                Sino
                Escribir ("Es escaleno")
            FinSi
        FinSi
    Sino Escribir ("Triangulo invalido.")
    FinSi
FinAlgoritmo

| Caso N° | Tipo de Caso | Valores de Entrada ($a, b, c$) | Salida Esperada |
| :--- | :--- | :--- | :--- |
| **1** | Error (Lados inválidos) | `1, 2, 10` | "Error: Los valores ingresados no forman un triángulo válido." |
| **2** | Normal (Equilátero) | `5, 5, 5` | "Equilátero" |
| **3** | Normal (Isósceles) | `5, 5, 3` | "Isósceles" |
| **4** | Normal (Escaleno) | `3, 4, 5` | "Escaleno" |