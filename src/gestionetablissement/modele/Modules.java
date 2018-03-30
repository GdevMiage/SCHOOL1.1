 
package gestionetablissement.modele;

 
public class Modules {
    
    private int idModule;
    private String libelModule;

    public Modules(int idModule, String libelModule) {
        this.idModule = idModule;
        this.libelModule = libelModule;
    }

    public int getIdModule() {
        return idModule;
    }

    public void setIdModule(int idModule) {
        this.idModule = idModule;
    }

    public String getLibelModule() {
        return libelModule;
    }

    public void setLibelModule(String libelModule) {
        this.libelModule = libelModule;
    }
    
    
}
