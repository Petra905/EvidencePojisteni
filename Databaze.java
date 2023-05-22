
package cz.itnetwork.evidencepojisteni2;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Petra Hechtova
 */
public class Databaze {
    
private ArrayList<Zaznam> zaznamy;

    public Databaze() {
        zaznamy = new ArrayList<>();
    }

    public void pridejZaznam(String jmeno, String prijmeni) {
            zaznamy.add(new Zaznam());
            
    }
      
    public void pridejZaznam(int vek, int cisloTel) {
            zaznamy.add(new Zaznam());
            
    }
    
    public ArrayList<Zaznam> najdiZaznamy(String jmeno, String prijmeni, int vek, int cisloTel){
      ArrayList<Zaznam> nalezene = new ArrayList<>();
          for (Zaznam z : zaznamy) {
              
          }
              return nalezene;
          }

    public ArrayList<Zaznam> najdiZaznamy(String jmeno, boolean dleJmena) {
        ArrayList<Zaznam> nalezene = new ArrayList<>();
        for (Zaznam z : zaznamy) {
            if ((dleJmena && z.getJmeno().equals(jmeno)) ||
                (!dleJmena && z.getJmeno().toLowerCase().equals(jmeno.toLowerCase()))) {
                nalezene.add(z);
            }
        }
        return nalezene;
    }

    
    
    
}


