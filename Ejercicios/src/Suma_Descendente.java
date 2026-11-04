import java.util.Scanner;

public class Suma_Descendente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");
        int numero = sc.nextInt();

        while (numero != 0){

            int divisor = 1;
            int suma = 0;

            while (numero / divisor >= 10){
                divisor *= 10;
            }

            suma += numero;

            numero = numero % divisor;

            System.out.println("El resultado es: " + suma);
        }
    }
}
