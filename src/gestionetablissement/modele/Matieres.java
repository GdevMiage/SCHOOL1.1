 
package gestionetablissement;

 
public class Matieres {
    
    private int idMatiere;
    private Modules module;
    private String libelMatiere;

    public Matieres(int idMatiere, Modules module, String libelMatiere) {
        this.idMatiere = idMatiere;
        this.module = module;
        this.libelMatiere = libelMatiere;
    }

    public int getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(int idMatiere) {
        this.idMatiere = idMatiere;
    }

    public Modules getModule() {
        return module;
    }

    public void setModule(Modules module) {
        this.module = module;
    }


    public String getLibelMatiere() {
        return libelMatiere;
    }

    public void setLibelMatiere(String libelMatiere) {
        this.libelMatiere = libelMatiere;
    }
    
    

}
