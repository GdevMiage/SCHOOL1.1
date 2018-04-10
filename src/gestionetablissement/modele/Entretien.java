 
package gestionetablissement.modele;

import gestionetablissement.securite.Affectations;
import java.util.Date;

 
public class Entretien extends Individus {
    
    private ListPro<Entretien> listeAgentEntretien;
    
    public static final ListPro<Entretien> listeEntretien = new ListPro<Entretien>();
   
    {
        this.listeEntretien.add(this);
    }


    public Entretien( String nomIndividu, String prenomIndividu, String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu, String nivEtudIndividu, String domEtudIndividu, String profIndividu, Adresses domCompetIndividu, String langMatIndividu, String langParlIndividu, String photoIndividu, String rectoPIDIndividu, String versoPIDIndividu,String tel,String mail, Affectations affectation) {
       super(nomIndividu,prenomIndividu,genreIndividu,datNaisIndividu,lieuNaisIndividu,nivEtudIndividu,domEtudIndividu,profIndividu,domCompetIndividu,langMatIndividu,langParlIndividu,photoIndividu,rectoPIDIndividu,versoPIDIndividu, tel,mail,affectation);
       
    }
    
  

    public ListPro<Entretien> getListeAgentEntretien() {
        return listeAgentEntretien;
    }

    public void setListeAgentEntretien(ListPro<Entretien> listeAgentEntretien) {
        this.listeAgentEntretien = listeAgentEntretien;
    }
 

    
}
