 
package gestionetablissement;

 
public class Enseignants {
    
    private int idEnseignant;
    private Affectations affectation;

    public Enseignants(int idEnseignant, Affectations affectation) {
        this.idEnseignant = idEnseignant;
        this.affectation = affectation;
    }

    public int getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(int idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public Affectations getAffectation() {
        return affectation;
    }

    public void setAffectation(Affectations affectation) {
        this.affectation = affectation;
    }


    
}
