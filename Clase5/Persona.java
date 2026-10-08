package Clase5;

public class Persona {
    private String nombre; //variables globales
    private int dni;
    private int edad;

    public Persona(String nombre, int dni, int edad){
    this.nombre=nombre; //this: le asigna el valor del parametro que puse en el constructor
    this.dni=dni; //variables locales
    this.edad=edad; //así crea el objeto persona
    }

    @Override 
    public String toString(){
        return nombre +" Dni: "+ dni + " Edad: " + edad;
    }

    public static void main (String[]args){
    Persona per1= new Persona("Brenda", 43348028, 25);
    Persona per2 = new Persona("Alicia", 22687150, 54);
    Persona per3 = new Persona("Julieta", 48852964, 18);



    System.out.println(per1);
    System.out.println(per2);
    System.out.println(per3);
    }
}
