 
package gestionetablissement;

/**
 *
 * @author salim
 */
public class Directeur {
    
   public int  idDirecteur;
    public int idAffectation;
    
     public Directeur(int idDirecteur, int idAffectation) {
        this.idDirecteur = idDirecteur;
        this.idAffectation = idAffectation;
    }
    

    public int getIdDirecteur() {
        return idDirecteur;
    }

    public void setIdDirecteur(int idDirecteur) {
        this.idDirecteur = idDirecteur;
    }

    public int getIdAffectation() {
        return idAffectation;
    }

    public void setIdAffectation(int idAffectation) {
        this.idAffectation = idAffectation;
    }

   
    
    
}
