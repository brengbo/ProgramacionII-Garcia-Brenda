import java.util.Scanner;
public class VerificadorPrimo {
    static boolean esPrimo(int n){ //metodo primo
      if (n==0 || n==1) { //que hace el metodo
        return false;
      }
      for (int i = 2; i<n;i++){
        if (n%i==0){
          return false;  //no es primo
        }
      }
      return true;
    }
    public static void main (String[]args){
      Scanner teclado = new Scanner (System.in);
      int n = teclado.nextInt();
      if (n<0){
        System.out.println("No se puede hacer la operación. Nro ingresado negativo.");
      }
      else if (esPrimo(n)){
        System.out.println("El nro " + n + " es primo.");
      }
      else{System.out.println("El nro "+ n + " no es primo.");}
    }
}

//-1: No se puede hacer la operación. Nro ingresado negativo.
//0: El nro no es primo.
//5: El nro 5 es primo.
//7: El nro 7 es primo.
//19: El nro 19 no es primo.


