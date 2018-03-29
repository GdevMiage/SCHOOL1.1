 
package gestionetablissement;

 
public class Documents {
    
    private int idDocument;
    private Supports support;
    private TypeDocs typeDocs;
    private String libelDocument;
    private String versionDocument; // a revoir
    private String mediaDocument;  // a revoir
    private int nbrPagNBDocument;
    private String reliureDocument;  // a revoir
    private String texteDocument;  // a revoir
    private String couvDocument;  // a revoir

    public Documents(int idDocument, int idSupport, int idTypeDoc, String libelDocument, String versionDocument, String mediaDocument, int nbrPagNBDocument, int reliureDocument, int texteDocument, int couvDocument) {
        this.idDocument = idDocument;
        this.idSupport = idSupport;
        this.idTypeDoc = idTypeDoc;
        this.libelDocument = libelDocument;
        this.versionDocument = versionDocument;
        this.mediaDocument = mediaDocument;
        this.nbrPagNBDocument = nbrPagNBDocument;
        this.reliureDocument = reliureDocument;
        this.texteDocument = texteDocument;
        this.couvDocument = couvDocument;
    }

    public int getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(int idDocument) {
        this.idDocument = idDocument;
    }

    public int getIdSupport() {
        return idSupport;
    }

    public void setIdSupport(int idSupport) {
        this.idSupport = idSupport;
    }

    public int getIdTypeDoc() {
        return idTypeDoc;
    }

    public void setIdTypeDoc(int idTypeDoc) {
        this.idTypeDoc = idTypeDoc;
    }

    public String getLibelDocument() {
        return libelDocument;
    }

    public void setLibelDocument(String libelDocument) {
        this.libelDocument = libelDocument;
    }

    public String getVersionDocument() {
        return versionDocument;
    }

    public void setVersionDocument(String versionDocument) {
        this.versionDocument = versionDocument;
    }

    public String getMediaDocument() {
        return mediaDocument;
    }

    public void setMediaDocument(String mediaDocument) {
        this.mediaDocument = mediaDocument;
    }

    public int getNbrPagNBDocument() {
        return nbrPagNBDocument;
    }

    public void setNbrPagNBDocument(int nbrPagNBDocument) {
        this.nbrPagNBDocument = nbrPagNBDocument;
    }

    public int getReliureDocument() {
        return reliureDocument;
    }

    public void setReliureDocument(int reliureDocument) {
        this.reliureDocument = reliureDocument;
    }

    public int getTexteDocument() {
        return texteDocument;
    }

    public void setTexteDocument(int texteDocument) {
        this.texteDocument = texteDocument;
    }

    public int getCouvDocument() {
        return couvDocument;
    }

    public void setCouvDocument(int couvDocument) {
        this.couvDocument = couvDocument;
    }
    
    
}
