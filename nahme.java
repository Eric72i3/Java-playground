import java.util.Scanner;

public class nahme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("1-12 eingeben  ");
        int monat = input.nextInt();
        
        if (monat == 1) {
            System.out.println("Januar");
  } else if (monat == 2) {
            System.out.println("Februar");
              } else if (monat == 3) {
            System.out.println("März");
       } else if (monat == 4) {
            System.out.println("April");   }
             else if (monat == 5) {
            System.out.println("Mai");
        } else if (monat == 6) {
            System.out.println("Juni");
        } else if (monat == 7) {
            System.out.println("Juli");
        } else if (monat == 8) {
            System.out.println("August");
        } else if (monat == 9) {
            System.out.println("September");
        } else if (monat == 10) {
            System.out.println("Oktober");
        } else if (monat == 11) {
            System.out.println("November");
        } else if (monat == 12) {
            System.out.println("Dezember");
        } else {
            System.out.println("Fehler! Bitte geben Sie eine Zahl zwischen 1 und 12 ein!");
        }
        
        input.close();
    }
}
