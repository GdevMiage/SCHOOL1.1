 
package gestionetablissement.modele;

 
public class Tarifs {
    
    private int idTarif;
    private double fraisInscTarif;
    private double cotisTarif;  // a revoir 
    private double remDurTarif; // a revoir 
    private double remModTarif;  // a revoir 

    public Tarifs(int idTarif, double fraisInscTarif, double cotisTarif, double remDurTarif, double remModTarif) {
        this.idTarif = idTarif;
        this.fraisInscTarif = fraisInscTarif;
        this.cotisTarif = cotisTarif;
        this.remDurTarif = remDurTarif;
        this.remModTarif = remModTarif;
    }

    public int getIdTarif() {
        return idTarif;
    }

    public void setIdTarif(int idTarif) {
        this.idTarif = idTarif;
    }

    public double getFraisInscTarif() {
        return fraisInscTarif;
    }

    public void setFraisInscTarif(double fraisInscTarif) {
        this.fraisInscTarif = fraisInscTarif;
    }

    public double getCotisTarif() {
        return cotisTarif;
    }

    public void setCotisTarif(double cotisTarif) {
        this.cotisTarif = cotisTarif;
    }

    public double getRemDurTarif() {
        return remDurTarif;
    }

    public void setRemDurTarif(double remDurTarif) {
        this.remDurTarif = remDurTarif;
    }

    public double getRemModTarif() {
        return remModTarif;
    }

    public void setRemModTarif(double remModTarif) {
        this.remModTarif = remModTarif;
    }
    
    
}
