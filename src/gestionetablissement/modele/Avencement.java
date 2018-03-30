
package gestionetablissement;


public class Avencement {
    
   private int idAvencement;
   private Seances seance;
   private String leconsCours;
   private String commentCours;
   private String avancemCours;

    public Avencement(int idAvencement, Seances seance, String leconsCours, String commentCours, String avancemCours) {
        this.idAvencement = idAvencement;
        this.seance = seance;
        this.leconsCours = leconsCours;
        this.commentCours = commentCours;
        this.avancemCours = avancemCours;
    }

    public int getIdAvencement() {
        return idAvencement;
    }

    public void setIdAvencement(int idAvencement) {
        this.idAvencement = idAvencement;
    }

    public Seances getSeance() {
        return seance;
    }

    public void setSeance(Seances seance) {
        this.seance = seance;
    }



    public String getLeconsCours() {
        return leconsCours;
    }

    public void setLeconsCours(String leconsCours) {
        this.leconsCours = leconsCours;
    }

    public String getCommentCours() {
        return commentCours;
    }

    public void setCommentCours(String commentCours) {
        this.commentCours = commentCours;
    }

    public String getAvancemCours() {
        return avancemCours;
    }

    public void setAvancemCours(String avancemCours) {
        this.avancemCours = avancemCours;
    }




   
    
}
