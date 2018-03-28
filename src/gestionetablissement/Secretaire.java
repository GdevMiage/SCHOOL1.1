 
package gestionetablissement;

/**
 *
 * @author salim
 */
public class Secretaire {
    
   private int  idSecretaire;
    private int idAffectation;

    public Secretaire(int idSecretaire, int idAffectation) {
        this.idSecretaire = idSecretaire;
        this.idAffectation = idAffectation;
    }

    public int getIdSecretaire() {
        return idSecretaire;
    }

    public void setIdSecretaire(int idSecretaire) {
        this.idSecretaire = idSecretaire;
    }

    public int getIdAffectation() {
        return idAffectation;
    }

    public void setIdAffectation(int idAffectation) {
        this.idAffectation = idAffectation;
    }
    
    
    
}
