 
package gestionetablissement;

 
public class Competence {
    
private int idProgramme;
private int idEnseignant;

    public Competence(int idProgramme, int idEnseignant) {
        this.idProgramme = idProgramme;
        this.idEnseignant = idEnseignant;
    }

    public int getIdProgramme() {
        return idProgramme;
    }

    public void setIdProgramme(int idProgramme) {
        this.idProgramme = idProgramme;
    }

    public int getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(int idEnseignant) {
        this.idEnseignant = idEnseignant;
    }
    

}
