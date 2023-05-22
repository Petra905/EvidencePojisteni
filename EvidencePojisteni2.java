
package cz.itnetwork.evidencepojisteni2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EvidencePojisteni2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        Evidence evidence = new Evidence();
        String volba = "";
        
        while (!volba.equals("4")) {
            evidence.vypisUvodniObrazovku();
            System.out.println();
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěnce");
            System.out.println("2 - Vypsat všechny pojištěnce");
            System.out.println("3 - Vyhledat pojištěnce");
            System.out.println("4 - Konec");
            volba = sc.nextLine();
            System.out.println();
            // reakce na volbu
            switch (volba) {
                case "1":
                    evidence.pridejZaznam();
                    break;
                case "2":
                    evidence.vypisZaznamy();
                    break;
                case "3":
                    evidence.vyhledejZaznamy();
                    break;
                case "4":
                    System.out.println("Libovolnou klávesou ukončíte program...");
                    break;
                default:
                    System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
                    break;
            }
        }
    }
}

        