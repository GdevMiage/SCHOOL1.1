
package gestionetablissement.modele;

import java.util.Date;


public class Individus<T> {
    private int idIndividu;
    private String nomIndividu;
    private String prenomIndividu; 
    private String genreIndividu; 
    private Date datNaisIndividu; 
    private String lieuNaisIndividu; 
    private String nivEtudIndividu;
    private String domEtudIndividu;
    private String profIndividu; 
    private Adresses domCompetIndividu; 
    private String langMatIndividu; 
    private String langParlIndividu; 
    private String photoIndividu;
    private String rectoPIDIndividu;
    private String versoPIDIndividu; 
    private Affectations affectation;
    private ListPro<Individus> listeIndividusEtablissement;
    

    public Individus(int idIndividu, String nomIndividu, String prenomIndividu ,String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu, String nivEtudIndividu, String domEtudIndividu, String profIndividu, Adresses domCompetIndividu, String langMatIndividu, String langParlIndividu, String photoIndividu, String rectoPIDIndividu, String versoPIDIndividu,Affectations affectation) {
        this.idIndividu = idIndividu;
        this.nomIndividu = nomIndividu;
        this.affectation = affectation;
        this.prenomIndividu = prenomIndividu;
        this.genreIndividu = genreIndividu;
        this.datNaisIndividu = datNaisIndividu;
        this.lieuNaisIndividu = lieuNaisIndividu;
        this.nivEtudIndividu = nivEtudIndividu;
        this.domEtudIndividu = domEtudIndividu;
        this.profIndividu = profIndividu;
        this.domCompetIndividu = domCompetIndividu;
        this.langMatIndividu = langMatIndividu;
        this.langParlIndividu = langParlIndividu;
        this.photoIndividu = photoIndividu;
        this.rectoPIDIndividu = rectoPIDIndividu;
        this.versoPIDIndividu = versoPIDIndividu;
    }
    
    

    public Individus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   public Individus(int idIndividu, String nomIndividu, String prenomIndividu ,String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu, String nivEtudIndividu, String domEtudIndividu, String profIndividu, Adresses domCompetIndividu, String langMatIndividu, String langParlIndividu, String photoIndividu, String rectoPIDIndividu, String versoPIDIndividu,Affectations affectation,ListPro<Individus> individus) {
        this.idIndividu = idIndividu;
        this.nomIndividu = nomIndividu;
        this.affectation = affectation;
        this.prenomIndividu = prenomIndividu;
        this.genreIndividu = genreIndividu;
        this.datNaisIndividu = datNaisIndividu;
        this.lieuNaisIndividu = lieuNaisIndividu;
        this.nivEtudIndividu = nivEtudIndividu;
        this.domEtudIndividu = domEtudIndividu;
        this.profIndividu = profIndividu;
        this.domCompetIndividu = domCompetIndividu;
        this.langMatIndividu = langMatIndividu;
        this.langParlIndividu = langParlIndividu;
        this.photoIndividu = photoIndividu;
        this.rectoPIDIndividu = rectoPIDIndividu;
        this.versoPIDIndividu = versoPIDIndividu;
        this.listeIndividusEtablissement = individus;
        individus.add(this);
    }
    public Affectations getAffectation() {
        return affectation;
    }

    public void setAffectation(Affectations affectation) {
        this.affectation = affectation;
    }

    public int getIdIndividu() {
        return idIndividu;
    }

    public void setIdIndividu(int idIndividu) {
        this.idIndividu = idIndividu;
    }

    public String getNomIndividu() {
        return nomIndividu;
    }

    public void setNomIndividu(String nomIndividu) {
        this.nomIndividu = nomIndividu;
    }

    public String getPrenomIndividu() {
        return prenomIndividu;
    }

    public void setPrenomIndividu(String prenomIndividu) {
        this.prenomIndividu = prenomIndividu;
    }

    public String getGenreIndividu() {
        return genreIndividu;
    }

    public void setGenreIndividu(String genreIndividu) {
        this.genreIndividu = genreIndividu;
    }

    public Date getDatNaisIndividu() {
        return datNaisIndividu;
    }

    public void setDatNaisIndividu(Date datNaisIndividu) {
        this.datNaisIndividu = datNaisIndividu;
    }

    public String getLieuNaisIndividu() {
        return lieuNaisIndividu;
    }

    public void setLieuNaisIndividu(String lieuNaisIndividu) {
        this.lieuNaisIndividu = lieuNaisIndividu;
    }

    public String getNivEtudIndividu() {
        return nivEtudIndividu;
    }

    public void setNivEtudIndividu(String nivEtudIndividu) {
        this.nivEtudIndividu = nivEtudIndividu;
    }

    public String getDomEtudIndividu() {
        return domEtudIndividu;
    }

    public void setDomEtudIndividu(String domEtudIndividu) {
        this.domEtudIndividu = domEtudIndividu;
    }

    public String getProfIndividu() {
        return profIndividu;
    }

    public void setProfIndividu(String profIndividu) {
        this.profIndividu = profIndividu;
    }

    public Adresses getDomCompetIndividu() {
        return domCompetIndividu;
    }

    public void setDomCompetIndividu(Adresses domCompetIndividu) {
        this.domCompetIndividu = domCompetIndividu;
    }

    public String getLangMatIndividu() {
        return langMatIndividu;
    }

    public void setLangMatIndividu(String langMatIndividu) {
        this.langMatIndividu = langMatIndividu;
    }

    public String getLangParlIndividu() {
        return langParlIndividu;
    }

    public void setLangParlIndividu(String langParlIndividu) {
        this.langParlIndividu = langParlIndividu;
    }

    public String getPhotoIndividu() {
        return photoIndividu;
    }

    public void setPhotoIndividu(String photoIndividu) {
        this.photoIndividu = photoIndividu;
    }

    public String getRectoPIDIndividu() {
        return rectoPIDIndividu;
    }

    public void setRectoPIDIndividu(String rectoPIDIndividu) {
        this.rectoPIDIndividu = rectoPIDIndividu;
    }

    public String getVersoPIDIndividu() {
        return versoPIDIndividu;
    }

    public void setVersoPIDIndividu(String versoPIDIndividu) {
        this.versoPIDIndividu = versoPIDIndividu;
    }
     
     
     
    
}
