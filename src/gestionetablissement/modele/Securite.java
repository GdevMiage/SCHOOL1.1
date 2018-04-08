
package gestionetablissement.modele;

import gestionetablissement.securite.Affectations;
import java.util.Date;


public class Securite extends Individus {
private ListPro<Securite> listeAgentSecurite;


    public Securite(int idIndividu, String nomIndividu, String prenomIndividu, String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu, String nivEtudIndividu, String domEtudIndividu, String profIndividu, Adresses domCompetIndividu, String langMatIndividu, String langParlIndividu, String photoIndividu, String rectoPIDIndividu, String versoPIDIndividu, Affectations affectation) {
       super(idIndividu,nomIndividu,prenomIndividu,genreIndividu,datNaisIndividu,lieuNaisIndividu,nivEtudIndividu,domEtudIndividu,profIndividu,domCompetIndividu,langMatIndividu,langParlIndividu,photoIndividu,rectoPIDIndividu,versoPIDIndividu,affectation);
       
    }
    
    public Securite(int idIndividu, String nomIndividu, String prenomIndividu, String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu, String nivEtudIndividu, String domEtudIndividu, String profIndividu, Adresses domCompetIndividu, String langMatIndividu, String langParlIndividu, String photoIndividu, String rectoPIDIndividu, String versoPIDIndividu, Affectations affectation,ListPro<Individus> listeIndividus,ListPro<Securite> listeAgentSecurite) {
       super(idIndividu,nomIndividu,prenomIndividu,genreIndividu,datNaisIndividu,lieuNaisIndividu,nivEtudIndividu,domEtudIndividu,profIndividu,domCompetIndividu,langMatIndividu,langParlIndividu,photoIndividu,rectoPIDIndividu,versoPIDIndividu,affectation,listeIndividus);
       this.listeAgentSecurite=listeAgentSecurite;
       listeAgentSecurite.add(this);
       
    }


   
   
   
}
