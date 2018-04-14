 
package gestionetablissement.modele;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
 
public class Paiements {
    
    private int idPaiement;
    private Inscriptions inscription;
    private Tarifs tarifs;
    private int nbrSessionPaiment;
    private int nbrMatierePaiment;
    private double montantPaiement;
    private String modePaiement; 
    private Date datePaiement;
    private int trigrPaiment; 
    private Date dateEncais1Paiement;
    private Date dateEncais2Paiement;
    private Date dateEncais3Paiement;
    private int trigrEncaisPaiment;
    private Date dateTransfPaiement;
    private int trigrTranfPaiment;
   
    
    public static final ListPro<Paiements> listePaiements = new ListPro<Paiements>();
   
    {
        this.listePaiements.add(this);
    }
  
        //pour definir a chaque fois les ID
    public static int definirId(){
        Iterator it = listePaiements.iterator();
        
        //année actuelle 
       
        int annee =Calendar.getInstance().get(Calendar.YEAR);
        
        Paiements PaiementsPlusGrandId=null;
        boolean vide =true;
        if(it.hasNext())  PaiementsPlusGrandId=  (Paiements) it.next();
        while(it.hasNext()){
            Paiements Paiements = (Paiements) it.next();
            vide=false;
            if(Paiements.getIdPaiement()>PaiementsPlusGrandId.getIdPaiement()) PaiementsPlusGrandId = Paiements;
        }
            
            if(vide) {System.out.println((annee *10)+1);return ((annee *100000)+1);}
            else {System.out.println(PaiementsPlusGrandId.getIdPaiement()+1);return PaiementsPlusGrandId.getIdPaiement()+1;}
        
        
    }
    
    public static ArrayList<Paiements> of(String id ){
        Iterator it = listePaiements.iterator();
        ArrayList<Paiements> listRecherche=null;
        while(it.hasNext()){
            Paiements Paiements = (Paiements) it.next();
            String idd = Paiements.getIdPaiement()+"";
            if(idd.indexOf(id)!=0){
                
                listRecherche.add(Paiements);
            }
        }
        return listRecherche;
    }
    
    public Paiements(){
        
        
    }
    
    public Paiements(int idPaiement, Inscriptions inscription, Tarifs tarifs, int nbrSessionPaiment, int nbrMatierePaiment, double montantPaiement, String modePaiement, Date datePaiement, int trigrPaiment, Date dateEncais1Paiement, Date dateEncais2Paiement, Date dateEncais3Paiement, int trigrEncaisPaiment, Date dateTransfPaiement, int trigrTranfPaiment,ListPro<Paiements> listePaiements) {
        this.idPaiement = idPaiement;
        this.inscription = inscription;
        this.tarifs = tarifs;
        this.nbrSessionPaiment = nbrSessionPaiment;
        this.nbrMatierePaiment = nbrMatierePaiment;
        this.montantPaiement = montantPaiement;
        this.modePaiement = modePaiement;
        this.datePaiement = datePaiement;
        this.trigrPaiment = trigrPaiment;
        this.dateEncais1Paiement = dateEncais1Paiement;
        this.dateEncais2Paiement = dateEncais2Paiement;
        this.dateEncais3Paiement = dateEncais3Paiement;
        this.trigrEncaisPaiment = trigrEncaisPaiment;
        this.dateTransfPaiement = dateTransfPaiement;
        this.trigrTranfPaiment = trigrTranfPaiment;
       
        
    }

    public int getIdPaiement() {
        return idPaiement;
    }

    public void setIdPaiement(int idPaiement) {
        this.idPaiement = idPaiement;
    }

    public Inscriptions getInscription() {
        return inscription;
    }

    public void setInscription(Inscriptions inscription) {
        this.inscription = inscription;
    }

    public Tarifs getTarifs() {
        return tarifs;
    }

    public void setTarifs(Tarifs tarifs) {
        this.tarifs = tarifs;
    }

    public int getNbrSessionPaiment() {
        return nbrSessionPaiment;
    }

    public void setNbrSessionPaiment(int nbrSessionPaiment) {
        this.nbrSessionPaiment = nbrSessionPaiment;
    }

    public int getNbrMatierePaiment() {
        return nbrMatierePaiment;
    }

    public void setNbrMatierePaiment(int nbrMatierePaiment) {
        this.nbrMatierePaiment = nbrMatierePaiment;
    }

    public double getMontantPaiement() {
        return montantPaiement;
    }

    public void setMontantPaiement(double montantPaiement) {
        this.montantPaiement = montantPaiement;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(String modePaiement) {
        this.modePaiement = modePaiement;
    }

    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    public int getTrigrPaiment() {
        return trigrPaiment;
    }

    public void setTrigrPaiment(int trigrPaiment) {
        this.trigrPaiment = trigrPaiment;
    }

    public Date getDateEncais1Paiement() {
        return dateEncais1Paiement;
    }

    public void setDateEncais1Paiement(Date dateEncais1Paiement) {
        this.dateEncais1Paiement = dateEncais1Paiement;
    }

    public Date getDateEncais2Paiement() {
        return dateEncais2Paiement;
    }

    public void setDateEncais2Paiement(Date dateEncais2Paiement) {
        this.dateEncais2Paiement = dateEncais2Paiement;
    }

    public Date getDateEncais3Paiement() {
        return dateEncais3Paiement;
    }

    public void setDateEncais3Paiement(Date dateEncais3Paiement) {
        this.dateEncais3Paiement = dateEncais3Paiement;
    }

    public int getTrigrEncaisPaiment() {
        return trigrEncaisPaiment;
    }

    public void setTrigrEncaisPaiment(int trigrEncaisPaiment) {
        this.trigrEncaisPaiment = trigrEncaisPaiment;
    }

    public Date getDateTransfPaiement() {
        return dateTransfPaiement;
    }

    public void setDateTransfPaiement(Date dateTransfPaiement) {
        this.dateTransfPaiement = dateTransfPaiement;
    }

    public int getTrigrTranfPaiment() {
        return trigrTranfPaiment;
    }

    public void setTrigrTranfPaiment(int trigrTranfPaiment) {
        this.trigrTranfPaiment = trigrTranfPaiment;
    }
    
    
}
