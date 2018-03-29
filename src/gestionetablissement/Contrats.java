
package gestionetablissement;

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

   //constructeur
    public Contrats(int idContrat, int idStatut, int idFonction, int idIndividu, String libelContrat, Date dateEntrContrat, Date datesortContrat, float salaireContrat, float indemnitéContrat, String materielContrat, String contratContrat) {
        this.idContrat = idContrat;
        this.idStatut = idStatut;
        this.idFonction = idFonction;
        this.idIndividu = idIndividu;
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

    public int getIdStatut() {
        return idStatut;
    }

    public void setIdStatut(int idStatut) {
        this.idStatut = idStatut;
    }

    public int getIdFonction() {
        return idFonction;
    }

    public void setIdFonction(int idFonction) {
        this.idFonction = idFonction;
    }

    public int getIdIndividu() {
        return idIndividu;
    }

    public void setIdIndividu(int idIndividu) {
        this.idIndividu = idIndividu;
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
