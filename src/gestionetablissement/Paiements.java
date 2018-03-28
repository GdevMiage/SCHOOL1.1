 
package gestionetablissement;

import java.util.Date;
 
public class Paiements {
    
    private int idPaiement;
    private int idInscription;
    private int idTarifs;
    private int nbrSessionPaiment;
    private int nbrMatierePaiment;
    private double montantPaiement;
    private int modePaiement; // a revoir
    private Date datePaiement;
    private int trigrPaiment; // a revoir
    private Date dateEncais1Paiement;
    private Date dateEncais2Paiement;
    private Date dateEncais3Paiement;
    private int trigrEncaisPaiment;
    private Date dateTransfPaiement;
    private int trigrTranfPaiment;

    public Paiements(int idPaiement, int idInscription, int idTarifs, int nbrSessionPaiment, int nbrMatierePaiment, double montantPaiement, int modePaiement, Date datePaiement, int trigrPaiment, Date dateEncais1Paiement, Date dateEncais2Paiement, Date dateEncais3Paiement, int trigrEncaisPaiment, Date dateTransfPaiement, int trigrTranfPaiment) {
        this.idPaiement = idPaiement;
        this.idInscription = idInscription;
        this.idTarifs = idTarifs;
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

    public int getIdInscription() {
        return idInscription;
    }

    public void setIdInscription(int idInscription) {
        this.idInscription = idInscription;
    }

    public int getIdTarifs() {
        return idTarifs;
    }

    public void setIdTarifs(int idTarifs) {
        this.idTarifs = idTarifs;
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

    public int getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(int modePaiement) {
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
