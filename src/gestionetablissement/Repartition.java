
package gestionetablissement;


public class Repartition {
    
   private Groupes groupe;
   private Sessions session;
   private Plannings planning;
   private Salles salle;
   private Modules module;
   private Inscriptions inscription;
   private Etudiants etudiant;

    public Repartition(Groupes groupe, Sessions session, Plannings planning, Salles salle, Modules module, Inscriptions inscription, Etudiants etudiant) {
        this.groupe = groupe;
        this.session = session;
        this.planning = planning;
        this.salle = salle;
        this.module = module;
        this.inscription = inscription;
        this.etudiant = etudiant;
    }

    public Groupes getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupes groupe) {
        this.groupe = groupe;
    }

    public Sessions getSession() {
        return session;
    }

    public void setSession(Sessions session) {
        this.session = session;
    }

    public Plannings getPlanning() {
        return planning;
    }

    public void setPlanning(Plannings planning) {
        this.planning = planning;
    }

    public Salles getSalle() {
        return salle;
    }

    public void setSalle(Salles salle) {
        this.salle = salle;
    }

    public Modules getModule() {
        return module;
    }

    public void setModule(Modules module) {
        this.module = module;
    }

    public Inscriptions getInscription() {
        return inscription;
    }

    public void setInscription(Inscriptions inscription) {
        this.inscription = inscription;
    }

    public Etudiants getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiants etudiant) {
        this.etudiant = etudiant;
    }

   
   
   
   
    
}
