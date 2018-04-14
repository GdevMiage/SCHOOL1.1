 
package gestionetablissement.modele;

import static gestionetablissement.modele.Adresses.listeAdresse;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

 
public class Competence {
    
private Programme programme;
private Enseignants ensignant;
public static final ListPro<Competence> listeCompetence = new ListPro<Competence>();
   
    {
        this.listeCompetence.add(this);
    }
   
    

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
