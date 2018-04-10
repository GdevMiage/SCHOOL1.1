 
package gestionetablissement.modele;

import gestionetablissement.securite.Affectations;
import java.util.Date;

 
public class Entretien extends Individus {
    
    private ListPro<Entretien> listeAgentEntretien;


    public Entretien(int idIndividu, String nomIndividu, String prenomIndividu, String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu, String nivEtudIndividu, String domEtudIndividu, String profIndividu, Adresses domCompetIndividu, String langMatIndividu, String langParlIndividu, String photoIndividu, String rectoPIDIndividu, String versoPIDIndividu,String tel,String mail, Affectations affectation) {
       super(idIndividu,nomIndividu,prenomIndividu,genreIndividu,datNaisIndividu,lieuNaisIndividu,nivEtudIndividu,domEtudIndividu,profIndividu,domCompetIndividu,langMatIndividu,langParlIndividu,photoIndividu,rectoPIDIndividu,versoPIDIndividu, tel,mail,affectation);
       
    }
    
    public Entretien(int idIndividu, String nomIndividu, String prenomIndividu, String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu, String nivEtudIndividu, String domEtudIndividu, String profIndividu, Adresses domCompetIndividu, String langMatIndividu, String langParlIndividu, String photoIndividu, String rectoPIDIndividu, String versoPIDIndividu,String tel,String mail) {
       super(idIndividu,nomIndividu,prenomIndividu,genreIndividu,datNaisIndividu,lieuNaisIndividu,nivEtudIndividu,domEtudIndividu,profIndividu,domCompetIndividu,langMatIndividu,langParlIndividu,photoIndividu,rectoPIDIndividu,versoPIDIndividu, tel,mail);
       
       listeAgentEntretien.add(this);
       
    }

    public ListPro<Entretien> getListeAgentEntretien() {
        return listeAgentEntretien;
    }

    public void setListeAgentEntretien(ListPro<Entretien> listeAgentEntretien) {
        this.listeAgentEntretien = listeAgentEntretien;
    }
 

    
}
