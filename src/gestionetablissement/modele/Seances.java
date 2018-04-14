
package gestionetablissement.modele;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


public class Seances {
    
    private int idSeance;
    private Groupes groupe;
    private Horaires horaire;
    private Enseignants enseignant;
    private String rattrapageSeance;
    private boolean annulationSeance;
    private Date reportSeance;
    private Matieres matiere;
    private ListPro<Assiduites> listeAssiduite;
    private ArrayList listeAssiduiteSeance;
    
    public Seances(int idSeance, Groupes groupe, Horaires horaire,
            Enseignants enseignant, String rattrapageSeance,
            boolean annulationSeance, Date reportSeance,ListPro<Assiduites> listeAssiduite) {
        this.idSeance = idSeance;
        this.groupe = groupe;
        this.horaire = horaire;
        this.enseignant = enseignant;
        this.rattrapageSeance = rattrapageSeance;
        this.annulationSeance = annulationSeance;
        this.reportSeance = reportSeance;
        
    }

    /**
     *
     * @param individus
     * 
     * 
     * @return
     */
    public boolean faireLaPresence(Individus ...individus){
        int i;
        
        //recuperer les indiv absents 
        ArrayList<Individus> listeAbsences;
        listeAbsences = new ArrayList<>();
        
        listeAbsences.addAll(Arrays.asList(individus));
        
        for( i=0; i<=groupe.getListeEtudiants().size();i++){
            if( listeAbsences.contains(groupe.getListeEtudiants().get(i))){
                groupe.getListeEtudiants().get(i).getListePresences().add(new Assiduites(groupe.getListeEtudiants().get(i),this,"absent",reportSeance,"",""));

            }else{
                groupe.getListeEtudiants().get(i).getListePresences().add(new Assiduites(groupe.getListeEtudiants().get(i),this,"present",reportSeance,"",""));

            }
            if( listeAbsences.contains(enseignant))enseignant.getListeAbsences().add(new Assiduites(enseignant,this,"absent",reportSeance,"",""));
            else enseignant.getListeAbsences().add(new Assiduites(enseignant,this,"present",reportSeance,"",""));
           

        }
       
        
        return false;
    }
    
    
    public int getIdSeance() {
        return idSeance;
    }

    public void setIdSeance(int idSeance) {
        this.idSeance = idSeance;
    }

    public Groupes getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupes groupe) {
        this.groupe = groupe;
    }

    public Horaires getHoraire() {
        return horaire;
    }

    public void setHoraire(Horaires horaire) {
        this.horaire = horaire;
    }





    public String getRattrapageSeance() {
        return rattrapageSeance;
    }

    public void setRattrapageSeance(String rattrapageSeance) {
        this.rattrapageSeance = rattrapageSeance;
    }

  
    
    
    
}
