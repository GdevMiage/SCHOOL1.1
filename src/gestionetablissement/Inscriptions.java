

package gestionetablissement;

import java.util.Date;

 
public class Inscriptions {
    
    private int idInscription;
    private int idEtudiant;
    private int idPaiment;
    private int idPrEnCharg;
    private Date dateInscription;
    private Date dateAbandInscription;
    private Date dateAnnulInscription;
    private int creditInscription; //a revoir

    public Inscriptions(int idInscription, int idEtudiant, int idPaiment, int idPrEnCharg, Date dateInscription, Date dateAbandInscription, Date dateAnnulInscription, int creditInscription) {
        this.idInscription = idInscription;
        this.idEtudiant = idEtudiant;
        this.idPaiment = idPaiment;
        this.idPrEnCharg = idPrEnCharg;
        this.dateInscription = dateInscription;
        this.dateAbandInscription = dateAbandInscription;
        this.dateAnnulInscription = dateAnnulInscription;
        this.creditInscription = creditInscription;
    }

    public int getIdInscription() {
        return idInscription;
    }

    public void setIdInscription(int idInscription) {
        this.idInscription = idInscription;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public int getIdPaiment() {
        return idPaiment;
    }

    public void setIdPaiment(int idPaiment) {
        this.idPaiment = idPaiment;
    }

    public int getIdPrEnCharg() {
        return idPrEnCharg;
    }

    public void setIdPrEnCharg(int idPrEnCharg) {
        this.idPrEnCharg = idPrEnCharg;
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

    public int getCreditInscription() {
        return creditInscription;
    }

    public void setCreditInscription(int creditInscription) {
        this.creditInscription = creditInscription;
    }

    
}
