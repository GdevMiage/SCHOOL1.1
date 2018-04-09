
package gestionetablissement.modele;

import java.util.ArrayList;
import java.util.Date;


public class Groupes {
    
 private int idGroupe;
 private ArrayList<Sessions>    listeSession;
 private ArrayList<Plannings>   listePlanning;
 private ArrayList<Salles>      listeSalles;
 private ArrayList<Modules>     listeModules;
 private ArrayList<Enseignants> listeEnseignants;
 private ArrayList<Etudiants>   listeEtudiants;
 private ArrayList<String>      listeCompetence;
 private int                    capacite;
 private String                 libelGroupe;
 private String                 commentGroupe;
 private String                 effSuplemGroupe;
 private ArrayList<Seances>     seanSuplGroupe; 
 private ArrayList<Seances>     seanceGroupe; 
 private ArrayList<Date>        dateExamGroupe;  
 private int                    dureePauseHoraire;
 private ListPro<Groupes>       listeGroupe;
public Groupes(){
    
}
    public Groupes(int idGroupe, ArrayList<Sessions>    listeSession, ArrayList<Plannings>   listePlanning,
            ArrayList<Salles> listeSalles, ArrayList<Modules>listeModules,ArrayList<Enseignants> listeEnseignants,
           ArrayList<Etudiants> listeEtudiants,ArrayList<String>listeCompetence,int capacite,
            String libelGroupe, String commentGroupe, String effSuplemGroupe,
            ArrayList<Seances>     seanceGroupe,ArrayList<Seances> seanSuplGroupe, ArrayList<Date> dateExamGroupe, int dureePauseHoraire) {
        this.idGroupe = idGroupe;
        this.listeSession = listeSession;
        this.listeSalles =listeSalles ;
        this.listePlanning =listePlanning ;
        this.listeModules = listeModules;
        this.listeEtudiants = listeEtudiants;
        this.listeEnseignants = listeEnseignants;
        this.listeCompetence = listeCompetence;
        this.libelGroupe = libelGroupe;
        this.commentGroupe = commentGroupe;
        this.effSuplemGroupe = effSuplemGroupe;
        this.seanceGroupe = seanceGroupe;
        this.seanSuplGroupe =seanSuplGroupe ;
        this.dateExamGroupe = dateExamGroupe;
        this.dureePauseHoraire = dureePauseHoraire;
    }

    public ArrayList<Sessions> getListeSession() {
        return listeSession;
    }

    public void setListeSession(ArrayList<Sessions> listeSession) {
        this.listeSession = listeSession;
    }

    public ArrayList<Plannings> getListePlanning() {
        return listePlanning;
    }

    public void setListePlanning(ArrayList<Plannings> listePlanning) {
        this.listePlanning = listePlanning;
    }

    public ArrayList<Salles> getListeSalles() {
        return listeSalles;
    }

    public void setListeSalles(ArrayList<Salles> listeSalles) {
        this.listeSalles = listeSalles;
    }

    public ArrayList<Modules> getListeModules() {
        return listeModules;
    }

    public void setListeModules(ArrayList<Modules> listeModules) {
        this.listeModules = listeModules;
    }

    public ArrayList<Enseignants> getListeEnseignants() {
        return listeEnseignants;
    }

    public void setListeEnseignants(ArrayList<Enseignants> listeEnseignants) {
        this.listeEnseignants = listeEnseignants;
    }

    public ArrayList<Etudiants> getListeEtudiants() {
        return listeEtudiants;
    }

    public void setListeEtudiants(ArrayList<Etudiants> listeEtudiants) {
        this.listeEtudiants = listeEtudiants;
    }

    public ArrayList<String> getListeCompetence() {
        return listeCompetence;
    }

    public void setListeCompetence(ArrayList<String> listeCompetence) {
        this.listeCompetence = listeCompetence;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public ArrayList<Seances> getSeanSuplGroupe() {
        return seanSuplGroupe;
    }

    public void setSeanSuplGroupe(ArrayList<Seances> seanSuplGroupe) {
        this.seanSuplGroupe = seanSuplGroupe;
    }

    public ArrayList<Seances> getSeanceGroupe() {
        return seanceGroupe;
    }

    public void setSeanceGroupe(ArrayList<Seances> seanceGroupe) {
        this.seanceGroupe = seanceGroupe;
    }

    public ArrayList<Date> getDateExamGroupe() {
        return dateExamGroupe;
    }

    public void setDateExamGroupe(ArrayList<Date> dateExamGroupe) {
        this.dateExamGroupe = dateExamGroupe;
    }

    public int getDureePauseHoraire() {
        return dureePauseHoraire;
    }

    public void setDureePauseHoraire(int dureePauseHoraire) {
        this.dureePauseHoraire = dureePauseHoraire;
    }

    public ListPro<Groupes> getListeGroupe() {
        return listeGroupe;
    }

    public void setListeGroupe(ListPro<Groupes> listeGroupe) {
        this.listeGroupe = listeGroupe;
    }
    public Groupes(int idGroupe, Sessions session,
           int capacite,String libelGroupe, String commentGroupe, 
           int dureePauseHoraire,ListPro<Groupes>listeGroupe) {
         this.idGroupe = idGroupe;
        this.listeSession.add(session);
        this.libelGroupe = libelGroupe;
        this.commentGroupe = commentGroupe;
        this.dateExamGroupe = dateExamGroupe;
        this.dureePauseHoraire = dureePauseHoraire;
        this.listeGroupe = listeGroupe;
        listeGroupe.add(this);
        
    }
  public Groupes(int idGroupe, ArrayList<Sessions>    listeSession, ArrayList<Plannings>   listePlanning,
            ArrayList<Salles> listeSalles, ArrayList<Modules>listeModules,ArrayList<Enseignants> listeEnseignants,
           ArrayList<Etudiants> listeEtudiants,ArrayList<String>listeCompetence,int capacite,
            String libelGroupe, String commentGroupe, String effSuplemGroupe,
            ArrayList<Seances>     seanceGroupe,ArrayList<Seances> seanSuplGroupe
          , ArrayList<Date> dateExamGroupe, int dureePauseHoraire,ListPro<Groupes>listeGroupe) {
      
        this.idGroupe = idGroupe;
        this.listeSession = listeSession;
        this.listeSalles =listeSalles ;
        this.listePlanning =listePlanning ;
        this.listeModules = listeModules;
        this.listeEtudiants = listeEtudiants;
        this.listeEnseignants = listeEnseignants;
        this.listeCompetence = listeCompetence;
        this.libelGroupe = libelGroupe;
        this.commentGroupe = commentGroupe;
        this.effSuplemGroupe = effSuplemGroupe;
        this.seanceGroupe = seanceGroupe;
        this.seanSuplGroupe =seanSuplGroupe ;
        this.dateExamGroupe = dateExamGroupe;
        this.dureePauseHoraire = dureePauseHoraire;
        this.listeGroupe = listeGroupe;
        listeGroupe.add(this);
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



 
 
 
}
