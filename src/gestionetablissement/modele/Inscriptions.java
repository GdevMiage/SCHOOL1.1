

package gestionetablissement.modele;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

 
public class Inscriptions {
    
    private int idInscription;
    private Etudiants etudiant;
    private Paiements paiement;
    private PrEnCharg prEnCharg;
    private Date dateInscription;
    private Date dateAbandInscription;
    private Date dateAnnulInscription;
    private double creditInscription; 
    private ArrayList<Modules> listeAchat ;
    private ArrayList<Groupes> listeGroupes;
    
  public static final ListPro<Inscriptions> listeInscriptions = new ListPro<Inscriptions>();
   
    {
        this.listeInscriptions.add(this);
    }
  
        //pour definir a chaque fois les ID
    public static int definirId(){
        Iterator it = listeInscriptions.iterator();
        
        //année actuelle 
       
        int annee =Calendar.getInstance().get(Calendar.YEAR);
        
        Inscriptions InscriptionsPlusGrandId=null;
        boolean vide =true;
        if(it.hasNext())  InscriptionsPlusGrandId=  (Inscriptions) it.next();
        while(it.hasNext()){
            Inscriptions Inscriptions = (Inscriptions) it.next();
            vide=false;
            if(Inscriptions.getIdInscription()>InscriptionsPlusGrandId.getIdInscription()) InscriptionsPlusGrandId =Inscriptions;
        }
            
            if(vide) {System.out.println((annee *10)+1);return ((annee *100000)+1);}
            else {System.out.println(InscriptionsPlusGrandId.getIdInscription()+1);return InscriptionsPlusGrandId.getIdInscription()+1;}
        
        
    }
    
    public static ArrayList<Inscriptions> of(String id ){
        Iterator it = listeInscriptions.iterator();
        ArrayList<Inscriptions> listRecherche=null;
        while(it.hasNext()){
            Inscriptions Inscriptions = (Inscriptions) it.next();
            String idd = Inscriptions.getIdInscription()+"";
            if(idd.indexOf(id)!=0){
                
                listRecherche.add(Inscriptions);
            }
        }
        return listRecherche;
    }
    
    public Inscriptions(){
        
    }
    public Inscriptions(int idInscription, Etudiants etudiant, 
            Paiements paiement, PrEnCharg prEnCharg, Date dateInscription,
            Date dateAbandInscription, Date dateAnnulInscription,
            double creditInscription,ArrayList<Modules> listeAchat,
            ArrayList<Groupes> listeGroupes,ListPro<Inscriptions> listeInscriptions) {
        
        this.idInscription = idInscription;
        this.etudiant = etudiant;
        this.paiement = paiement;
        this.prEnCharg = prEnCharg;
        this.dateInscription = dateInscription;
        this.dateAbandInscription = dateAbandInscription;
        this.dateAnnulInscription = dateAnnulInscription;
        this.creditInscription = creditInscription;
        this.listeAchat=listeAchat;
        this.listeGroupes=listeGroupes;
        
    }

    public int getIdInscription() {
        return idInscription;
    }

    public void setIdInscription(int idInscription) {
        this.idInscription = idInscription;
    }

   

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public Date getDateAbandInscription() {
        return dateAbandInscription;
    }

    public void setDateAbandInscription(Date dateAbandInscription) {
        this.dateAbandInscription = dateAbandInscription;
    }

    public Date getDateAnnulInscription() {
        return dateAnnulInscription;
    }

    public void setDateAnnulInscription(Date dateAnnulInscription) {
        this.dateAnnulInscription = dateAnnulInscription;
    }

  

    public void setCreditInscription(int creditInscription) {
        this.creditInscription = creditInscription;
    }

    
}
