 
package gestionetablissement;

/**
 *
 * @author salim
 */
public class Directeur {
    
 
    private int  idDirecteur;
    private Affectations affectation;
 
  
 
    
     public Directeur(int idDirecteur, Affectations affectation) {
        this.idDirecteur = idDirecteur;
        this.affectation = affectation;
    }
    

    public int getIdDirecteur() {
        return idDirecteur;
    }

    public void setIdDirecteur(int idDirecteur) {
        this.idDirecteur = idDirecteur;
    }

    public Affectations getAffectation() {
        return affectation;
    }

    public void setAffectation(Affectations affectation) {
        this.affectation = affectation;
    }



   
    
    
}
