 
package gestionetablissement.modele;
 

public class PrEnCharg {

    private int idPrEnCharg;
    private String libelPrEnCharg;
    private double montantPrEnCharg;
    private int referPrEnCharg;
    private int validPrEnCharg; // a revoir

    public PrEnCharg(int idPrEnCharg, String libelPrEnCharg, double montantPrEnCharg, int referPrEnCharg, int validPrEnCharg) {
        this.idPrEnCharg = idPrEnCharg;
        this.libelPrEnCharg = libelPrEnCharg;
        this.montantPrEnCharg = montantPrEnCharg;
        this.referPrEnCharg = referPrEnCharg;
        this.validPrEnCharg = validPrEnCharg;
    }

    public int getIdPrEnCharg() {
        return idPrEnCharg;
    }

    public void setIdPrEnCharg(int idPrEnCharg) {
        this.idPrEnCharg = idPrEnCharg;
    }

    public String getLibelPrEnCharg() {
        return libelPrEnCharg;
    }

    public void setLibelPrEnCharg(String libelPrEnCharg) {
        this.libelPrEnCharg = libelPrEnCharg;
    }

    public double getMontantPrEnCharg() {
        return montantPrEnCharg;
    }

    public void setMontantPrEnCharg(double montantPrEnCharg) {
        this.montantPrEnCharg = montantPrEnCharg;
    }

    public int getReferPrEnCharg() {
        return referPrEnCharg;
    }

    public void setReferPrEnCharg(int referPrEnCharg) {
        this.referPrEnCharg = referPrEnCharg;
    }

    public int getValidPrEnCharg() {
        return validPrEnCharg;
    }

    public void setValidPrEnCharg(int validPrEnCharg) {
        this.validPrEnCharg = validPrEnCharg;
    }
    
    
    
}
