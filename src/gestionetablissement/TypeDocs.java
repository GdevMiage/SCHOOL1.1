 
package gestionetablissement;


public class TypeDocs {
    
    private int idTypeDoc;
    private String libelTypeDoc;

    public TypeDocs(int idTypeDoc, String libelTypeDoc) {
        this.idTypeDoc = idTypeDoc;
        this.libelTypeDoc = libelTypeDoc;
    }

    public int getIdTypeDoc() {
        return idTypeDoc;
    }

    public void setIdTypeDoc(int idTypeDoc) {
        this.idTypeDoc = idTypeDoc;
    }

    public String getLibelTypeDoc() {
        return libelTypeDoc;
    }

    public void setLibelTypeDoc(String libelTypeDoc) {
        this.libelTypeDoc = libelTypeDoc;
    }
    
    
}
