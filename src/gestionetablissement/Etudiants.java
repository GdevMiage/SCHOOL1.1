 
package gestionetablissement;

 
public class Etudiants extends Individus  {
    
    private int idEtudiant;
    private Affectations affectation;

    public Etudiants(int idEtudiant, int idAffectation) {
        this.idEtudiant = idEtudiant;
        this.idAffectation = idAffectation;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public int getIdAffectation() {
        return idAffectation;
    }

    public void setIdAffectation(int idAffectation) {
        this.idAffectation = idAffectation;
    }
    
    
    
}
