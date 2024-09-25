
import java.util.Scanner;
public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int extra, n1, n2, n3, n4, n5;
        System.out.println("5 digitos"); //48271
        extra = sc.nextInt();

        n1 = extra / 10000;
        n2 = extra / 1000;
        n2 = n2 % 10; // n2 %=10;
        n3 = extra / 100;
        n3 = n3 % 10;
        n4 = extra / 10;
        n4 = n4 % 10;
        n5 = extra % 10;

        System.out.println("Primer digito: "+n1+" Segundo digito: "+n2+" Tercer digito: "+n3+" Cuarto digito: "+n4+" Quinto digito: "+n5);






        }
    }
