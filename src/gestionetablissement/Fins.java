
package gestionetablissement;

import java.util.Date;


public class Fins {
    
    private int idFin;
    private Date heureFin;

    public Fins(int idFin, Date heureFin) {
        this.idFin = idFin;
        this.heureFin = heureFin;
    }

    public int getIdFin() {
        return idFin;
    }

    public void setIdFin(int idFin) {
        this.idFin = idFin;
    }

    public Date getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(Date heureFin) {
        this.heureFin = heureFin;
    }

   
    
    
    
    
}
