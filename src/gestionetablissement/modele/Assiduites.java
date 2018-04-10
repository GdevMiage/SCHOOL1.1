
package gestionetablissement.modele;

import static gestionetablissement.modele.Adresses.listeAdresse;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;


public class Assiduites {
     
    
   private int idAssiduite;
   private Individus individus;
   private Seances seance;
   private String etatAssiduite;
   private Date datRelancAssiduite;
   private String commAssiduite;
   private String docAssiduite;
   private static ListPro<Assiduites> listeAssiduites;
   
   {
        this.listeAssiduites.add(this);
    }
   
   //pour definir a chaque fois les ID
    public static int definirId(){
        Iterator it = listeAssiduites.iterator();
        
        //année actuelle 
       
        int annee =Calendar.getInstance().get(Calendar.YEAR);
        
        Assiduites assiduitePlusGrandId=null;
        boolean vide =true;
        if(it.hasNext())  assiduitePlusGrandId=  (Assiduites) it.next();
        while(it.hasNext()){
            Assiduites assid = (Assiduites) it.next();
            vide=false;
            if(assid.getIdAssiduite()>assiduitePlusGrandId.getIdAssiduite()) assiduitePlusGrandId =assid;
        }
            
            if(vide) {System.out.println((annee *10)+1);return ((annee *100000)+1);}
            else {System.out.println(assiduitePlusGrandId.getIdAssiduite()+1);return assiduitePlusGrandId.getIdAssiduite()+1;}
        
        
    }
    
    public static ArrayList<Assiduites> of(String id ){
        Iterator it = listeAssiduites.iterator();
        ArrayList<Assiduites> listRecherche=null;
        while(it.hasNext()){
            Assiduites assid = (Assiduites) it.next();
            String idd = assid.getIdAssiduite()+"";
            if(idd.indexOf(id)!=0){
                
                listRecherche.add(assid);
            }
        }
        return listRecherche;
    }

    public Assiduites(int idAssiduite, Individus individus, Seances seance, String etatAssiduite, Date datRelancAssiduite, String commAssiduite, String docAssiduite) {
        this.idAssiduite = idAssiduite;
        this.individus = individus;
        this.seance = seance;
        this.etatAssiduite = etatAssiduite;
        this.datRelancAssiduite = datRelancAssiduite;
        this.commAssiduite = commAssiduite;
        this.docAssiduite = docAssiduite;
    }
       public Assiduites( Individus individus, Seances seance, String etatAssiduite, Date datRelancAssiduite, String commAssiduite, String docAssiduit) {
        this.idAssiduite = listeAssiduites.size()+1;
        this.individus = individus;
        this.seance = seance;
        this.etatAssiduite = etatAssiduite;
        this.datRelancAssiduite = datRelancAssiduite;
        this.commAssiduite = commAssiduite;
        this.docAssiduite = docAssiduite;
        individus.getListePresences().add(this);
       
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
