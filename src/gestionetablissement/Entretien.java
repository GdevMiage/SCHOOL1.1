 
package gestionetablissement;

 
public class Entretien {
    
  private int idEntretien;
  private Affectations affectation;

    public Entretien(int idEntretien, Affectations affectation) {
        this.idEntretien = idEntretien;
        this.affectation = affectation;
    }

    public int getIdEntretien() {
        return idEntretien;
    }

    public void setIdEntretien(int idEntretien) {
        this.idEntretien = idEntretien;
    }

    public Affectations getAffectation() {
        return affectation;
    }

    public void setAffectation(Affectations affectation) {
        this.affectation = affectation;
    }


    
}
