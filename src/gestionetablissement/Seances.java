
package gestionetablissement;


public class Seances {
    
    private int idSeance;
    private Groupes groupe;
    private Horaires horaire;
    private String remplacantSeance;
    private String rattrapageSeance;
    private String annulationSeance;
    private String reportSeance;

    public Seances(int idSeance, Groupes groupe, Horaires horaire, String remplacantSeance, String rattrapageSeance, String annulationSeance, String reportSeance) {
        this.idSeance = idSeance;
        this.groupe = groupe;
        this.horaire = horaire;
        this.remplacantSeance = remplacantSeance;
        this.rattrapageSeance = rattrapageSeance;
        this.annulationSeance = annulationSeance;
        this.reportSeance = reportSeance;
    }

    public int getIdSeance() {
        return idSeance;
    }

    public void setIdSeance(int idSeance) {
        this.idSeance = idSeance;
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



    public String getRemplacantSeance() {
        return remplacantSeance;
    }

    public void setRemplacantSeance(String remplacantSeance) {
        this.remplacantSeance = remplacantSeance;
    }

    public String getRattrapageSeance() {
        return rattrapageSeance;
    }

    public void setRattrapageSeance(String rattrapageSeance) {
        this.rattrapageSeance = rattrapageSeance;
    }

    public String getAnnulationSeance() {
        return annulationSeance;
    }

    public void setAnnulationSeance(String annulationSeance) {
        this.annulationSeance = annulationSeance;
    }

    public String getReportSeance() {
        return reportSeance;
    }

    public void setReportSeance(String reportSeance) {
        this.reportSeance = reportSeance;
    }
    
    
    
    
    
}
