
package gestionetablissement;

import java.util.Date;


public class Debuts {
    
  private int idDebut;
  private Date  heureDebut;//a chnager avec un objet heure / c'est bon

    public Debuts(int idDebut, String heureDebut) {
        this.idDebut = idDebut;
        this.heureDebut = heureDebut;
    }

    public int getIdDebut() {
        return idDebut;
    }

    public void setIdDebut(int idDebut) {
        this.idDebut = idDebut;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }



  
    
}
