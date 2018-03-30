
package gestionetablissement.modele;

import java.util.Date;


public class Groupes {
    
 private int idGroupe;
 private Sessions session;
 private Plannings planning;
 private Salles salle;
 private Modules module;
 private Competence competence;
 private String libelGroupe;
 private String genreGroupe;
 private String commentGroupe;
 private String effSuplemGroupe;
 private String seanSuplGroupe; 
 private Date dateExamGroupe;
 private Date heurePauseHoraire;   
 private Date dureePauseHoraire;

    public Groupes(int idGroupe, Sessions session, Plannings planning, Salles salle, Modules module, Competence competence, String libelGroupe, String genreGroupe, String commentGroupe, String effSuplemGroupe, String seanSuplGroupe, Date dateExamGroupe, Date heurePauseHoraire, Date dureePauseHoraire) {
        this.idGroupe = idGroupe;
        this.session = session;
        this.planning = planning;
        this.salle = salle;
        this.module = module;
        this.competence = competence;
        this.libelGroupe = libelGroupe;
        this.genreGroupe = genreGroupe;
        this.commentGroupe = commentGroupe;
        this.effSuplemGroupe = effSuplemGroupe;
        this.seanSuplGroupe = seanSuplGroupe;
        this.dateExamGroupe = dateExamGroupe;
        this.heurePauseHoraire = heurePauseHoraire;
        this.dureePauseHoraire = dureePauseHoraire;
    }

    public int getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }

    public String getLibelGroupe() {
        return libelGroupe;
    }

    public void setLibelGroupe(String libelGroupe) {
        this.libelGroupe = libelGroupe;
    }

    public String getGenreGroupe() {
        return genreGroupe;
    }

    public void setGenreGroupe(String genreGroupe) {
        this.genreGroupe = genreGroupe;
    }

    public String getCommentGroupe() {
        return commentGroupe;
    }

    public void setCommentGroupe(String commentGroupe) {
        this.commentGroupe = commentGroupe;
    }

    public String getEffSuplemGroupe() {
        return effSuplemGroupe;
    }

    public void setEffSuplemGroupe(String effSuplemGroupe) {
        this.effSuplemGroupe = effSuplemGroupe;
    }

    public String getSeanSuplGroupe() {
        return seanSuplGroupe;
    }

    public void setSeanSuplGroupe(String seanSuplGroupe) {
        this.seanSuplGroupe = seanSuplGroupe;
    }

    public Date getDateExamGroupe() {
        return dateExamGroupe;
    }

    public void setDateExamGroupe(Date dateExamGroupe) {
        this.dateExamGroupe = dateExamGroupe;
    }


 
 
 
}
