
package gestionetablissement.modele;

import java.util.Date;


public class Assiduites {
     
    
   private int idAssiduite;
   private Individus individus;
   private Seances seance;
   private String etatAssiduite;
   private Date datRelancAssiduite;
   private String commAssiduite;
   private String docAssiduite;
   private ListPro<Assiduites> listeAssiduites;

    public Assiduites(int idAssiduite, Individus individus, Seances seance, String etatAssiduite, Date datRelancAssiduite, String commAssiduite, String docAssiduite) {
        this.idAssiduite = idAssiduite;
        this.individus = individus;
        this.seance = seance;
        this.etatAssiduite = etatAssiduite;
        this.datRelancAssiduite = datRelancAssiduite;
        this.commAssiduite = commAssiduite;
        this.docAssiduite = docAssiduite;
    }
       public Assiduites( Individus individus, Seances seance, String etatAssiduite, Date datRelancAssiduite, String commAssiduite, String docAssiduite,ListPro<Assiduites> listeAssiduites) {
        this.idAssiduite = listeAssiduites.size()+1;
        this.individus = individus;
        this.seance = seance;
        this.etatAssiduite = etatAssiduite;
        this.datRelancAssiduite = datRelancAssiduite;
        this.commAssiduite = commAssiduite;
        this.docAssiduite = docAssiduite;
        this.listeAssiduites = listeAssiduites;
        individus.getListePresences().add(this);
        listeAssiduites.add(this);
    }

    public int getIdAssiduite() {
        return idAssiduite;
    }

    public void setIdAssiduite(int idAssiduite) {
        this.idAssiduite = idAssiduite;
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
