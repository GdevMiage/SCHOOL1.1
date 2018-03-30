 
package gestionetablissement;


public class Agents {
    
    private int idAgent;
    private Affectations affectation;

    public Agents(int idAgent, Affectations affectation) {
        this.idAgent = idAgent;
        this.affectation = affectation;
    }

    public int getIdAgent() {
        return idAgent;
    }

    public void setIdAgent(int idAgent) {
        this.idAgent = idAgent;
    }

    public Affectations getAffectation() {
        return affectation;
    }

    public void setAffectation(Affectations affectation) {
        this.affectation = affectation;
    }

    
    
    
}
