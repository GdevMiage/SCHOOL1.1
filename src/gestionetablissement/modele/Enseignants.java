 
package gestionetablissement.modele;

import java.util.ArrayList;
import java.util.Date;

 
public class Enseignants extends Individus {
    
 private ArrayList<String>     listeCompetence; 
 private ArrayList<String>     listeTache; 
 private ArrayList<String>     listeRapport; 
 private ListPro<Enseignants>  listeEnseignants;

    public Enseignants(){
        
    }
    
    public Enseignants(int idIndividu, String nomIndividu, String prenomIndividu, String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu, String nivEtudIndividu, String domEtudIndividu, String profIndividu, Adresses domCompetIndividu, String langMatIndividu, String langParlIndividu, String photoIndividu, String rectoPIDIndividu, String versoPIDIndividu, Affectations affectation,ArrayList<String> listeCompetence,ArrayList<String> listeTache, ArrayList<String> listeRapport) {
       super(idIndividu,nomIndividu,prenomIndividu,genreIndividu,datNaisIndividu,lieuNaisIndividu,nivEtudIndividu,domEtudIndividu,profIndividu,domCompetIndividu,langMatIndividu,langParlIndividu,photoIndividu,rectoPIDIndividu,versoPIDIndividu,affectation);
       this.listeCompetence=listeCompetence;
       this.listeCompetence=listeRapport;
       this.listeCompetence=listeTache;

    }
    
    public Enseignants(int idIndividu, String nomIndividu, String prenomIndividu, String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu, String nivEtudIndividu, String domEtudIndividu, String profIndividu, Adresses domCompetIndividu, String langMatIndividu, String langParlIndividu, String photoIndividu, String rectoPIDIndividu, String versoPIDIndividu, Affectations affectation,ListPro<Individus> listeIndividus,ListPro<Enseignants> listeEnseignants) {
       super(idIndividu,nomIndividu,prenomIndividu,genreIndividu,datNaisIndividu,lieuNaisIndividu,nivEtudIndividu,domEtudIndividu,profIndividu,domCompetIndividu,langMatIndividu,langParlIndividu,photoIndividu,rectoPIDIndividu,versoPIDIndividu,affectation,listeIndividus);
        this.listeCompetence=listeCompetence;
       this.listeCompetence=listeRapport;
       this.listeCompetence=listeTache;

       this.listeEnseignants=listeEnseignants;
       listeEnseignants.add(this);
       
       
    }




    
}
