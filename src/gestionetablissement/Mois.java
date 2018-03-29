
package gestionetablissement;


public class Mois {
    
   private int idMois;
   private String nomMois;

    public Mois(int idMois, String nomMois) {
        this.idMois = idMois;
        this.nomMois = nomMois;
    }

    public int getIdMois() {
        return idMois;
    }

    public void setIdMois(int idMois) {
        this.idMois = idMois;
    }

    public String getNomMois() {
        return nomMois;
    }

    public void setNomMois(String nomMois) {
        this.nomMois = nomMois;
    }
   
   
   
   
}
