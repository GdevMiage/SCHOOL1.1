
package gestionetablissement.modele;


public class ConseilPedagos {
   private int idConseilPedago;
   private Reunions reunion;
   private String libelConseilPedago;
   private String decisConseilPedago;
   private ListPro<ConseilPedagos> listeConseilPedagos;
   
   //constructeur avec l'ajout dans la liste 
    public ConseilPedagos(int idConseilPedago, Reunions reunion,
            String libelConseilPedago, String decisConseilPedago,
            ListPro<ConseilPedagos> listeConseilPedagos) {
        
        this.idConseilPedago = idConseilPedago;
        this.reunion = reunion;
        this.libelConseilPedago = libelConseilPedago;
        this.decisConseilPedago = decisConseilPedago;
        this.listeConseilPedagos=listeConseilPedagos;
        listeConseilPedagos.add(this);
    }
  //constructeur sans ajout a la liste
    public ConseilPedagos(int idConseilPedago, Reunions reunion,
            String libelConseilPedago, String decisConseilPedago) {
        
        this.idConseilPedago = idConseilPedago;
        this.reunion = reunion;
        this.libelConseilPedago = libelConseilPedago;
        this.decisConseilPedago = decisConseilPedago;
       
    }
    public int getIdConseilPedago() {
        return idConseilPedago;
    }

    public void setIdConseilPedago(int idConseilPedago) {
        this.idConseilPedago = idConseilPedago;
    }

    public Reunions getReunion() {
        return reunion;
    }

    public void setReunion(Reunions reunion) {
        this.reunion = reunion;
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
