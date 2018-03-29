
package gestionetablissement;

import java.util.Date;


public class Groupes {
    
 private int idGroupe;
 private int idSession;
 private int idPlanning;
 private int idSalle;
 private int idModule;
 private int idCompetence;
 private String libelGroupe;
 private String genreGroupe;
 private String commentGroupe;
 private String effSuplemGroupe;
 private String seanSuplGroupe; 
 private Date dateExamGroupe;
 private String heurePauseHoraire;   
 private String dureePauseHoraire;

    public Groupes(int idGroupe, int idSession, int idPlanning, int idSalle, int idModule, int idCompetence, String libelGroupe, String genreGroupe, String commentGroupe, String effSuplemGroupe, String seanSuplGroupe, Date dateExamGroupe, String heurePauseHoraire, String dureePauseHoraire) {
        this.idGroupe = idGroupe;
        this.idSession = idSession;
        this.idPlanning = idPlanning;
        this.idSalle = idSalle;
        this.idModule = idModule;
        this.idCompetence = idCompetence;
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

    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    public int getIdPlanning() {
        return idPlanning;
    }

    public void setIdPlanning(int idPlanning) {
        this.idPlanning = idPlanning;
    }

    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public int getIdModule() {
        return idModule;
    }

    public void setIdModule(int idModule) {
        this.idModule = idModule;
    }

    public int getIdCompetence() {
        return idCompetence;
    }

    public void setIdCompetence(int idCompetence) {
        this.idCompetence = idCompetence;
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

    public String getHeurePauseHoraire() {
        return heurePauseHoraire;
    }

    public void setHeurePauseHoraire(String heurePauseHoraire) {
        this.heurePauseHoraire = heurePauseHoraire;
    }

    public String getDureePauseHoraire() {
        return dureePauseHoraire;
    }

    public void setDureePauseHoraire(String dureePauseHoraire) {
        this.dureePauseHoraire = dureePauseHoraire;
    }
 
 
 
 
}
