import java.util.Scanner;

public class Korper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Würfel brechnen");

        
        System.out.print("Geben Sie die Kantenlänge a ein: ");
        double a = input.nextDouble();
        
        double volumen = a * a * a;
        double oberflache = 6 * a * a;
        
        System.out.println("\nWürfel:");
        System.out.println("Volumen: " + volumen);
        System.out.println("Oberfläche: " + oberflache);
        
        input.close();
    }
}
