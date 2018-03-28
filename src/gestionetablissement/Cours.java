 
package gestionetablissement;


public class Cours {
    
    private int idCours;
    private int idSupport;
    private String typeDocCours; // a revoir
    private int nbrTypeDocCours;
    // private int support[1-n]Cours; a revoir
    private String libelCours;
    private String niveauCours; // a revoir
    private String partieCours; // a revoir 
    private int volHorCours; // a revoir
    private String descriptifCours; // a revoir

    public Cours(int idCours, int idSupport, String typeDocCours, int nbrTypeDocCours, String libelCours, String niveauCours, String partieCours, int volHorCours, String descriptifCours) {
        this.idCours = idCours;
        this.idSupport = idSupport;
        this.typeDocCours = typeDocCours;
        this.nbrTypeDocCours = nbrTypeDocCours;
        this.libelCours = libelCours;
        this.niveauCours = niveauCours;
        this.partieCours = partieCours;
        this.volHorCours = volHorCours;
        this.descriptifCours = descriptifCours;
    }
/**
 * 
 * @return 
 */
    public int getIdCours() {
        return idCours;
    }
    
    public void setIdCours(int idCours) {
        this.idCours = idCours;
    }

    public int getIdSupport() {
        return idSupport;
    }

    public void setIdSupport(int idSupport) {
        this.idSupport = idSupport;
    }

    public String getTypeDocCours() {
        return typeDocCours;
    }

    public void setTypeDocCours(String typeDocCours) {
        this.typeDocCours = typeDocCours;
    }

    public int getNbrTypeDocCours() {
        return nbrTypeDocCours;
    }

    public void setNbrTypeDocCours(int nbrTypeDocCours) {
        this.nbrTypeDocCours = nbrTypeDocCours;
    }

    public String getLibelCours() {
        return libelCours;
    }

    public void setLibelCours(String libelCours) {
        this.libelCours = libelCours;
    }

    public String getNiveauCours() {
        return niveauCours;
    }

    public void setNiveauCours(String niveauCours) {
        this.niveauCours = niveauCours;
    }

    public String getPartieCours() {
        return partieCours;
    }

    public void setPartieCours(String partieCours) {
        this.partieCours = partieCours;
    }

    public int getVolHorCours() {
        return volHorCours;
    }

    public void setVolHorCours(int volHorCours) {
        this.volHorCours = volHorCours;
    }

    public String getDescriptifCours() {
        return descriptifCours;
    }

    public void setDescriptifCours(String descriptifCours) {
        this.descriptifCours = descriptifCours;
    }
    
    
}
