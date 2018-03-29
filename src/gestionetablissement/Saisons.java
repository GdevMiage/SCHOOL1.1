
package gestionetablissement;


public class Saisons {
   private int idSaison;
   private String nomSaison;

    public Saisons(int idSaison, String nomSaison) {
        this.idSaison = idSaison;
        this.nomSaison = nomSaison;
    }

    public int getIdSaison() {
        return idSaison;
    }

    public void setIdSaison(int idSaison) {
        this.idSaison = idSaison;
    }

    public String getNomSaison() {
        return nomSaison;
    }

    public void setNomSaison(String nomSaison) {
        this.nomSaison = nomSaison;
    }
   
   
    
}
