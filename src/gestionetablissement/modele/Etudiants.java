 
package gestionetablissement;

 
public class Etudiants   {
    
    private int idEtudiant;
    private Affectations affectation;

    public Etudiants(int idEtudiant, Affectations affectation) {
        this.idEtudiant = idEtudiant;
        this.affectation = affectation;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }


    
    
}
