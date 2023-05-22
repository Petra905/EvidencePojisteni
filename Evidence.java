
package cz.itnetwork.evidencepojisteni2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Petra Hechtova
 */
public class Evidence {

    static String format(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private Databaze databaze;
   
    private Scanner sc = new Scanner(System.in, "Windows-1250");

    public Evidence() {
        databaze = new Databaze();
    }
    public void pridejZaznam() {
        System.out.println("Zadejte jmeno pojištěnce:");
        String jmeno = sc.nextLine();
 
        System.out.println("Zadejte příjmení pojištěnce:");
        String prijmeni = sc.nextLine();
        
        System.out.println("Zadejte věk pojištěnce:");
        int vek = Integer.parseInt(sc.nextLine());
  
        System.out.println("Zadejte telefonní číslo pojištěnce:");
        int cisloTel = Integer.parseInt(sc.nextLine());
        
        databaze.pridejZaznam(jmeno, prijmeni);
        databaze.pridejZaznam(vek, cisloTel);
    }
    
    public void vypisZaznamy() {
        ArrayList<Zaznam> zaznamy = databaze.najdiZaznamy(String jmeno, String prijmeni, int vek, int cisloTel);
        for (Zaznam z : zaznamy) {
            System.out.println
        (z);
        }
        System.out.println("Pokračujte libovolnou klávesou...");
    }

    public void vyhledejZaznamy() {
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = sc.nextLine();
        System.out.println("Zadejte příjmení pojištěného:");
        String prijmeni = sc.nextLine();
        ArrayList<Zaznam> zaznamy = databaze.najdiZaznamy(jmeno, false);
        if (zaznamy.size() > 0) {
            System.out.println("Nalezeny tyto záznamy: ");
            for (Zaznam z : zaznamy) {
                System.out.println(z);
            }
        } else {
            // Nenalezeno
            System.out.println("Nebyly nalezeny žádné záznamy.");
        }
   
    }

    public void vypisUvodniObrazovku() {
        System.out.println();
        System.out.println("--------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("--------------------");
        System.out.println();
    }

 
}

