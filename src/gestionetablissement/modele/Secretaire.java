 
package gestionetablissement;

/**
 *
 * @author salim
 */
public class Secretaire {
    
   private int  idSecretaire;
    private Affectations affectation;

    public Secretaire(int idSecretaire, Affectations affectation) {
        this.idSecretaire = idSecretaire;
        this.affectation = affectation;
    }

    public int getIdSecretaire() {
        return idSecretaire;
    }

    public void setIdSecretaire(int idSecretaire) {
        this.idSecretaire = idSecretaire;
    }

    public Affectations getAffectation() {
        return affectation;
    }

    public void setAffectation(Affectations affectation) {
        this.affectation = affectation;
    }


    
    
    
}
