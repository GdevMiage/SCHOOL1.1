 
package gestionetablissement.modele;

import gestionetablissement.securite.Affectations;
import java.util.ArrayList;
import java.util.Date;

 
public class Enseignants extends Individus {
    
 private ArrayList<String>     listeCompetence; 
 private ArrayList<String>     listeTache; 
 private ArrayList<String>     listeRapport; 

 
 public static final ListPro<Enseignants> listeEnseignants = new ListPro<Enseignants>();
   
    {
        this.listeEnseignants.add(this);
    }

    public Enseignants(int id){
        super(id);
    }
    
    public Enseignants( String nomIndividu, String prenomIndividu, String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu, String nivEtudIndividu, String domEtudIndividu, String profIndividu, Adresses domCompetIndividu, String langMatIndividu, String langParlIndividu, String photoIndividu, String rectoPIDIndividu, String versoPIDIndividu,String tel,String mail, Affectations affectation,ArrayList<String> listeCompetence,ArrayList<String> listeTache, ArrayList<String> listeRapport) {
       super(nomIndividu,prenomIndividu,genreIndividu,datNaisIndividu,lieuNaisIndividu,nivEtudIndividu,domEtudIndividu,profIndividu,domCompetIndividu,langMatIndividu,langParlIndividu,photoIndividu,rectoPIDIndividu,versoPIDIndividu, tel,mail,affectation);
       this.listeCompetence=listeCompetence;
       this.listeCompetence=listeRapport;
       this.listeCompetence=listeTache;

    }
    





    
}
