//false bedeutet parkplatz ist frei, true bedeutet parkplatz ist besetzt
public class array {
     public static void main(String[] args) {      
        int freiePlaetze = 0;
   boolean [] parkplatz = new boolean[5];
        parkplatz[0] = true;   
        parkplatz[1] = false;
        parkplatz[2] = true;
        parkplatz[3] = false;
        parkplatz[4] = false;
        
for (int i = 0; i < parkplatz.length; i++) {
            if (!parkplatz[i]) {
                freiePlaetze++;
            }
            

            }
System.out.println("Anzahl der freien Parkplätze: " + freiePlaetze);
        }
        
    }

