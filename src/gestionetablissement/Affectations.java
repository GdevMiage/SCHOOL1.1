
package gestionetablissement;

import java.util.Date;


public class Affectations {
    
   private int idAffectation;
   private Contrats contrat;
   private int trigrAffectation;
   private String loginAffectation;
   private String motPasseAffectation; 
   private Date dateEntrAffectation; 
   private Date datesortAffectation; 
   private String commAffectation; 
   private String ficheAffectation;
   private String referentAffectation; 
   private boolean validAffectation;

    public Affectations(int idAffectation, int idContrat, int trigrAffectation, String loginAffectation, String motPasseAffectation, Date dateEntrAffectation, Date datesortAffectation, String commAffectation, String ficheAffectation, String referentAffectation, boolean validAffectation) {
        this.idAffectation = idAffectation;
        this.idContrat = idContrat;
        this.trigrAffectation = trigrAffectation;
        this.loginAffectation = loginAffectation;
        this.motPasseAffectation = motPasseAffectation;
        this.dateEntrAffectation = dateEntrAffectation;
        this.datesortAffectation = datesortAffectation;
        this.commAffectation = commAffectation;
        this.ficheAffectation = ficheAffectation;
        this.referentAffectation = referentAffectation;
        this.validAffectation = validAffectation;
    }

    public int getIdAffectation() {
        return idAffectation;
    }

    public void setIdAffectation(int idAffectation) {
        this.idAffectation = idAffectation;
    }

    public int getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(int idContrat) {
        this.idContrat = idContrat;
    }

    public int getTrigrAffectation() {
        return trigrAffectation;
    }

    public void setTrigrAffectation(int trigrAffectation) {
        this.trigrAffectation = trigrAffectation;
    }

    public String getLoginAffectation() {
        return loginAffectation;
    }

    public void setLoginAffectation(String loginAffectation) {
        this.loginAffectation = loginAffectation;
    }

    public String getMotPasseAffectation() {
        return motPasseAffectation;
    }

    public void setMotPasseAffectation(String motPasseAffectation) {
        this.motPasseAffectation = motPasseAffectation;
    }

    public Date getDateEntrAffectation() {
        return dateEntrAffectation;
    }

    public void setDateEntrAffectation(Date dateEntrAffectation) {
        this.dateEntrAffectation = dateEntrAffectation;
    }

    public Date getDatesortAffectation() {
        return datesortAffectation;
    }

    public void setDatesortAffectation(Date datesortAffectation) {
        this.datesortAffectation = datesortAffectation;
    }

    public String getCommAffectation() {
        return commAffectation;
    }

    public void setCommAffectation(String commAffectation) {
        this.commAffectation = commAffectation;
    }

    public String getFicheAffectation() {
        return ficheAffectation;
    }

    public void setFicheAffectation(String ficheAffectation) {
        this.ficheAffectation = ficheAffectation;
    }

    public String getReferentAffectation() {
        return referentAffectation;
    }

    public void setReferentAffectation(String referentAffectation) {
        this.referentAffectation = referentAffectation;
    }

    public boolean isValidAffectation() {
        return validAffectation;
    }

    public void setValidAffectation(boolean validAffectation) {
        this.validAffectation = validAffectation;
    }
   
   
   
   
    
}
