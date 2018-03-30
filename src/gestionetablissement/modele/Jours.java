
package gestionetablissement.modele;


public class Jours {
    public enum Jour{LUNDI,MARDI,MERCREDI,JEUDI,VENDREDI,SAMEDI,DIMANCHE};
    
    private int idJours;
    private Jour nomJours;

    public Jours(int idJours, Jour nomJours) {
        this.idJours = idJours;
        this.nomJours = nomJours;
    }

    public int getIdJours() {
        return idJours;
    }

    public void setIdJours(int idJours) {
        this.idJours = idJours;
    }

    public Jour getNomJours() {
        return nomJours;
    }

    
    public void setNomJours(Jour nomJours) {
        this.nomJours = nomJours;
    }
    
    
    
    
    
}
