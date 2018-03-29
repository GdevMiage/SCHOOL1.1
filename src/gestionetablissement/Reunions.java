
package gestionetablissement;


public class Reunions {
    private int idReunion;
    private int idSeance;
    private String libelReunion;
    private String participantsReunion;//a revoir
    private String ODJReunion; //arevoir
    private String hrDebReunion;
    private String hrFinReunion;
    private String presReunion;
    private String abscReunion;
    private String commReunion;
    private String CRReunion;

    public Reunions(int idReunion, int idSeance, String libelReunion, String participantsReunion, String ODJReunion, String hrDebReunion, String hrFinReunion, String presReunion, String abscReunion, String commReunion, String CRReunion) {
        this.idReunion = idReunion;
        this.idSeance = idSeance;
        this.libelReunion = libelReunion;
        this.participantsReunion = participantsReunion;
        this.ODJReunion = ODJReunion;
        this.hrDebReunion = hrDebReunion;
        this.hrFinReunion = hrFinReunion;
        this.presReunion = presReunion;
        this.abscReunion = abscReunion;
        this.commReunion = commReunion;
        this.CRReunion = CRReunion;
    }

    public int getIdReunion() {
        return idReunion;
    }

    public void setIdReunion(int idReunion) {
        this.idReunion = idReunion;
    }

    public int getIdSeance() {
        return idSeance;
    }

    public void setIdSeance(int idSeance) {
        this.idSeance = idSeance;
    }

    public String getLibelReunion() {
        return libelReunion;
    }

    public void setLibelReunion(String libelReunion) {
        this.libelReunion = libelReunion;
    }

    public String getParticipantsReunion() {
        return participantsReunion;
    }

    public void setParticipantsReunion(String participantsReunion) {
        this.participantsReunion = participantsReunion;
    }

    public String getODJReunion() {
        return ODJReunion;
    }

    public void setODJReunion(String ODJReunion) {
        this.ODJReunion = ODJReunion;
    }

    public String getHrDebReunion() {
        return hrDebReunion;
    }

    public void setHrDebReunion(String hrDebReunion) {
        this.hrDebReunion = hrDebReunion;
    }

    public String getHrFinReunion() {
        return hrFinReunion;
    }

    public void setHrFinReunion(String hrFinReunion) {
        this.hrFinReunion = hrFinReunion;
    }

    public String getPresReunion() {
        return presReunion;
    }

    public void setPresReunion(String presReunion) {
        this.presReunion = presReunion;
    }

    public String getAbscReunion() {
        return abscReunion;
    }

    public void setAbscReunion(String abscReunion) {
        this.abscReunion = abscReunion;
    }

    public String getCommReunion() {
        return commReunion;
    }

    public void setCommReunion(String commReunion) {
        this.commReunion = commReunion;
    }

    public String getCRReunion() {
        return CRReunion;
    }

    public void setCRReunion(String CRReunion) {
        this.CRReunion = CRReunion;
    }
    
    
    
    
   
    
    
    
}
