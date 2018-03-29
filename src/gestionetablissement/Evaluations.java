
package gestionetablissement;


public class Evaluations {
   private int idEvaluation;
   private int idAssiduite;
   private int idExamen;
   private String auteurEvaluation;
   private float noteEvaluation;
   private String apprecEvaluation;

    public Evaluations(int idEvaluation, int idAssiduite, int idExamen, String auteurEvaluation, float noteEvaluation, String apprecEvaluation) {
        this.idEvaluation = idEvaluation;
        this.idAssiduite = idAssiduite;
        this.idExamen = idExamen;
        this.auteurEvaluation = auteurEvaluation;
        this.noteEvaluation = noteEvaluation;
        this.apprecEvaluation = apprecEvaluation;
    }

    public int getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(int idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public int getIdAssiduite() {
        return idAssiduite;
    }

    public void setIdAssiduite(int idAssiduite) {
        this.idAssiduite = idAssiduite;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    public String getAuteurEvaluation() {
        return auteurEvaluation;
    }

    public void setAuteurEvaluation(String auteurEvaluation) {
        this.auteurEvaluation = auteurEvaluation;
    }

    public float getNoteEvaluation() {
        return noteEvaluation;
    }

    public void setNoteEvaluation(float noteEvaluation) {
        this.noteEvaluation = noteEvaluation;
    }

    public String getApprecEvaluation() {
        return apprecEvaluation;
    }

    public void setApprecEvaluation(String apprecEvaluation) {
        this.apprecEvaluation = apprecEvaluation;
    }
   
   
   
   
   
    
}
