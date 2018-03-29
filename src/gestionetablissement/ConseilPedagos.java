
package gestionetablissement;


public class ConseilPedagos {
   private int idConseilPedago;
   private Reunions reunion;
   private String libelConseilPedago;
   private String decisConseilPedago;

    public ConseilPedagos(int idConseilPedago, int idReunion, String libelConseilPedago, String decisConseilPedago) {
        this.idConseilPedago = idConseilPedago;
        this.idReunion = idReunion;
        this.libelConseilPedago = libelConseilPedago;
        this.decisConseilPedago = decisConseilPedago;
    }

    public int getIdConseilPedago() {
        return idConseilPedago;
    }

    public void setIdConseilPedago(int idConseilPedago) {
        this.idConseilPedago = idConseilPedago;
    }

    public int getIdReunion() {
        return idReunion;
    }

    public void setIdReunion(int idReunion) {
        this.idReunion = idReunion;
    }

    public String getLibelConseilPedago() {
        return libelConseilPedago;
    }

    public void setLibelConseilPedago(String libelConseilPedago) {
        this.libelConseilPedago = libelConseilPedago;
    }

    public String getDecisConseilPedago() {
        return decisConseilPedago;
    }

    public void setDecisConseilPedago(String decisConseilPedago) {
        this.decisConseilPedago = decisConseilPedago;
    }
   
   
   
   
   
   
   
}
