
package gestionetablissement;


public class Securite {
    
   private int idSecurite;
   private Affectations affectation;

    public Securite(int idSecurite, Affectations affectation) {
        this.idSecurite = idSecurite;
        this.affectation = affectation;
    }

    public int getIdSecurite() {
        return idSecurite;
    }

    public void setIdSecurite(int idSecurite) {
        this.idSecurite = idSecurite;
    }

    public Affectations getAffectation() {
        return affectation;
    }

    public void setAffectation(Affectations affectation) {
        this.affectation = affectation;
    }


   
   
   
}
