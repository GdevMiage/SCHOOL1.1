 
package gestionetablissement.modele;

import java.util.Date;

 
public class Entretien extends Individus {
    
    private ListPro<Entretien> listeAgentEntretien;


    public Entretien(int idIndividu, String nomIndividu, String prenomIndividu, String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu, String nivEtudIndividu, String domEtudIndividu, String profIndividu, Adresses domCompetIndividu, String langMatIndividu, String langParlIndividu, String photoIndividu, String rectoPIDIndividu, String versoPIDIndividu, Affectations affectation) {
       super(idIndividu,nomIndividu,prenomIndividu,genreIndividu,datNaisIndividu,lieuNaisIndividu,nivEtudIndividu,domEtudIndividu,profIndividu,domCompetIndividu,langMatIndividu,langParlIndividu,photoIndividu,rectoPIDIndividu,versoPIDIndividu,affectation);
       
    }
    
    public Entretien(int idIndividu, String nomIndividu, String prenomIndividu, String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu, String nivEtudIndividu, String domEtudIndividu, String profIndividu, Adresses domCompetIndividu, String langMatIndividu, String langParlIndividu, String photoIndividu, String rectoPIDIndividu, String versoPIDIndividu, Affectations affectation,ListPro<Individus> listeIndividus,ListPro<Entretien> listeAgentEntretien) {
       super(idIndividu,nomIndividu,prenomIndividu,genreIndividu,datNaisIndividu,lieuNaisIndividu,nivEtudIndividu,domEtudIndividu,profIndividu,domCompetIndividu,langMatIndividu,langParlIndividu,photoIndividu,rectoPIDIndividu,versoPIDIndividu,affectation,listeIndividus);
       this.listeAgentEntretien=listeAgentEntretien;
       listeAgentEntretien.add(this);
       
    }

    public ListPro<Entretien> getListeAgentEntretien() {
        return listeAgentEntretien;
    }

    public void setListeAgentEntretien(ListPro<Entretien> listeAgentEntretien) {
        this.listeAgentEntretien = listeAgentEntretien;
    }
 

    
}
