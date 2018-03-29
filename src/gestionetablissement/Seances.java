
package gestionetablissement;


public class Seances {
    
    private int idSeance;
    private int idGroupe;
    private int idHoraire;
    private String remplacantSeance;
    private String rattrapageSeance;
    private String annulationSeance;
    private String reportSeance;

    public Seances(int idSeance, int idGroupe, int idHoraire, String remplacantSeance, String rattrapageSeance, String annulationSeance, String reportSeance) {
        this.idSeance = idSeance;
        this.idGroupe = idGroupe;
        this.idHoraire = idHoraire;
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
