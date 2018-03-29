
package gestionetablissement;


public class Repartition {
    
   private Groupes groupe;
   private Sessions session;
   private Plannings planning;
   private Salles salle;
   private Modules module;
   private Inscriptions inscription;
   private Etudiants etudiant;

    public Repartition(int idGroupe, int idSession, int idPlanning, int idSalle, int idModule, int idInscription, int idEtudiant) {
        this.idGroupe = idGroupe;
        this.idSession = idSession;
        this.idPlanning = idPlanning;
        this.idSalle = idSalle;
        this.idModule = idModule;
        this.idInscription = idInscription;
        this.idEtudiant = idEtudiant;
    }

    public int getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }

    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    public int getIdPlanning() {
        return idPlanning;
    }

    public void setIdPlanning(int idPlanning) {
        this.idPlanning = idPlanning;
    }

    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public int getIdModule() {
        return idModule;
    }

    public void setIdModule(int idModule) {
        this.idModule = idModule;
    }

    public int getIdInscription() {
        return idInscription;
    }

    public void setIdInscription(int idInscription) {
        this.idInscription = idInscription;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }
   
   
   
   
    
}
