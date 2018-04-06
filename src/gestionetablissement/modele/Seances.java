
package gestionetablissement.modele;

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
    
    public Seances(int idSeance, Groupes groupe, Horaires horaire,
            Enseignants enseignant, String rattrapageSeance,
            boolean annulationSeance, Date reportSeance) {
        this.idSeance = idSeance;
        this.groupe = groupe;
        this.horaire = horaire;
        this.enseignant = enseignant;
        this.rattrapageSeance = rattrapageSeance;
        this.annulationSeance = annulationSeance;
        this.reportSeance = reportSeance;
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
