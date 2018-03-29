
package gestionetablissement;


public class Examens {
    
  private int idExamen;
  private Supports support;
  private String typeExamen;// a revoir type ennumere
  private String formeExamen;//type ennumere
  private int baremExamen;//a revoir
  private String descrExam;

    public Examens(int idExamen, int idSupport, String typeExamen, String formeExamen, String baremExamen, String descrExam) {
        this.idExamen = idExamen;
        this.idSupport = idSupport;
        this.typeExamen = typeExamen;
        this.formeExamen = formeExamen;
        this.baremExamen = baremExamen;
        this.descrExam = descrExam;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    public int getIdSupport() {
        return idSupport;
    }

    public void setIdSupport(int idSupport) {
        this.idSupport = idSupport;
    }

    public String getTypeExamen() {
        return typeExamen;
    }

    public void setTypeExamen(String typeExamen) {
        this.typeExamen = typeExamen;
    }

    public String getFormeExamen() {
        return formeExamen;
    }

    public void setFormeExamen(String formeExamen) {
        this.formeExamen = formeExamen;
    }

    public String getBaremExamen() {
        return baremExamen;
    }

    public void setBaremExamen(String baremExamen) {
        this.baremExamen = baremExamen;
    }

    public String getDescrExam() {
        return descrExam;
    }

    public void setDescrExam(String descrExam) {
        this.descrExam = descrExam;
    }


  
    
}
