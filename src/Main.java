public class Main {
    public static void main(String[] args) {

        int i = 100;
        while(i<=10){
            System.out.println("Entra al bucle" + i);
            i++;
        }
        System.out.println("Terminacion del bucle ");

        //Comparativa con el do while
        i=100;
        do{
            System.out.println("Entra al bucle " + i);
            i++;
        } while (i<=10);

        System.out.println("Terminación del bucle");
    }
}