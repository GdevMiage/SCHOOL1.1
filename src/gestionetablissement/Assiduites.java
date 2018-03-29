
package gestionetablissement;

import java.util.Date;


public class Assiduites {
    
    
   private int idAssiduite;
   private int idInscription;
   private int idSeance;
   private String etatAssiduite;//a revoir avec type ennumere
   private Date datRelancAssiduite;
   private String commAssiduite;
   private String docAssiduite; //a revoir pdf

    public Assiduites(int idAssiduite, int idInscription, int idSeance, String etatAssiduite, Date datRelancAssiduite, String commAssiduite, String docAssiduite) {
        this.idAssiduite = idAssiduite;
        this.idInscription = idInscription;
        this.idSeance = idSeance;
        this.etatAssiduite = etatAssiduite;
        this.datRelancAssiduite = datRelancAssiduite;
        this.commAssiduite = commAssiduite;
        this.docAssiduite = docAssiduite;
    }

    public int getIdAssiduite() {
        return idAssiduite;
    }

    public void setIdAssiduite(int idAssiduite) {
        this.idAssiduite = idAssiduite;
    }

    public int getIdInscription() {
        return idInscription;
    }

    public void setIdInscription(int idInscription) {
        this.idInscription = idInscription;
    }

    public int getIdSeance() {
        return idSeance;
    }

    public void setIdSeance(int idSeance) {
        this.idSeance = idSeance;
    }

    public String getEtatAssiduite() {
        return etatAssiduite;
    }

    public void setEtatAssiduite(String etatAssiduite) {
        this.etatAssiduite = etatAssiduite;
    }

    public Date getDatRelancAssiduite() {
        return datRelancAssiduite;
    }

    public void setDatRelancAssiduite(Date datRelancAssiduite) {
        this.datRelancAssiduite = datRelancAssiduite;
    }

    public String getCommAssiduite() {
        return commAssiduite;
    }

    public void setCommAssiduite(String commAssiduite) {
        this.commAssiduite = commAssiduite;
    }

    public String getDocAssiduite() {
        return docAssiduite;
    }

    public void setDocAssiduite(String docAssiduite) {
        this.docAssiduite = docAssiduite;
    }
   
   
   
   
    
}
