 
package gestionetablissement;

 
public class Matières {
    
    private int idMatiere;
    private int idModule;
    private String libelMatiere;

    public Matières(int idMatiere, int idModule, String libelMatiere) {
        this.idMatiere = idMatiere;
        this.idModule = idModule;
        this.libelMatiere = libelMatiere;
    }

    public int getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(int idMatiere) {
        this.idMatiere = idMatiere;
    }

    public int getIdModule() {
        return idModule;
    }

    public void setIdModule(int idModule) {
        this.idModule = idModule;
    }

    public String getLibelMatiere() {
        return libelMatiere;
    }

    public void setLibelMatiere(String libelMatiere) {
        this.libelMatiere = libelMatiere;
    }
    
    

}
