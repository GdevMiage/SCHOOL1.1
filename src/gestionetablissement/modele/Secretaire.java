 
package gestionetablissement.modele;

import gestionetablissement.securite.Affectations;
import java.util.Date;

/**
 *
 * @author salim
 */
public class Secretaire extends Individus {
    
  private ListPro<Secretaire> listeSecretaire;

    public Secretaire( String nomIndividu, String prenomIndividu, String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu, String nivEtudIndividu, String domEtudIndividu, String profIndividu, Adresses domCompetIndividu, String langMatIndividu, String langParlIndividu, String photoIndividu, String rectoPIDIndividu, String versoPIDIndividu,String tel,String mail, Affectations affectation) {
       super(nomIndividu,prenomIndividu,genreIndividu,datNaisIndividu,lieuNaisIndividu,nivEtudIndividu,domEtudIndividu,profIndividu,domCompetIndividu,langMatIndividu,langParlIndividu,photoIndividu,rectoPIDIndividu,versoPIDIndividu, tel, mail,affectation);
       
    }




    
    
    
}
