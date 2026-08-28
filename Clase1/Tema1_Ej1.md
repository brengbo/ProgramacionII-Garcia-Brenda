Clase 1- Tema 1. Ejercicio 1 Básico

    Algoritmo VerificarPrimo
    Definir n, i Como Entero
    Definir esPrimo Como Logico
  
    Escribir "Ingrese un número entero:"
    Leer n
    
    Si n < 0 Entonces
        Escribir "Error: El número no puede ser negativo."
    Sino
        Si n == 0 o n == 1 Entonces
            Escribir "El número ", n, " no es primo."
        Sino
            esPrimo <- Verdadero
            Para i <- 2 Hasta Raiz(n) Hacer
                Si n MOD i == 0 Entonces
                    esPrimo <- Falso
                    Romper Ciclo
                FinSi
            FinPara
            
            Si esPrimo Entonces
                Escribir "El número ", n, " es primo."
            Sino
                Escribir "El número ", n, " no es primo."
            FinSi
        FinSi
    FinSi
    FinAlgoritmo



| Caso N° | Tipo de Caso | Valor de Entrada ($n$) | Salida Esperada |
| :--- | :--- | :--- | :--- |
| **1** | Límite | `0` | "El número 0 no es primo." |
| **2** | Límite | `1` | "El número 1 no es primo." |
| **3** | Límite | `2` | "El número 2 es primo." |
| **4** | Normal | `7` | "El número 7 es primo." |
| **5** | Normal | `4` | "El número 4 no es primo." |
| **6** | Error | `-5` | "Error: El número no puede ser negativo." |
