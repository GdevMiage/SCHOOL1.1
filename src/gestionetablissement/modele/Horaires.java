
package gestionetablissement.modele;


public class Horaires {
    
  private int idHoraire;
  private Sessions session;
  private Jours jour;
  private Debuts debut;
  private Fins fin;
  private String libelHoraire;

    public Horaires(int idHoraire, Sessions session, Jours jour, Debuts debut, Fins fin, String libelHoraire) {
        this.idHoraire = idHoraire;
        this.session = session;
        this.jour = jour;
        this.debut = debut;
        this.fin = fin;
        this.libelHoraire = libelHoraire;
    }

    public int getIdHoraire() {
        return idHoraire;
    }

    public void setIdHoraire(int idHoraire) {
        this.idHoraire = idHoraire;
    }

    public Sessions getSession() {
        return session;
    }

    public void setSession(Sessions session) {
        this.session = session;
    }

    public Jours getJour() {
        return jour;
    }

    public void setJour(Jours jour) {
        this.jour = jour;
    }

    public Debuts getDebut() {
        return debut;
    }

    public void setDebut(Debuts debut) {
        this.debut = debut;
    }

    public Fins getFin() {
        return fin;
    }

    public void setFin(Fins fin) {
        this.fin = fin;
    }



   

    public String getLibelHoraire() {
        return libelHoraire;
    }

    public void setLibelHoraire(String libelHoraire) {
        this.libelHoraire = libelHoraire;
    }
  
  
  
  
    
}
