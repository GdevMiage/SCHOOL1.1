 
package gestionetablissement.modele;

import static gestionetablissement.modele.Cours.listeCours;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

 
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
    public static final ListPro<Documents> listeDocuments = new ListPro<Documents>();
   
    {
        this.listeDocuments.add(this);
    }
    
    
    //pour definir a chaque fois les ID
    public static int definirId(){
        Iterator it = listeDocuments.iterator();
        
        //année actuelle 
       
        int annee =Calendar.getInstance().get(Calendar.YEAR);
        
        Documents DocumentsPlusGrandId=null;
        boolean vide =true;
        if(it.hasNext())  DocumentsPlusGrandId=  (Documents) it.next();
        while(it.hasNext()){
            Documents Documents = (Documents) it.next();
            vide=false;
            if(Documents.getIdDocument()>DocumentsPlusGrandId.getIdDocument()) DocumentsPlusGrandId =Documents;
        }
            
            if(vide) {System.out.println((annee *10)+1);return ((annee *100000)+1);}
            else {System.out.println(DocumentsPlusGrandId.getIdDocument()+1);return DocumentsPlusGrandId.getIdDocument()+1;}
        
        
    }
    
    

    public Documents(int idDocument, Supports support, TypeDocs typeDocs, String libelDocument, String versionDocument, String mediaDocument, int nbrPagNBDocument, String reliureDocument, String texteDocument, String couvDocument) {
        this.idDocument = idDocument;
        this.support = support;
        this.typeDocs = typeDocs;
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

    public Supports getSupport() {
        return support;
    }

    public TypeDocs getTypeDocs() {
        return typeDocs;
    }

    public String getReliureDocument() {
        return reliureDocument;
    }

    public String getTexteDocument() {
        return texteDocument;
    }

    public String getCouvDocument() {
        return couvDocument;
    }

    public void setSupport(Supports support) {
        this.support = support;
    }

    public void setTypeDocs(TypeDocs typeDocs) {
        this.typeDocs = typeDocs;
    }

    public void setReliureDocument(String reliureDocument) {
        this.reliureDocument = reliureDocument;
    }

    public void setTexteDocument(String texteDocument) {
        this.texteDocument = texteDocument;
    }

    public void setCouvDocument(String couvDocument) {
        this.couvDocument = couvDocument;
    }



    
    
}
