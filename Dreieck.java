import java.util.Scanner;

public class Dreieck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Geben Sie die Seite a ein:");
        double a = input.nextDouble();
        
        System.out.println("Geben Sie die Seite b ein:");
        double b = input.nextDouble();
        
        System.out.println("Geben Sie die Seite c ein:");
        double c = input.nextDouble();
        
        // Dreiecksungleichungen überprüfen
        boolean bed1 = a + b > c;
        boolean bed2 = b + c > a;
        boolean bed3 = a + c > b;
        
        if (bed1 && bed2 && bed3) {
            System.out.println("\nDas Dreieck lässt sich konstruieren!");
        } else {
            System.out.println("\nDas Dreieck lässt sich NICHT konstruieren!");
            
            if (!bed1) {
                System.out.println("Bedingung a + b > c nicht erfüllt: " + a + " + " + b + " = " + (a + b) + " ist nicht > " + c);
            }
            if (!bed2) {
                System.out.println("Bedingung b + c > a nicht erfüllt: " + b + " + " + c + " = " + (b + c) + " ist nicht > " + a);
            }
            if (!bed3) {
                System.out.println("Bedingung a + c > b nicht erfüllt: " + a + " + " + c + " = " + (a + c) + " ist nicht > " + b);
            }
        }
        
        input.close();
    }
}
