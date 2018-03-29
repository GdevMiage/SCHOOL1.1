
package gestionetablissement;


public class TacheAFaires {
   private int idTacheAFaire;
   private int idReunion;
   private String libelTacheAFaire;
   private String echTacheAFaire;
   private String emettTacheAFaire;
   private String commTacheAFaire;
   private String ficheTacheAFaire;

    public TacheAFaires(int idTacheAFaire, int idReunion, String libelTacheAFaire, String echTacheAFaire, String emettTacheAFaire, String commTacheAFaire, String ficheTacheAFaire) {
        this.idTacheAFaire = idTacheAFaire;
        this.idReunion = idReunion;
        this.libelTacheAFaire = libelTacheAFaire;
        this.echTacheAFaire = echTacheAFaire;
        this.emettTacheAFaire = emettTacheAFaire;
        this.commTacheAFaire = commTacheAFaire;
        this.ficheTacheAFaire = ficheTacheAFaire;
    }

    public int getIdTacheAFaire() {
        return idTacheAFaire;
    }

    public void setIdTacheAFaire(int idTacheAFaire) {
        this.idTacheAFaire = idTacheAFaire;
    }

    public int getIdReunion() {
        return idReunion;
    }

    public void setIdReunion(int idReunion) {
        this.idReunion = idReunion;
    }

    public String getLibelTacheAFaire() {
        return libelTacheAFaire;
    }

    public void setLibelTacheAFaire(String libelTacheAFaire) {
        this.libelTacheAFaire = libelTacheAFaire;
    }

    public String getEchTacheAFaire() {
        return echTacheAFaire;
    }

    public void setEchTacheAFaire(String echTacheAFaire) {
        this.echTacheAFaire = echTacheAFaire;
    }

    public String getEmettTacheAFaire() {
        return emettTacheAFaire;
    }

    public void setEmettTacheAFaire(String emettTacheAFaire) {
        this.emettTacheAFaire = emettTacheAFaire;
    }

    public String getCommTacheAFaire() {
        return commTacheAFaire;
    }

    public void setCommTacheAFaire(String commTacheAFaire) {
        this.commTacheAFaire = commTacheAFaire;
    }

    public String getFicheTacheAFaire() {
        return ficheTacheAFaire;
    }

    public void setFicheTacheAFaire(String ficheTacheAFaire) {
        this.ficheTacheAFaire = ficheTacheAFaire;
    }
   
   
   
   
   
    
}
