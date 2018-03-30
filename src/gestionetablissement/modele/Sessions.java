
package gestionetablissement.modele;

import java.util.Date;


public class Sessions {
  private int idSession;
  private Date annee;
  private String libelSession;
  private Date dateDebutSession;
  private Date dateFinSession;
  private Date[] joursFerieSession;

    public Sessions(int idSession, Date annee, String libelSession, Date dateDebutSession, Date dateFinSession, Date[] joursFerieSession) {
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

    public Date getAnnee() {
        return annee;
    }

    public void setAnnee(Date annee) {
        this.annee = annee;
    }

    public Date[] getJoursFerieSession() {
        return joursFerieSession;
    }

    public void setJoursFerieSession(Date[] joursFerieSession) {
        this.joursFerieSession = joursFerieSession;
    }


  
  
  
    
}
