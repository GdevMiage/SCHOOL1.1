
package gestionetablissement.modele;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;


public class Sessions {
  private int idSession;
  private Date annee;
  private String libelSession;
  private Horaires debutFinSession ;
  private Date[] joursFerieSession;
  private ArrayList<Groupes> groupe ;
  private ArrayList<Charges> charges;
  private ArrayList<Produits> produits;
  
  
  public static final ListPro<Sessions> listeSessions = new ListPro<Sessions>();
   
    {
        this.listeSessions.add(this);
    }
  
        //pour definir a chaque fois les ID
    public static int definirId(){
        Iterator it = listeSessions.iterator();
        
        //année actuelle 
       
        int annee =Calendar.getInstance().get(Calendar.YEAR);
        
        Sessions SessionsPlusGrandId=null;
        boolean vide =true;
        if(it.hasNext())  SessionsPlusGrandId=  (Sessions) it.next();
        while(it.hasNext()){
            Sessions Sessions = (Sessions) it.next();
            vide=false;
            if(Sessions.getIdSession()>SessionsPlusGrandId.getIdSession()) SessionsPlusGrandId =Sessions;
        }
            
            if(vide) {System.out.println((annee *10)+1);return ((annee *100000)+1);}
            else {System.out.println(SessionsPlusGrandId.getIdSession()+1);return SessionsPlusGrandId.getIdSession()+1;}
        
        
    }
    
    public static ArrayList<Sessions> of(String id ){
        Iterator it = listeSessions.iterator();
        ArrayList<Sessions> listRecherche=null;
        while(it.hasNext()){
           Sessions Sessions = (Sessions) it.next();
            String idd = Sessions.getIdSession()+"";
            if(idd.indexOf(id)!=0){
                
                listRecherche.add(Sessions);
            }
        }
        return listRecherche;
    }
  
  
    public Sessions(int idSession, Date annee, String libelSession, Horaires debutFinSession, Date[] joursFerieSession) {
        this.idSession = idSession;
        this.annee = annee;
        this.libelSession = libelSession;
        this.debutFinSession = debutFinSession;
        this.joursFerieSession = joursFerieSession;
        
    }
     public Sessions(int idSession, Date annee, String libelSession, Horaires debutFinSession, Date[] joursFerieSession,ListPro<Sessions> ListeSession) {
        this.idSession = idSession;
        this.annee = annee;
        this.libelSession = libelSession;
        this.debutFinSession = debutFinSession;
        this.joursFerieSession = joursFerieSession;
        
    }
    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

   

    public String getLibelSession() {
        return libelSession;
    }

    public void setLibelSession(String libelSession) {
        this.libelSession = libelSession;
    }



    public Date getAnnee() {
        return annee;
    }

    public void setAnnee(Date annee) {
        this.annee = annee;
    }

    public Date[] getJoursFerieSession() {
        return joursFerieSession;
    }

    public void setJoursFerieSession(Date[] joursFerieSession) {
        this.joursFerieSession = joursFerieSession;
    }


  
  
  
    
}
