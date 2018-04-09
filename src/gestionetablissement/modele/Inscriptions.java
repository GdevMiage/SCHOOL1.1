

package gestionetablissement.modele;

import java.util.ArrayList;
import java.util.Date;

 
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
    private ListPro<Inscriptions> listeInscriptions;
    
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
        this.listeInscriptions=listeInscriptions;
        listeInscriptions.add(this);
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
