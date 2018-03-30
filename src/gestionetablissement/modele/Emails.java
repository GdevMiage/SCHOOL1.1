
package gestionetablissement.modele;


public class Emails {
    
  private int idEmail;
  private Individus individus;
  private String adresseEmail;
  private String frqUtlMailEmail;

    public Emails(int idEmail, Individus individus, String adresseEmail, String frqUtlMailEmail) {
        this.idEmail = idEmail;
        this.individus = individus;
        this.adresseEmail = adresseEmail;
        this.frqUtlMailEmail = frqUtlMailEmail;
    }

    public int getIdEmail() {
        return idEmail;
    }

    public void setIdEmail(int idEmail) {
        this.idEmail = idEmail;
    }

    public Individus getIndividus() {
        return individus;
    }

    public void setIndividus(Individus individus) {
        this.individus = individus;
    }


    public String getAdresseEmail() {
        return adresseEmail;
    }

    public void setAdresseEmail(String adresseEmail) {
        this.adresseEmail = adresseEmail;
    }

    public String getFrqUtlMailEmail() {
        return frqUtlMailEmail;
    }

    public void setFrqUtlMailEmail(String frqUtlMailEmail) {
        this.frqUtlMailEmail = frqUtlMailEmail;
    }
  
  
    
}
