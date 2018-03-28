 
package gestionetablissement;

 
public class Entretien {
    
  private int idEntretien;
  private int idAffectation;

    public Entretien(int idEntretien, int idAffectation) {
        this.idEntretien = idEntretien;
        this.idAffectation = idAffectation;
    }

    public int getIdEntretien() {
        return idEntretien;
    }

    public void setIdEntretien(int idEntretien) {
        this.idEntretien = idEntretien;
    }

    public int getIdAffectation() {
        return idAffectation;
    }

    public void setIdAffectation(int idAffectation) {
        this.idAffectation = idAffectation;
    }
  
    
}
