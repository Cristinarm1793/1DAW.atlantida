//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Valor de A: ");
       int A = sc.nextInt();
       System.out.print("Valor de B: ");
       int B = sc.nextInt();
       System.out.print("Valor de C: ");
       int C = sc.nextInt();

       int extra = B;
       B = A;
       A = C;
       C = extra;

       System.out.println("Resultado: ");
       System.out.println("A: " + A);
       System.out.println("B: " + B);
       System.out.println("C: " + C);






        }
    }