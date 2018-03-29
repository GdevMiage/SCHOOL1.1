
package gestionetablissement;


public class Programme {
    
   private int idLecon;
   private Supports support;
   private Seances seance;
   private Groupes groupe; 
   private Horaires horaire;

    public Programme(int idLecon, int idSupport, int idSeance, int idGroupe, int idHoraire) {
        this.idLecon = idLecon;
        this.idSupport = idSupport;
        this.idSeance = idSeance;
        this.idGroupe = idGroupe;
        this.idHoraire = idHoraire;
    }

    public int getIdLecon() {
        return idLecon;
    }

    public void setIdLecon(int idLecon) {
        this.idLecon = idLecon;
    }

    public int getIdSupport() {
        return idSupport;
    }

    public void setIdSupport(int idSupport) {
        this.idSupport = idSupport;
    }

    public int getIdSeance() {
        return idSeance;
    }

    public void setIdSeance(int idSeance) {
        this.idSeance = idSeance;
    }

    public int getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }

    public int getIdHoraire() {
        return idHoraire;
    }

    public void setIdHoraire(int idHoraire) {
        this.idHoraire = idHoraire;
    }
   
   
   
   
    
}
