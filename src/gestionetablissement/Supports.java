 
package gestionetablissement;

 
public class Supports {
    
    private int idSupport;
    private Matieres matiere;
    private TypeDocs typeDocs;
    private String libelSupport;
    private String titreSupport;

    public Supports(int idSupport, Matieres matiere, TypeDocs typeDocs, String libelSupport, String titreSupport) {
        this.idSupport = idSupport;
        this.matiere = matiere;
        this.typeDocs = typeDocs;
        this.libelSupport = libelSupport;
        this.titreSupport = titreSupport;
    }

    public int getIdSupport() {
        return idSupport;
    }

    public void setIdSupport(int idSupport) {
        this.idSupport = idSupport;
    }

  

    public String getLibelSupport() {
        return libelSupport;
    }

    public void setLibelSupport(String libelSupport) {
        this.libelSupport = libelSupport;
    }

    public String getTitreSupport() {
        return titreSupport;
    }

    public void setTitreSupport(String titreSupport) {
        this.titreSupport = titreSupport;
    }
    
    
    
}
