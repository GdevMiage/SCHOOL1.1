
package gestionetablissement;


public class Emails {
    
  private int idEmail;
  private int idIndividu;
  private String adresseEmail;
  private String frqUtlMailEmail;

    public Emails(int idEmail, int idIndividu, String adresseEmail, String frqUtlMailEmail) {
        this.idEmail = idEmail;
        this.idIndividu = idIndividu;
        this.adresseEmail = adresseEmail;
        this.frqUtlMailEmail = frqUtlMailEmail;
    }

    public int getIdEmail() {
        return idEmail;
    }

    public void setIdEmail(int idEmail) {
        this.idEmail = idEmail;
    }

    public int getIdIndividu() {
        return idIndividu;
    }

    public void setIdIndividu(int idIndividu) {
        this.idIndividu = idIndividu;
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
