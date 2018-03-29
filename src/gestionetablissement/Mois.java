
package gestionetablissement;


public class Mois {
    public enum mois{JANVIER,FEVRIER,MARS,AVEIL,MAI,JUIN,JUILLET,AOUT,SEPTEMBTE,OCTOBRE,NOVEMBRE,DECEMBRE}
    
    private int idMois;
    private mois nomMois;

    public Mois(int idMois, mois nomMois) {
        this.idMois = idMois;
        this.nomMois = nomMois;
    }

    public int getIdMois() {
        return idMois;
    }

    public void setIdMois(int idMois) {
        this.idMois = idMois;
    }

    public mois getNomMois() {
        return nomMois;
    }

    public void setNomMois(mois nomMois) {
        this.nomMois = nomMois;
    }
    
    
    
    
}
