
package gestionetablissement;

import java.util.Date;


public class Sessions {
  private int idSession;
  private Annees annee;
  private String libelSession;
  private Date dateDebutSession;
  private Date dateFinSession;
  private Jours[] joursFerieSession;

    public Sessions(int idSession, Annees annee, String libelSession, Date dateDebutSession, Date dateFinSession, Jours[] joursFerieSession) {
        this.idSession = idSession;
        this.annee = annee;
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

    public Annees getAnnee() {
        return annee;
    }

    public void setAnnee(Annees annee) {
        this.annee = annee;
    }

    public Jours[] getJoursFerieSession() {
        return joursFerieSession;
    }

    public void setJoursFerieSession(Jours[] joursFerieSession) {
        this.joursFerieSession = joursFerieSession;
    }


  
  
  
    
}
