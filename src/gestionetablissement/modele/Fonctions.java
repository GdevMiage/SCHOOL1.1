
package gestionetablissement.modele;


public class Fonctions {
    
   private int idFonction; 
   private String libelFonction;

    public Fonctions(int idFonction, String libelFonction) {
        this.idFonction = idFonction;
        this.libelFonction = libelFonction;
    }

    public int getIdFonction() {
        return idFonction;
    }

    public void setIdFonction(int idFonction) {
        this.idFonction = idFonction;
    }

    public String getLibelFonction() {
        return libelFonction;
    }

    public void setLibelFonction(String libelFonction) {
        this.libelFonction = libelFonction;
    }
   
   
   
}
