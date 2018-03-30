
package gestionetablissement.modele;


public class Lecons {
    
    private int idLecon;
    private Supports support;
    private String libelLecon;
    private String pagDebLecon;
    private String pagFinLecon;

    public Lecons(int idLecon, Supports support, String libelLecon, String pagDebLecon, String pagFinLecon) {
        this.idLecon = idLecon;
        this.support = support;
        this.libelLecon = libelLecon;
        this.pagDebLecon = pagDebLecon;
        this.pagFinLecon = pagFinLecon;
    }

    public int getIdLecon() {
        return idLecon;
    }

    public void setIdLecon(int idLecon) {
        this.idLecon = idLecon;
    }

    public Supports getSupport() {
        return support;
    }

    public void setSupport(Supports support) {
        this.support = support;
    }


    public String getLibelLecon() {
        return libelLecon;
    }

    public void setLibelLecon(String libelLecon) {
        this.libelLecon = libelLecon;
    }

    public String getPagDebLecon() {
        return pagDebLecon;
    }

    public void setPagDebLecon(String pagDebLecon) {
        this.pagDebLecon = pagDebLecon;
    }

    public String getPagFinLecon() {
        return pagFinLecon;
    }

    public void setPagFinLecon(String pagFinLecon) {
        this.pagFinLecon = pagFinLecon;
    }
    
    
    
    
    
}
