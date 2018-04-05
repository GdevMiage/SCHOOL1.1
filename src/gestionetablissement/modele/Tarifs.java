 
package gestionetablissement.modele;

 
public class Tarifs {
    
    private int idTarif;
    private double fraisInscTarif;
    private double cotisTarif;   
    private double remDurTarif; 
    private ListPro<Tarifs> listeTarif;
    public Tarifs(){
        
    }
    
    public Tarifs(int idTarif, double fraisInscTarif, double cotisTarif, double remDurTarif, double remModTarif,ListPro<Tarifs> listeTarif) {
        this.idTarif = idTarif;
        this.fraisInscTarif = fraisInscTarif;
        this.cotisTarif = cotisTarif;
        this.remDurTarif = remDurTarif;
        this.listeTarif = listeTarif;
        listeTarif.add(this);
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


    
}
