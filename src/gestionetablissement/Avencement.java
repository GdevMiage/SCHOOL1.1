
package gestionetablissement;


public class Avencement {
    
   private int idAvencement;
   private int idSéance;
   private String leconsCours;
   private String commentCours;
   private String avancemCours;

    public Avencement(int idAvencement, int idSéance, String leconsCours, String commentCours, String avancemCours) {
        this.idAvencement = idAvencement;
        this.idSéance = idSéance;
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

    public int getIdSéance() {
        return idSéance;
    }

    public void setIdSéance(int idSéance) {
        this.idSéance = idSéance;
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
