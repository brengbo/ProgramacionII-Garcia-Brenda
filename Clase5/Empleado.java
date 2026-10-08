package Clase5;

public class Empleado {
    private String nombre;
    private int legajo;

    public Empleado(String nombre, int legajo){
        this.nombre=nombre;
        this.legajo=legajo;
    }

    public  double calcularSueldo(){ // sin static: consulta los datos específicos de un solo empleado
        return 0;
    }

    public static void mostrarLegajo(Empleado[] listaEmpleados){
        int min = listaEmpleados[0].legajo;
        int max = listaEmpleados[0].legajo;

        for (int i=1; i<listaEmpleados.length; i++){
            if (listaEmpleados[i].legajo<min){
                min=listaEmpleados[i].legajo;
            }
            if (listaEmpleados[i].legajo>max){
                max=listaEmpleados[i].legajo;
            }
        }
        System.out.println ("El legajo más bajo es: " + min);
        System.out.println ("El legajo más alto es: " + max);
}


public static void main(String[]args){

        Empleado[] lista = new Empleado[4]; // declarar el arreglo e inicializar
        lista[0]= new Empleado("Marisa", 8745); //asigna los objetos en el arreglo
        lista[1] = new Empleado("Pedro", 8159);
        lista[2] = new Empleado("Facundo", 100589);
        lista[3] = new Empleado("Erika", 9687);
        mostrarLegajo(lista); //el metodo de antes
        }
    
    }
