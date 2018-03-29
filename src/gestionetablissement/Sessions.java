
package gestionetablissement;

import java.util.Date;


public class Sessions {
  private int idSession;
  private Annees annee;
  private String libelSession;
  private Date dateDebutSession;
  private Date dateFinSession;
  private Jours[] joursFerieSession;

    public Sessions(int idSession, int idAnnee, String libelSession, Date dateDebutSession, Date dateFinSession, String joursFerieSession) {
        this.idSession = idSession;
        this.idAnnee = idAnnee;
        this.libelSession = libelSession;
        this.dateDebutSession = dateDebutSession;
        this.dateFinSession = dateFinSession;
        this.joursFerieSession = joursFerieSession;
    }

    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    public int getIdAnnee() {
        return idAnnee;
    }

    public void setIdAnnee(int idAnnee) {
        this.idAnnee = idAnnee;
    }

    public String getLibelSession() {
        return libelSession;
    }

    public void setLibelSession(String libelSession) {
        this.libelSession = libelSession;
    }

    public Date getDateDebutSession() {
        return dateDebutSession;
    }

    public void setDateDebutSession(Date dateDebutSession) {
        this.dateDebutSession = dateDebutSession;
    }

    public Date getDateFinSession() {
        return dateFinSession;
    }

    public void setDateFinSession(Date dateFinSession) {
        this.dateFinSession = dateFinSession;
    }

    public String getJoursFerieSession() {
        return joursFerieSession;
    }

    public void setJoursFerieSession(String joursFerieSession) {
        this.joursFerieSession = joursFerieSession;
    }
  
  
  
  
    
}
