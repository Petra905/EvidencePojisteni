
package cz.itnetwork.evidencepojisteni2;


/**
 *
 * @author Petra Hechtova
 */
public class Zaznam {
    
    private String jmeno;
    private String prijmeni;
    private int vek;
    private int cisloTel;


    public Zaznam() {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.cisloTel = cisloTel;
    }
    
        
    public String getJmeno() {
        return jmeno;
    }
    public String getPrijmeni() {
        return prijmeni;
    }
    public int getVek() {
        return vek;
    }
    public int getCisloTel() {
        return cisloTel;
    }

    /**
     * @param set zaznamy
     */
    
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }
    public void setVek(int vek) {
        this.vek = vek;
    }
    public void setCisloTel(int cisloTel) {
        this.cisloTel = cisloTel;
    }
    

    @Override
    public String toString() {
        return Evidence.format(jmeno + " " + prijmeni + " " + vek + "  " + cisloTel);
    }

}

