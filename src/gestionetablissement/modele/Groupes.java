
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
