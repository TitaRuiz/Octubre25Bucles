import java.util.Scanner;

public class EjemploForEach {
    public static void main(String[] args) {
        int[] numeros = {3,4,1,5,6,7};
        //Recorrer la coleccion con el bucle for each
        for(int elemento: numeros){
            System.out.println(elemento);
        }

        String[] palabras = {"casa","coche", "aula","ordenador"};
        //Recorrer el array y mostrarlo por la consola
        for(String elemento : palabras){
            System.out.println(elemento);
        }

        char[] letras = {'a','c','d','f','k'};
        for(char elemento : letras){
            System.out.println(elemento);
        }

        double[] sueldos = {1_500.50,1_000,1_200,3_000};
        double suma = 0;
        for (double elemento : sueldos){
            suma+=elemento;
        }
        System.out.println("La suma es -> " + suma);




    }
}
