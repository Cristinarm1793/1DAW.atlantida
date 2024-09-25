//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
      int n1, n2, n3, n4;
      System.out.println("los cuatro numero\n");
      n1=sc.nextInt();
      n2=sc.nextInt();
      n3=sc.nextInt();
      n4=sc.nextInt();
      double multiplicacion = n1 * n2 * n3 * n4;
      double suma = n1 + n2 + n3 + n4;
      double aritmetica = suma / 4;
      System.out.println("la aritmetica es: " + aritmetica);
      System.out.println("la suma es: " + suma);
      System.out.println("la multiplicacion es: " + multiplicacion);

        }
    }
