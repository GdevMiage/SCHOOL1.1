
package gestionetablissement.modele;

import static gestionetablissement.modele.Adresses.listeAdresse;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;


public class Contrats {
   private int idContrat;
   private Statuts status;
   private Fonctions fonction;
   private Individus individus;
   private String libelContrat;
   private Date dateEntrContrat; 
   private Date datesortContrat; 
   private float salaireContrat; 
   private float indemnitéContrat;
   private String materielContrat; 
   private String contratContrat;
   public static final ListPro<Contrats> listeContrats = new ListPro<Contrats>();
   
    {
        this.listeContrats.add(this);
    }
  
//pour definir a chaque fois les ID
    public static int definirId(){
        Iterator it = listeContrats.iterator();
        
        //année actuelle 
       
        int annee =Calendar.getInstance().get(Calendar.YEAR);
        
        Contrats ContratsPlusGrandId=null;
        boolean vide =true;
        if(it.hasNext())  ContratsPlusGrandId=  (Contrats) it.next();
        while(it.hasNext()){
            Contrats cont = (Contrats) it.next();
            vide=false;
            if(cont.getIdContrat()>ContratsPlusGrandId.getIdContrat()) ContratsPlusGrandId =cont;
        }
            
            if(vide) {System.out.println((annee *10)+1);return ((annee *100000)+1);}
            else {System.out.println(ContratsPlusGrandId.getIdContrat()+1);return ContratsPlusGrandId.getIdContrat()+1;}
        
        
    }
    
    public static ArrayList<Contrats> of(String id ){
        Iterator it = listeContrats.iterator();
        ArrayList<Contrats> listRecherche=null;
        while(it.hasNext()){
            Contrats cont = (Contrats) it.next();
            String idd = cont.getIdContrat()+"";
            if(idd.indexOf(id)!=0){
                
                listRecherche.add(cont);
            }
        }
        return listRecherche;
    }
   //constructeur
    public Contrats(int idContrat, Statuts status, Fonctions fonction, Individus individus, String libelContrat, Date dateEntrContrat, Date datesortContrat, float salaireContrat, float indemnitéContrat, String materielContrat, String contratContrat) {
        this.idContrat = idContrat;
        this.status = status;
        this.fonction = fonction;
        this.individus = individus;
        this.libelContrat = libelContrat;
        this.dateEntrContrat = dateEntrContrat;
        this.datesortContrat = datesortContrat;
        this.salaireContrat = salaireContrat;
        this.indemnitéContrat = indemnitéContrat;
        this.materielContrat = materielContrat;
        this.contratContrat = contratContrat;
    }

    public int getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(int idContrat) {
        this.idContrat = idContrat;
    }

    public Statuts getStatus() {
        return status;
    }

    public Fonctions getFonction() {
        return fonction;
    }

    public Individus getIndividus() {
        return individus;
    }

    public void setStatus(Statuts status) {
        this.status = status;
    }

    public void setFonction(Fonctions fonction) {
        this.fonction = fonction;
    }

    public void setIndividus(Individus individus) {
        this.individus = individus;
    }



    public String getLibelContrat() {
        return libelContrat;
    }

    public void setLibelContrat(String libelContrat) {
        this.libelContrat = libelContrat;
    }

    public Date getDateEntrContrat() {
        return dateEntrContrat;
    }

    public void setDateEntrContrat(Date dateEntrContrat) {
        this.dateEntrContrat = dateEntrContrat;
    }

    public Date getDatesortContrat() {
        return datesortContrat;
    }

    public void setDatesortContrat(Date datesortContrat) {
        this.datesortContrat = datesortContrat;
    }

    public float getSalaireContrat() {
        return salaireContrat;
    }

    public void setSalaireContrat(float salaireContrat) {
        this.salaireContrat = salaireContrat;
    }

    public float getIndemnitéContrat() {
        return indemnitéContrat;
    }

    public void setIndemnitéContrat(float indemnitéContrat) {
        this.indemnitéContrat = indemnitéContrat;
    }

    public String getMaterielContrat() {
        return materielContrat;
    }

    public void setMaterielContrat(String materielContrat) {
        this.materielContrat = materielContrat;
    }

    public String getContratContrat() {
        return contratContrat;
    }

    public void setContratContrat(String contratContrat) {
        this.contratContrat = contratContrat;
    }
   
   
   
   
    
}
