//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
     Scanner sc = new Scanner(System.in);
     System.out.print("radio circulo\n");
        double radio = sc.nextDouble();
     final double PI = 3.14;
     double area = PI * radio * radio;
     double perimetro = 2 * PI * radio;
     System.out.println("El area es: " + area);
     System.out.println("El perimetro es: " + perimetro);


    }
}