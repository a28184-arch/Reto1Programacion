import javax.swing.text.TableView;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Chicles_De_Regalo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int envoltorios = 0;

        while (envoltorios >= 0){
            System.out.print("Cuantos envoltorios necesitas: ");
            envoltorios= sc.nextInt();

            System.out.print("Cuantos chicles gratis necesitas: ");
            int chicles= sc.nextInt();

            System.out.print("Cuantos chicles has comprado: ");
            int chicles_comprados= sc.nextInt();

            if (envoltorios == 0 && chicles == 0 && chicles_comprados == 0){
                System.out.println("Has salido");
                break;
            } else if (chicles >= envoltorios) {
                System.out.println("RUINA");
                break;
            }else{
                int chicles_gratis = 0;
                int total_chicles = 0;
                int resto_chicles = 0;

                chicles_gratis = chicles_comprados / envoltorios;
                total_chicles = chicles_comprados + chicles_gratis;
                chicles_gratis = total_chicles / envoltorios;
                resto_chicles = chicles_gratis % envoltorios;

                System.out.println("El total de chicles es: " + total_chicles);
                System.out.println("El resto de chicles es: " + resto_chicles);
            }
        }
    }
}
