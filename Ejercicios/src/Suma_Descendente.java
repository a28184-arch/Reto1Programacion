import java.util.Scanner;

public class Suma_Descendente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;

        while (numero >= 0){
            System.out.println("Dime un numero");
            numero = sc.nextInt();

            if (numero >= 1 && numero <= 1000000000){

                int suma = 0;
                int resto = 0;

                for (int divisor = 1 ; numero >= divisor ; divisor = divisor * 10){
                  resto = numero % divisor;
                  suma += resto;
                }

                suma += numero;
                System.out.println("El resultado es: " + suma);

            } else if (numero > 1000000000) {
                System.out.println("Numero demasiado grande");
                numero = sc.nextInt();
            } else {
                System.out.println("Has salido");
                break;
            }
        }
    }
}
