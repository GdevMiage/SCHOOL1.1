 
package gestionetablissement.modele;

import gestionetablissement.securite.Affectations;


public class Agents {
    
    private int idAgent;
    private Affectations affectation;
    private static ListPro<Agents> listeAgents;
    
    {
        this.listeAgents.add(this);
    }

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
