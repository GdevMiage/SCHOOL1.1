
package gestionetablissement;


public class ConseilAdmins {
    
  private int idConseilAdmin;
  private int idReunion;
  private String libelConseilAdmin;
  private String objetConseilAdmin;
  private String decisConseilAdmin;
  private String PVConseilAdmin;

    public ConseilAdmins(int idConseilAdmin, int idReunion, String libelConseilAdmin, String objetConseilAdmin, String decisConseilAdmin, String PVConseilAdmin) {
        this.idConseilAdmin = idConseilAdmin;
        this.idReunion = idReunion;
        this.libelConseilAdmin = libelConseilAdmin;
        this.objetConseilAdmin = objetConseilAdmin;
        this.decisConseilAdmin = decisConseilAdmin;
        this.PVConseilAdmin = PVConseilAdmin;
    }

    public int getIdConseilAdmin() {
        return idConseilAdmin;
    }

    public void setIdConseilAdmin(int idConseilAdmin) {
        this.idConseilAdmin = idConseilAdmin;
    }

    public int getIdReunion() {
        return idReunion;
    }

    public void setIdReunion(int idReunion) {
        this.idReunion = idReunion;
    }

    public String getLibelConseilAdmin() {
        return libelConseilAdmin;
    }

    public void setLibelConseilAdmin(String libelConseilAdmin) {
        this.libelConseilAdmin = libelConseilAdmin;
    }

    public String getObjetConseilAdmin() {
        return objetConseilAdmin;
    }

    public void setObjetConseilAdmin(String objetConseilAdmin) {
        this.objetConseilAdmin = objetConseilAdmin;
    }

    public String getDecisConseilAdmin() {
        return decisConseilAdmin;
    }

    public void setDecisConseilAdmin(String decisConseilAdmin) {
        this.decisConseilAdmin = decisConseilAdmin;
    }

    public String getPVConseilAdmin() {
        return PVConseilAdmin;
    }

    public void setPVConseilAdmin(String PVConseilAdmin) {
        this.PVConseilAdmin = PVConseilAdmin;
    }
  
  
  
  
  
    
}
