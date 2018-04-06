 
package gestionetablissement.modele;

import java.util.ArrayList;
import java.util.Date;

 
public class Etudiants extends Individus  {
 private String numEtudiant ;
 private ArrayList<Modules> ListeModules;
 private Inscriptions inscription ;
 private ArrayList<Modules> ListeModulesValide;
 private ArrayList<Assiduites> ListeAbsences;
 private ArrayList<Assiduites> ListePresences;
 private ArrayList<Evaluations> ListeEvaluations;

 private ListPro<Etudiants>  listeEtudiants;

    public Etudiants(){
        
    }
    
    public Etudiants(int idIndividu, String nomIndividu, String prenomIndividu, 
        String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu,
        String nivEtudIndividu, String domEtudIndividu, 
        String profIndividu, Adresses domCompetIndividu, String langMatIndividu,
        String langParlIndividu, String photoIndividu, String rectoPIDIndividu,
        String versoPIDIndividu, Affectations affectation,Inscriptions inscription ,
        String numEtudiant ) {
    super(idIndividu,nomIndividu,prenomIndividu,genreIndividu,
            datNaisIndividu,lieuNaisIndividu,nivEtudIndividu,
            domEtudIndividu,profIndividu,domCompetIndividu,langMatIndividu,
            langParlIndividu,photoIndividu,rectoPIDIndividu,
            versoPIDIndividu,affectation);
    this.inscription = inscription;
  

    }
    
    
       public Etudiants(int idIndividu, String nomIndividu, String prenomIndividu, 
        String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu,
        String nivEtudIndividu, String domEtudIndividu, 
        String profIndividu, Adresses domCompetIndividu, String langMatIndividu,
        String langParlIndividu, String photoIndividu, String rectoPIDIndividu,
        String versoPIDIndividu, Affectations affectation,Inscriptions inscription ,
        String numEtudiant,ListPro<Etudiants>  listeEtudiants ) {
    super(idIndividu,nomIndividu,prenomIndividu,genreIndividu,
            datNaisIndividu,lieuNaisIndividu,nivEtudIndividu,
            domEtudIndividu,profIndividu,domCompetIndividu,langMatIndividu,
            langParlIndividu,photoIndividu,rectoPIDIndividu,
            versoPIDIndividu,affectation);
    this.inscription = inscription;
    this.listeEtudiants = listeEtudiants;
    listeEtudiants.add(this);

    }
   


    
    
}
