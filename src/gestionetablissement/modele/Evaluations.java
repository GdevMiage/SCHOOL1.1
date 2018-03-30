
package gestionetablissement.modele;


public class Evaluations {
   private int idEvaluation;
   private Assiduites assiduite;
   private Examens examen;
   private String auteurEvaluation;
   private float noteEvaluation;
   private String apprecEvaluation;

    public Evaluations(int idEvaluation, Assiduites assiduite, Examens examen, String auteurEvaluation, float noteEvaluation, String apprecEvaluation) {
        this.idEvaluation = idEvaluation;
        this.assiduite = assiduite;
        this.examen = examen;
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

    public Assiduites getAssiduite() {
        return assiduite;
    }

    public void setAssiduite(Assiduites assiduite) {
        this.assiduite = assiduite;
    }

    public Examens getExamen() {
        return examen;
    }

    public void setExamen(Examens examen) {
        this.examen = examen;
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
