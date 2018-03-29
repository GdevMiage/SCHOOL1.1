
package gestionetablissement;


public class Securite {
    
   private int idSecurite;
   private Affectations affectation;

    public Securite(int idSecurite, int idAffectation) {
        this.idSecurite = idSecurite;
        this.idAffectation = idAffectation;
    }

    public int getIdSecurite() {
        return idSecurite;
    }

    public void setIdSecurite(int idSecurite) {
        this.idSecurite = idSecurite;
    }

    public int getIdAffectation() {
        return idAffectation;
    }

    public void setIdAffectation(int idAffectation) {
        this.idAffectation = idAffectation;
    }
   
   
   
}
