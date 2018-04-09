
package gestionetablissement.modele;

import java.util.ArrayList;


public class Plannings {
    
  private int idPlanning;
  private String horLunPlanning;
  private String horMarPlanning;
  private String horMerPlanning;
  private String horJeuPlanning;
  private String horVenPlanning;
  private String horSaPlanning;
  private String horDimPlanning;
  private String libelPlanning; 
  private ArrayList<Sessions> session;
  private ListPro<Plannings> listePlannings ;
  
    public Plannings(){
        
    }
    public Plannings(int idPlanning, String horLunPlanning, String horMarPlanning, String horMerPlanning, String horJeuPlanning, String horVenPlanning, String horSaPlanning, String horDimPlanning, String libelPlanning,Sessions session,ListPro<Plannings> plan) {
        this.idPlanning = idPlanning;
        this.horLunPlanning = horLunPlanning;
        this.horMarPlanning = horMarPlanning;
        this.horMerPlanning = horMerPlanning;
        this.horJeuPlanning = horJeuPlanning;
        this.horVenPlanning = horVenPlanning;
        this.horSaPlanning = horSaPlanning;
        this.horDimPlanning = horDimPlanning;
        this.libelPlanning = libelPlanning;
        this.session.add(session);
        this.listePlannings=plan;
        plan.add(this);
        
    }

    public int getIdPlanning() {
        return idPlanning;
    }

    public void setIdPlanning(int idPlanning) {
        this.idPlanning = idPlanning;
    }

    public String getHorLunPlanning() {
        return horLunPlanning;
    }

    public void setHorLunPlanning(String horLunPlanning) {
        this.horLunPlanning = horLunPlanning;
    }

    public String getHorMarPlanning() {
        return horMarPlanning;
    }

    public void setHorMarPlanning(String horMarPlanning) {
        this.horMarPlanning = horMarPlanning;
    }

    public String getHorMerPlanning() {
        return horMerPlanning;
    }

    public void setHorMerPlanning(String horMerPlanning) {
        this.horMerPlanning = horMerPlanning;
    }

    public String getHorJeuPlanning() {
        return horJeuPlanning;
    }

    public void setHorJeuPlanning(String horJeuPlanning) {
        this.horJeuPlanning = horJeuPlanning;
    }

    public String getHorVenPlanning() {
        return horVenPlanning;
    }

    public void setHorVenPlanning(String horVenPlanning) {
        this.horVenPlanning = horVenPlanning;
    }

    public String getHorSaPlanning() {
        return horSaPlanning;
    }

    public void setHorSaPlanning(String horSaPlanning) {
        this.horSaPlanning = horSaPlanning;
    }

    public String getHorDimPlanning() {
        return horDimPlanning;
    }

    public void setHorDimPlanning(String horDimPlanning) {
        this.horDimPlanning = horDimPlanning;
    }

    public String getLibelPlanning() {
        return libelPlanning;
    }

    public void setLibelPlanning(String libelPlanning) {
        this.libelPlanning = libelPlanning;
    }
  
  
  
  
    
}
