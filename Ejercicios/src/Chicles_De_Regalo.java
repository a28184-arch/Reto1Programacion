import java.util.Scanner;

public class Chicles_De_Regalo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int envoltorios = 0;
        int chicles_gratis = 0;
        int chicles_regalo = 0;
        int total_chicles = 0;
        int resto_chicles = 0;

        while (envoltorios >= 0){
            System.out.println("Introduce los siguientes dataso separados por espacios| Cuantos envoltorios necesitas:|" +
                    " Cuantos chicles gratis necesitas:| Cuantos chicles has comprado:");
            envoltorios= sc.nextInt();
            int chicles= sc.nextInt();
            int chicles_comprados= sc.nextInt();

            if (envoltorios == 0 && chicles == 0 && chicles_comprados == 0){
                System.out.println("Has salido");
                break;
            } else if (chicles >= envoltorios) {
                System.out.println("RUINA");
            }else{

                chicles_gratis = chicles_comprados / envoltorios;
                chicles_regalo = chicles_gratis / envoltorios;
                total_chicles = chicles_comprados + chicles_gratis + chicles_regalo;
                resto_chicles = total_chicles % envoltorios;

                System.out.println("El total de chicles es: " + total_chicles);
                System.out.println("El resto de chicles es: " + resto_chicles);
            }
        }
    }
}
