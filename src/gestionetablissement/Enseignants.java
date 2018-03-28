 
package gestionetablissement;

 
public class Enseignants {
    
    private int idEnseignant;
    private int idAffectation;

    public Enseignants(int idEnseignant, int idAffectation) {
        this.idEnseignant = idEnseignant;
        this.idAffectation = idAffectation;
    }

    public int getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(int idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public int getIdAffectation() {
        return idAffectation;
    }

    public void setIdAffectation(int idAffectation) {
        this.idAffectation = idAffectation;
    }
    
    
}
