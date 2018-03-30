
package gestionetablissement;

import java.util.Date;


public class Debuts {
    
  private int idDebut;
  private Date  heureDebut;//a chnager avec un objet heure / c'est bon

    public Debuts(int idDebut, Date heureDebut) {
        this.idDebut = idDebut;
        this.heureDebut = heureDebut;
    }

    public int getIdDebut() {
        return idDebut;
    }

    public void setIdDebut(int idDebut) {
        this.idDebut = idDebut;
    }

    public Date getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(Date heureDebut) {
        this.heureDebut = heureDebut;
    }



  
    
}
