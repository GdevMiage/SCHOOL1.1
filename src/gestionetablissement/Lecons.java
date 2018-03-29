
package gestionetablissement;


public class Lecons {
    
    private int idLecon;
    private int idSupport;
    private String libelLecon;
    private String pagDebLecon;
    private String pagFinLecon;

    public Lecons(int idLecon, int idSupport, String libelLecon, String pagDebLecon, String pagFinLecon) {
        this.idLecon = idLecon;
        this.idSupport = idSupport;
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

    public int getIdSupport() {
        return idSupport;
    }

    public void setIdSupport(int idSupport) {
        this.idSupport = idSupport;
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
