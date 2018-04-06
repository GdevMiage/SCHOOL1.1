 
package gestionetablissement.modele;

import java.util.ArrayList;
import java.util.Date;


public class Cours extends Seances {
    
    private int idCours;
    private ArrayList<Supports> listeSupports;
    private String typeDocCours;  
    private String libelCours;
    private String niveauCours; 
    private String partieCours;  
    private int volHorCours; 
    private String descriptifCours; 
    private ListPro<Cours> listeCours;
    
 public Cours(int idSeance, Groupes groupe, Horaires horaire,
            Enseignants enseignant, String rattrapageSeance,
            boolean annulationSeance, Date reportSeance,
            int idCours,ArrayList<Supports> listeSupports, 
            String typeDocCours, String libelCours, String niveauCours,
            String partieCours, int volHorCours, String descriptifCours) {
     
     super( idSeance,  groupe,  horaire,
             enseignant,  rattrapageSeance,
             annulationSeance,  reportSeance);
        
        this.idCours = idCours;
        this.listeSupports = listeSupports;
        this.typeDocCours = typeDocCours;
        this.libelCours = libelCours;
        this.niveauCours = niveauCours;
        this.partieCours = partieCours;
        this.volHorCours = volHorCours;
        this.descriptifCours = descriptifCours;
    }
 public Cours(int idSeance, Groupes groupe, Horaires horaire,
            Enseignants enseignant, String rattrapageSeance,
            boolean annulationSeance, Date reportSeance,
            int idCours,ArrayList<Supports> listeSupports, 
            String typeDocCours, String libelCours, String niveauCours,
            String partieCours, int volHorCours, String descriptifCours,ListPro<Cours> listeCours) {
     
     super( idSeance,  groupe,  horaire,
             enseignant,  rattrapageSeance,
             annulationSeance,  reportSeance);
        
        this.idCours = idCours;
        this.listeSupports = listeSupports;
        this.typeDocCours = typeDocCours;
        this.libelCours = libelCours;
        this.niveauCours = niveauCours;
        this.partieCours = partieCours;
        this.volHorCours = volHorCours;
        this.descriptifCours = descriptifCours;
        this.listeCours=listeCours;
        listeCours.add(this);
    }
/**
 * 
 * @return 
 */
    public int getIdCours() {
        return idCours;
    }
    
    public void setIdCours(int idCours) {
        this.idCours = idCours;
    }


 

    public String getTypeDocCours() {
        return typeDocCours;
    }

    public void setTypeDocCours(String typeDocCours) {
        this.typeDocCours = typeDocCours;
    }


    public String getLibelCours() {
        return libelCours;
    }

    public void setLibelCours(String libelCours) {
        this.libelCours = libelCours;
    }

    public String getNiveauCours() {
        return niveauCours;
    }

    public void setNiveauCours(String niveauCours) {
        this.niveauCours = niveauCours;
    }

    public String getPartieCours() {
        return partieCours;
    }

    public void setPartieCours(String partieCours) {
        this.partieCours = partieCours;
    }

    public int getVolHorCours() {
        return volHorCours;
    }

    public void setVolHorCours(int volHorCours) {
        this.volHorCours = volHorCours;
    }

    public String getDescriptifCours() {
        return descriptifCours;
    }

    public void setDescriptifCours(String descriptifCours) {
        this.descriptifCours = descriptifCours;
    }
    
    
}
