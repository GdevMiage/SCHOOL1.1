 
package gestionetablissement;


public class Agents {
    
    private int idAgent;
    private int idAffectation;

    public Agents(int idAgent, int idAffectation) {
        this.idAgent = idAgent;
        this.idAffectation = idAffectation;
    }

    public int getIdAgent() {
        return idAgent;
    }

    public void setIdAgent(int idAgent) {
        this.idAgent = idAgent;
    }

    public int getIdAffectation() {
        return idAffectation;
    }

    public void setIdAffectation(int idAffectation) {
        this.idAffectation = idAffectation;
    }
    
    
}
