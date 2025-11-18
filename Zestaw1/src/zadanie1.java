import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość stopni?");
        double stopnie = scan.nextDouble();
        System.out.println( 1.8 * stopnie + 32.0);
    }
}
