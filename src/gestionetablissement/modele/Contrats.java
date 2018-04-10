
package gestionetablissement.modele;

import java.util.Date;


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
