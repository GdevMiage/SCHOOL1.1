
package gestionetablissement.modele;

import java.util.ArrayList;
import java.util.Date;


public class Sessions {
  private int idSession;
  private Date annee;
  private String libelSession;
  private Horaires debutFinSession ;
  private Date[] joursFerieSession;
  private ArrayList<Groupes> groupe ;
  private ArrayList<Charges> charges;
  private ArrayList<Produits> produits;
  private ListPro<Sessions> ListeSession;
  
  
    public Sessions(int idSession, Date annee, String libelSession, Horaires debutFinSession, Date[] joursFerieSession) {
        this.idSession = idSession;
        this.annee = annee;
        this.libelSession = libelSession;
        this.debutFinSession = debutFinSession;
        this.joursFerieSession = joursFerieSession;
        
    }
     public Sessions(int idSession, Date annee, String libelSession, Horaires debutFinSession, Date[] joursFerieSession,ListPro<Sessions> ListeSession) {
        this.idSession = idSession;
        this.annee = annee;
        this.libelSession = libelSession;
        this.debutFinSession = debutFinSession;
        this.joursFerieSession = joursFerieSession;
        this.ListeSession=ListeSession;
        ListeSession.add(this);
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
