 
package gestionetablissement.modele;

 
public class Salles {
    
    private int idSalle;
    private String libelSalle;
    private int capaSalle;
    private boolean dispoSalle;

    public Salles(int idSalle, String libelSalle, int capaSalle, boolean dispoSalle) {
        this.idSalle = idSalle;
        this.libelSalle = libelSalle;
        this.capaSalle = capaSalle;
        this.dispoSalle = dispoSalle;
    }

    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public String getLibelSalle() {
        return libelSalle;
    }

    public void setLibelSalle(String libelSalle) {
        this.libelSalle = libelSalle;
    }

    public int getCapaSalle() {
        return capaSalle;
    }

    public void setCapaSalle(int capaSalle) {
        this.capaSalle = capaSalle;
    }

    public boolean isDispoSalle() {
        return dispoSalle;
    }

    public void setDispoSalle(boolean dispoSalle) {
        this.dispoSalle = dispoSalle;
    }
    
    
}
