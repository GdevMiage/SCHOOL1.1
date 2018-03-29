 
package gestionetablissement;

 
public class Supports {
    
    private int idSupport;
    private Matieres matiere;
    private TypeDocs typeDocs;
    private String libelSupport;
    private String titreSupport;

    public Supports(int idSupport, int idMatière, int idtypeDocs, String libelSupport, String titreSupport) {
        this.idSupport = idSupport;
        this.idMatière = idMatière;
        this.idtypeDocs = idtypeDocs;
        this.libelSupport = libelSupport;
        this.titreSupport = titreSupport;
    }

    public int getIdSupport() {
        return idSupport;
    }

    public void setIdSupport(int idSupport) {
        this.idSupport = idSupport;
    }

    public int getIdMatière() {
        return idMatière;
    }

    public void setIdMatière(int idMatière) {
        this.idMatière = idMatière;
    }

    public int getIdtypeDocs() {
        return idtypeDocs;
    }

    public void setIdtypeDocs(int idtypeDocs) {
        this.idtypeDocs = idtypeDocs;
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
