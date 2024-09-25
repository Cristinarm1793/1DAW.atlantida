//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("productos electronicos");
        int electronicos = sc.nextInt();
        System.out.println("productos ropa");
        int ropa = sc.nextInt();
        int total = electronicos + ropa;
        double porcentajeelectronicos = electronicos * 100 / total;
        double porcentajeropa = ropa * 100/ total;
        System.out.println("total productos electronicos: " + porcentajeelectronicos );
        System.out.println("total productos ropa: " + porcentajeropa);

        }
    }
