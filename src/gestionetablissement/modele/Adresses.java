
package gestionetablissement.modele;


public class Adresses {
  private int idAdresse;
  private Individus [] listeIndividus;
  private int batAdresse;
  private int noAdresse;
  private String rueAdresse; 
  private int cpAdresse;
  private String villeAdresse;
  private String paysAdresse;

  
    public Adresses(int idAdresse, Individus [] individus, int batAdresse, int noAdresse, String rueAdresse, int cpAdresse, String villeAdresse, String paysAdresse) {
        this.idAdresse = idAdresse;
        this.listeIndividus = individus;
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

    public Individus[] getListeIndividus() {
        return listeIndividus;
    }

    public void setListeIndividus(Individus[] listeIndividus) {
        this.listeIndividus = listeIndividus;
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