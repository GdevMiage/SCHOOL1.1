 
package gestionetablissement.modele;

  
public class Charges {
    
    private int idCharge;
    private String nomCharge;
    private String typeCharge; // a revoir 
    private double montCharge;
    public static final ListPro<Charges> listeCharges = new ListPro<Charges>();
   
    {
        this.listeCharges.add(this);
    }

    public Charges(int idCharge, String nomCharge, String typeCharge, double montCharge) {
        this.idCharge = idCharge;
        this.nomCharge = nomCharge;
        this.typeCharge = typeCharge;
        this.montCharge = montCharge;
    }

    public int getIdCharge() {
        return idCharge;
    }

    public void setIdCharge(int idCharge) {
        this.idCharge = idCharge;
    }

    public String getNomCharge() {
        return nomCharge;
    }

    public void setNomCharge(String nomCharge) {
        this.nomCharge = nomCharge;
    }

    public String getTypeCharge() {
        return typeCharge;
    }

    public void setTypeCharge(String typeCharge) {
        this.typeCharge = typeCharge;
    }

    public double getMontCharge() {
        return montCharge;
    }

    public void setMontCharge(double montCharge) {
        this.montCharge = montCharge;
    }
    
    
    
}
