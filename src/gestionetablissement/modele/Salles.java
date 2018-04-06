 
package gestionetablissement.modele;

 
public class Salles {
    
    private int idSalle;
    private String libelSalle;
    private int capaSalle;
    private ListPro<Salles> listeSalle;
    public Salles(){
        
    }

    /**
     *
     * @param idSalle
     * @param libelSalle
     * @param capaSalle
     * @param listeSalle
     */
    public Salles(int idSalle, String libelSalle,int capaSalle, ListPro<Salles> listeSalle) {
        this.idSalle = idSalle;
        this.libelSalle = libelSalle;
        this.capaSalle = capaSalle;
        this.listeSalle = listeSalle;
        listeSalle.add(this);
    }
   public Salles(int idSalle, String libelSalle,int capaSalle) {
        this.idSalle = idSalle;
        this.libelSalle = libelSalle;
        this.capaSalle = capaSalle;
        
       
    }
    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public String getLibelSalle() {
        return libelSalle;
    }

    public void setLibelSalle(String libelSalle) {
        this.libelSalle = libelSalle;
    }

    public int getCapaSalle() {
        return capaSalle;
    }

    public void setCapaSalle(int capaSalle) {
        this.capaSalle = capaSalle;
    }


    
}
