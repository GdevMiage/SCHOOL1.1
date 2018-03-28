
package gestionetablissement;


public class Adresses {
    int idAdresse;
   int idIndividu;
   int batAdresse;
   int noAdresse;
   String rueAdresse; 
   int cpAdresse;
   String villeAdresse;
   String paysAdresse;

    public Adresses(int idAdresse, int idIndividu, int batAdresse, int noAdresse, String rueAdresse, int cpAdresse, String villeAdresse, String paysAdresse) {
        this.idAdresse = idAdresse;
        this.idIndividu = idIndividu;
        this.batAdresse = batAdresse;
        this.noAdresse = noAdresse;
        this.rueAdresse = rueAdresse;
        this.cpAdresse = cpAdresse;
        this.villeAdresse = villeAdresse;
        this.paysAdresse = paysAdresse;
    }

    public int getIdAdresse() {
        return idAdresse;
    }

    public void setIdAdresse(int idAdresse) {
        this.idAdresse = idAdresse;
    }

    public int getIdIndividu() {
        return idIndividu;
    }

    public void setIdIndividu(int idIndividu) {
        this.idIndividu = idIndividu;
    }

    public int getBatAdresse() {
        return batAdresse;
    }

    public void setBatAdresse(int batAdresse) {
        this.batAdresse = batAdresse;
    }

    public int getNoAdresse() {
        return noAdresse;
    }

    public void setNoAdresse(int noAdresse) {
        this.noAdresse = noAdresse;
    }

    public String getRueAdresse() {
        return rueAdresse;
    }

    public void setRueAdresse(String rueAdresse) {
        this.rueAdresse = rueAdresse;
    }

    public int getCpAdresse() {
        return cpAdresse;
    }

    public void setCpAdresse(int cpAdresse) {
        this.cpAdresse = cpAdresse;
    }

    public String getVilleAdresse() {
        return villeAdresse;
    }

    public void setVilleAdresse(String villeAdresse) {
        this.villeAdresse = villeAdresse;
    }

    public String getPaysAdresse() {
        return paysAdresse;
    }

    public void setPaysAdresse(String paysAdresse) {
        this.paysAdresse = paysAdresse;
    }
    
    
    
    
    
   
    
}
