
package gestionetablissement.modele;

import java.util.Date;


public class Reunions {
    private int idReunion;
    private Seances seance;
    private String libelReunion;
    private Individus[] participantsReunion;//a revoir
    private String ODJReunion; //arevoir
    private Date hrDebReunion;
    private Date hrFinReunion;
    private Individus[] presReunion;
    private Individus[] abscReunion;
    private String commReunion;
    private String CRReunion;

    public Reunions(int idReunion, int idSeance, String libelReunion, Individus[] participantsReunion, String ODJReunion, Date hrDebReunion, Date hrFinReunion, Individus[] presReunion, Individus[] abscReunion, String commReunion, String CRReunion) {
        this.idReunion = idReunion;
        this.seance = seance;
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

 
    public String getLibelReunion() {
        return libelReunion;
    }

    public void setLibelReunion(String libelReunion) {
        this.libelReunion = libelReunion;
    }


    public String getODJReunion() {
        return ODJReunion;
    }

    public void setODJReunion(String ODJReunion) {
        this.ODJReunion = ODJReunion;
    }

    public Seances getSeance() {
        return seance;
    }

    public void setSeance(Seances seance) {
        this.seance = seance;
    }

    public Individus[] getParticipantsReunion() {
        return participantsReunion;
    }

    public void setParticipantsReunion(Individus[] participantsReunion) {
        this.participantsReunion = participantsReunion;
    }

    public Date getHrDebReunion() {
        return hrDebReunion;
    }

    public void setHrDebReunion(Date hrDebReunion) {
        this.hrDebReunion = hrDebReunion;
    }

    public Date getHrFinReunion() {
        return hrFinReunion;
    }

    public void setHrFinReunion(Date hrFinReunion) {
        this.hrFinReunion = hrFinReunion;
    }

    public Individus[] getPresReunion() {
        return presReunion;
    }

    public void setPresReunion(Individus[] presReunion) {
        this.presReunion = presReunion;
    }

    public Individus[] getAbscReunion() {
        return abscReunion;
    }

    public void setAbscReunion(Individus[] abscReunion) {
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
