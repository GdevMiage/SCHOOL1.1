
package gestionetablissement;


public class Programme {
    
   private int idLecon;
   private Supports support;
   private Seances seance;
   private Groupes groupe; 
   private Horaires horaire;

    public Programme(int idLecon, Supports support, Seances seance, Groupes groupe, Horaires idHoraire) {
        this.idLecon = idLecon;
        this.support = support;
        this.seance = seance;
        this.groupe = groupe;
        this.horaire = idHoraire;
    }

    public int getIdLecon() {
        return idLecon;
    }

    public void setIdLecon(int idLecon) {
        this.idLecon = idLecon;
    }

    public Supports getSupport() {
        return support;
    }

    public void setSupport(Supports support) {
        this.support = support;
    }

    public Seances getSeance() {
        return seance;
    }

    public void setSeance(Seances seance) {
        this.seance = seance;
    }

    public Groupes getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupes groupe) {
        this.groupe = groupe;
    }

    public Horaires getHoraire() {
        return horaire;
    }

    public void setHoraire(Horaires horaire) {
        this.horaire = horaire;
    }


   
   
   
    
}
