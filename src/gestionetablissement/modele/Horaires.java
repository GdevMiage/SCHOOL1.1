
package gestionetablissement.modele;

import java.util.Date;


public class Horaires {
    
  private int idHoraire;
  
  private Date jour;
  private Date debut;
  private Date fin;
  private String libelHoraire;
  private ListPro<Horaires> listeHoraire;
  
    public Horaires(){
        
    }
  
    public Horaires(int idHoraire, Date jour, Date debut, Date fin, String libelHoraire,ListPro<Horaires> listeHoraire) {
        this.idHoraire = idHoraire;
       
        this.jour = jour;
        this.debut = debut;
        this.fin = fin;
        this.libelHoraire = libelHoraire;
        this.listeHoraire = listeHoraire;
        listeHoraire.add(this);
    }

    public int getIdHoraire() {
        return idHoraire;
    }

    public void setIdHoraire(int idHoraire) {
        this.idHoraire = idHoraire;
    }



    public Date getJour() {
        return jour;
    }

    public void setJour(Date jour) {
        this.jour = jour;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }



   

    public String getLibelHoraire() {
        return libelHoraire;
    }

    public void setLibelHoraire(String libelHoraire) {
        this.libelHoraire = libelHoraire;
    }
  
  
  
  
    
}
