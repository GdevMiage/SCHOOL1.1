
package gestionetablissement;


public class Horaires {
    
  private int idHoraire;
  private Sessions session;
  private Jours jour;
  private Debuts debut;
  private Fins Fin;
  private String libelHoraire;

    public Horaires(int idHoraire, String isSession, int idJours, int idDebut, int idFin, String libelHoraire) {
        this.idHoraire = idHoraire;
        this.isSession = isSession;
        this.idJours = idJours;
        this.idDebut = idDebut;
        this.idFin = idFin;
        this.libelHoraire = libelHoraire;
    }

    public int getIdHoraire() {
        return idHoraire;
    }

    public void setIdHoraire(int idHoraire) {
        this.idHoraire = idHoraire;
    }

    public String getIsSession() {
        return isSession;
    }

    public void setIsSession(String isSession) {
        this.isSession = isSession;
    }

    public int getIdJours() {
        return idJours;
    }

    public void setIdJours(int idJours) {
        this.idJours = idJours;
    }

    public int getIdDebut() {
        return idDebut;
    }

    public void setIdDebut(int idDebut) {
        this.idDebut = idDebut;
    }

    public int getIdFin() {
        return idFin;
    }

    public void setIdFin(int idFin) {
        this.idFin = idFin;
    }

    public String getLibelHoraire() {
        return libelHoraire;
    }

    public void setLibelHoraire(String libelHoraire) {
        this.libelHoraire = libelHoraire;
    }
  
  
  
  
    
}
