import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un número mayor que 0...");
        int n = scan.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j--) {
                System.out.println("*");
            }
            System.out.println();

        }
    }
}


