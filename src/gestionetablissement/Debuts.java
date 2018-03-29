
package gestionetablissement;


public class Debuts {
    
  private int idDebut;
  private String heureDebut;//a chnager avec un objet heure

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
