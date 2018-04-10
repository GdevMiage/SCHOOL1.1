 
package gestionetablissement.modele;

import gestionetablissement.securite.Affectations;
import java.util.ArrayList;
import java.util.Date;

 
public class Etudiants extends Individus  {
 private String numEtudiant ;
 private ArrayList<Modules> ListeModules;
 private Inscriptions inscription ;
 private ArrayList<Modules> ListeModulesValide;
 private ArrayList<Evaluations> ListeEvaluations;
private ArrayList<Groupes> ListeGroupes;
 private ListPro<Etudiants>  listeEtudiants;

    public Etudiants(int id){
        super(id);
    }
    
    public Etudiants(String nomIndividu, String prenomIndividu, 
        String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu,
        String nivEtudIndividu, String domEtudIndividu, 
        String profIndividu, Adresses domCompetIndividu, String langMatIndividu,
        String langParlIndividu, String photoIndividu, String rectoPIDIndividu,
        String versoPIDIndividu,String tel,String mail, Affectations affectation,Inscriptions inscription ,
        String numEtudiant ) {
    super(nomIndividu,prenomIndividu,genreIndividu,
            datNaisIndividu,lieuNaisIndividu,nivEtudIndividu,
            domEtudIndividu,profIndividu,domCompetIndividu,langMatIndividu,
            langParlIndividu,photoIndividu,rectoPIDIndividu,
            versoPIDIndividu,tel, mail,affectation);
    this.inscription = inscription;
  

    }

   public Etudiants( String nomIndividu, String prenomIndividu, 
        String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu,
        String nivEtudIndividu, String domEtudIndividu, 
        String profIndividu, Adresses domCompetIndividu, String langMatIndividu,
        String langParlIndividu, String photoIndividu, String rectoPIDIndividu,
        String versoPIDIndividu,String tel,String mail ) {
    super( nomIndividu,prenomIndividu,genreIndividu,
            datNaisIndividu,lieuNaisIndividu,nivEtudIndividu,
            domEtudIndividu,profIndividu,domCompetIndividu,langMatIndividu,
            langParlIndividu,photoIndividu,rectoPIDIndividu,
            versoPIDIndividu, tel, mail);
    
  

    }
    public String getNumEtudiant() {
        return numEtudiant;
    }

    public void setNumEtudiant(String numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

    public ArrayList<Modules> getListeModules() {
        return ListeModules;
    }

    public void setListeModules(ArrayList<Modules> ListeModules) {
        this.ListeModules = ListeModules;
    }

    public Inscriptions getInscription() {
        return inscription;
    }

    public void setInscription(Inscriptions inscription) {
        this.inscription = inscription;
    }

    public ArrayList<Modules> getListeModulesValide() {
        return ListeModulesValide;
    }

    public void setListeModulesValide(ArrayList<Modules> ListeModulesValide) {
        this.ListeModulesValide = ListeModulesValide;
    }



   

    public ArrayList<Evaluations> getListeEvaluations() {
        return ListeEvaluations;
    }

    public void setListeEvaluations(ArrayList<Evaluations> ListeEvaluations) {
        this.ListeEvaluations = ListeEvaluations;
    }

    public ListPro<Etudiants> getListeEtudiants() {
        return listeEtudiants;
    }

    public void setListeEtudiants(ListPro<Etudiants> listeEtudiants) {
        this.listeEtudiants = listeEtudiants;
    }

    public ArrayList<Groupes> getListeGroupes() {
        return ListeGroupes;
    }

    public void setListeGroupes(ArrayList<Groupes> ListeGroupes) {
        this.ListeGroupes = ListeGroupes;
    }
    
    
      
   


    
    
}
