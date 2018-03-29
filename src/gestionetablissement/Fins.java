
package gestionetablissement;

import java.util.Date;


public class Fins {
    
    private int idFin;
    private Date heureFin;

    public Fins(int idFin, String heureFin) {
        this.idFin = idFin;
        this.heureFin = heureFin;
    }

    public int getIdFin() {
        return idFin;
    }

    public void setIdFin(int idFin) {
        this.idFin = idFin;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }
    
    
    
    
    
}
