import java.util.Scanner;

public class El_Problema_De_Ser_Rico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 0;
        int suma_litros = 0;
        int resta_litros = 0;

        System.out.println("¿Cuántos casos de prueba quieres hacer?");
        int numero_pruebas = sc.nextInt();

        while (i < numero_pruebas)
        {
            int n = 1;

            System.out.print("¿Cuántos acuarios hay? ");
            int numero_acuarios = sc.nextInt();

            System.out.print("¿Cuántos litros tiene el primer compartimento? ");
            int litros_acuario = sc.nextInt();

            System.out.print("¿Cuánta diferencia hay entre acuarios? ");
            int diferencia_litro = sc.nextInt();

            while (numero_acuarios <=0 && numero_acuarios >= 10000)
            {
                System.out.println("Tiene que ser un numero positivo y menor que 10000");
                numero_acuarios = sc.nextInt();
            }

            while (litros_acuario <=0 && litros_acuario >= 10000)
            {
                System.out.println("Tiene que ser un numero positivo y menor que 10000");
                litros_acuario = sc.nextInt();
            }

            while (diferencia_litro <=0 && diferencia_litro >= 10000)
            {
                System.out.println("Tiene que ser un numero positivo y menor que 10000");
                diferencia_litro = sc.nextInt();
            }

            suma_litros = litros_acuario;
            resta_litros = litros_acuario;

            while (n < numero_acuarios)
            {
                resta_litros -= diferencia_litro;
                suma_litros += resta_litros;
                n+=1;
            }

            System.out.println("La cantidad total de litros es: " + suma_litros);

            i+=1;
        }
    }
}
