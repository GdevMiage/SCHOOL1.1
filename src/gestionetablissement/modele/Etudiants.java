 
package gestionetablissement.modele;

import java.util.Date;

 
public class Etudiants extends Individus  {
    
 

    public Etudiants(int idIndividu, String nomIndividu, String prenomIndividu, String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu, String nivEtudIndividu, String domEtudIndividu, String profIndividu, String domCompetIndividu, String langMatIndividu, String langParlIndividu, String photoIndividu, String rectoPIDIndividu, String versoPIDIndividu, Affectations affectation) {
       super(idIndividu,nomIndividu,prenomIndividu,affectation,genreIndividu,datNaisIndividu,lieuNaisIndividu,nivEtudIndividu,domEtudIndividu,profIndividu,domCompetIndividu,langMatIndividu,langParlIndividu,photoIndividu,rectoPIDIndividu,versoPIDIndividu);
       
    }



    
    
}
