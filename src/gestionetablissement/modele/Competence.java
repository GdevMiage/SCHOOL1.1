 
package gestionetablissement;

 
public class Competence {
    
private Programme programme;
private Enseignants ensignant;

    public Competence(Programme programme, Enseignants ensignant) {
        this.programme = programme;
        this.ensignant = ensignant;
    }

    public Programme getProgramme() {
        return programme;
    }

    public Enseignants getEnsignant() {
        return ensignant;
    }

    public void setProgramme(Programme programme) {
        this.programme = programme;
    }

    public void setEnsignant(Enseignants ensignant) {
        this.ensignant = ensignant;
    }

    
    

}
