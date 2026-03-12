import java.util.Scanner;
public class Ampelsteuerung {    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.println("Geben Sie die Ampelfarbe ein (rot, gelb, grün):");
        String ampelFarbe = input.nextLine();
 
        switch (ampelFarbe.toLowerCase()) {
            case "rot":
                System.out.println("Anhalten!");
                break;
            case "gelb":
                System.out.println("Bereit machen zum Anfahren!");
                break;
            case "grün":
                System.out.println("Fahren!");
                break;
            default:
                System.out.println("Ungültige Ampelfarbe eingegeben.");
        }
        input.close();
    }
}       