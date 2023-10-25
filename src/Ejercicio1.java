import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Sumar los números que se pidan por la consola
        //Salir del bucle cuando se escriba un número negativo

        //1. Definir variables
        Scanner teclado = new Scanner(System.in);
        int numero;
        int suma = 0;

        do{
            System.out.println("Escriba el numero (Para salir ponga negativo)");
            numero = teclado.nextInt();
            if(numero >=0){
            suma += numero;}
        }while(numero >=0);
        System.out.println("Suma ->" + suma);
    }
}
