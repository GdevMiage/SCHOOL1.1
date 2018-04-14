
package gestionetablissement.modele;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;


public class Reunions {
    private int idReunion;
  
    private String libelReunion;
    private Individus[] participantsReunion; 
    private String ODJReunion;  
    private Horaires horaireReunion;
    private ArrayList<Individus> presReunion;
    private ArrayList<Individus> abscReunion;
    private String commReunion;
    private String CRReunion;
    private ConseilPedagos conseilPedagos;
    private ConseilAdmins conseilAdmins;
    private ArrayList<TacheAFaires> listeTacheAFaire;
    
    
    public static final ListPro<Reunions> listeReunions = new ListPro<Reunions>();
   
    {
        this.listeReunions.add(this);
    }
  
        //pour definir a chaque fois les ID
    public static int definirId(){
        Iterator it = listeReunions.iterator();
        
        //année actuelle 
       
        int annee =Calendar.getInstance().get(Calendar.YEAR);
        
        Reunions ReunionsPlusGrandId=null;
        boolean vide =true;
        if(it.hasNext())  ReunionsPlusGrandId=  (Reunions) it.next();
        while(it.hasNext()){
            Reunions Reunions = (Reunions) it.next();
            vide=false;
            if(Reunions.getIdReunion()>ReunionsPlusGrandId.getIdReunion()) ReunionsPlusGrandId = Reunions;
        }
            
            if(vide) {System.out.println((annee *10)+1);return ((annee *100000)+1);}
            else {System.out.println(ReunionsPlusGrandId.getIdReunion()+1);return ReunionsPlusGrandId.getIdReunion()+1;}
        
        
    }
    
    public static ArrayList<Reunions> of(String id ){
        Iterator it = listeReunions.iterator();
        ArrayList<Reunions> listRecherche=null;
        while(it.hasNext()){
            Reunions Reunions = (Reunions) it.next();
            String idd = Reunions.getIdReunion()+"";
            if(idd.indexOf(id)!=0){
                
                listRecherche.add(Reunions);
            }
        }
        return listRecherche;
    }
    
    public Reunions(int idReunion, String libelReunion, Individus[] participantsReunion, String ODJReunion, Horaires horaireDebutFin, ArrayList<Individus> presReunion, ArrayList<Individus> abscReunion, String commReunion, String CRReunion,ListPro<Reunions> listeReunions) {
        this.idReunion = idReunion;
      
        this.libelReunion = libelReunion;
        this.participantsReunion = participantsReunion;
        this.ODJReunion = ODJReunion;
        this.horaireReunion=horaireDebutFin;
        this.presReunion = presReunion;
        this.abscReunion = abscReunion;
        this.commReunion = commReunion;
        this.CRReunion = CRReunion;
       
    }

    public int getIdReunion() {
        return idReunion;
    }

    public void setIdReunion(int idReunion) {
        this.idReunion = idReunion;
    }

 
    public String getLibelReunion() {
        return libelReunion;
    }

    public void setLibelReunion(String libelReunion) {
        this.libelReunion = libelReunion;
    }

    public Horaires getHoraireReunion() {
        return horaireReunion;
    }

    public void setHoraireReunion(Horaires horaireReunion) {
        this.horaireReunion = horaireReunion;
    }

    public ConseilPedagos getConseilPedagos() {
        return conseilPedagos;
    }

    public void setConseilPedagos(ConseilPedagos conseilPedagos) {
        this.conseilPedagos = conseilPedagos;
    }

    public ConseilAdmins getConseilAdmins() {
        return conseilAdmins;
    }

    public void setConseilAdmins(ConseilAdmins conseilAdmins) {
        this.conseilAdmins = conseilAdmins;
    }

    public ArrayList<TacheAFaires> getListeTacheAFaire() {
        return listeTacheAFaire;
    }

    public void setListeTacheAFaire(ArrayList<TacheAFaires> listeTacheAFaire) {
        this.listeTacheAFaire = listeTacheAFaire;
    }

    public ListPro<Reunions> getListeReunions() {
        return listeReunions;
    }




    public String getODJReunion() {
        return ODJReunion;
    }

    public void setODJReunion(String ODJReunion) {
        this.ODJReunion = ODJReunion;
    }



    public Individus[] getParticipantsReunion() {
        return participantsReunion;
    }

    public void setParticipantsReunion(Individus[] participantsReunion) {
        this.participantsReunion = participantsReunion;
    }


    public ArrayList<Individus> getPresReunion() {
        return presReunion;
    }

    public void setPresReunion(ArrayList<Individus> presReunion) {
        this.presReunion = presReunion;
    }

    public ArrayList<Individus> getAbscReunion() {
        return abscReunion;
    }

    public void setAbscReunion(ArrayList<Individus> abscReunion) {
        this.abscReunion = abscReunion;
    }




    public String getCommReunion() {
        return commReunion;
    }

    public void setCommReunion(String commReunion) {
        this.commReunion = commReunion;
    }

    public String getCRReunion() {
        return CRReunion;
    }

    public void setCRReunion(String CRReunion) {
        this.CRReunion = CRReunion;
    }
    
    
    
    
   
    
    
    
}
