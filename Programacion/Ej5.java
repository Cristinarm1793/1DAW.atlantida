//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Ej5 {
    public static void main(String[] args) {

      int Tsegundos, segundos, minutos, horas;

      Scanner sc = new Scanner(System.in);

      System.out.println("cantidad de tiempo en segundos: ");
      Tsegundos = sc.nextInt();

      segundos = Tsegundos % 60;
      minutos = Tsegundos % 3600 / 60;
      horas = Tsegundos / 3600;

      System.out.println("Horas: " + horas);
      System.out.println("Minutos: " + minutos);
      System.out.println("Segundos: " + segundos);







        }
    }
