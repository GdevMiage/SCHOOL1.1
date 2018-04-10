
package gestionetablissement.modele;

import static gestionetablissement.modele.Individus.listeIndividusEtablissement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;


public class Adresses {
  private int idAdresse;

  private int batAdresse;
  private int noAdresse;
  private String rueAdresse; 
  private int cpAdresse;
  private String villeAdresse;
  private String paysAdresse;
  
//liste et methode statique pour enregistrer nos données 
  
  public static final ListPro<Modules> listeModules = new ListPro<Modules>();
   
    {
        this.listeModules.add(this);
    }
  
        //pour definir a chaque fois les ID
    public static int definirId(){
        Iterator it = listeModules.iterator();
        
        //année actuelle 
       
        int annee =Calendar.getInstance().get(Calendar.YEAR);
        
        Modules ModulesPlusGrandId=null;
        boolean vide =true;
        if(it.hasNext())  ModulesPlusGrandId=  (Modules) it.next();
        while(it.hasNext()){
            Modules Modules= (Modules) it.next();
            vide=false;
            if(Modules.getIdModule()>ModulesPlusGrandId.getIdModule()) ModulesPlusGrandId =Modules;
        }
            
            if(vide) {System.out.println((annee *10)+1);return ((annee *100000)+1);}
            else {System.out.println(ModulesPlusGrandId.getIdModule()+1);return ModulesPlusGrandId.getIdModule()+1;}
        
        
    }
    
    public static ArrayList<Modules> of(String id ){
        Iterator it = listeModules.iterator();
        ArrayList<Modules> listRecherche=null;
        while(it.hasNext()){
            Modules Modules = (Modules) it.next();
            String idd = Modules.getIdModule()+"";
            if(idd.indexOf(id)!=0){
                
                listRecherche.add(Modules);
            }
        }
        return listRecherche;
    }
    
  public Adresses(){
      
  }
      public Adresses(int idAdresse, int batAdresse, int noAdresse, String rueAdresse, int cpAdresse, String villeAdresse, String paysAdresse) {
        this.idAdresse = idAdresse;
      
        this.batAdresse = batAdresse;
        this.noAdresse = noAdresse;
        this.rueAdresse = rueAdresse;
        this.cpAdresse = cpAdresse;
        this.villeAdresse = villeAdresse;
        this.paysAdresse = paysAdresse;
    }
      public Adresses(  int batAdresse, int noAdresse, String rueAdresse, int cpAdresse, String villeAdresse, String paysAdresse) {
        this.idAdresse = idAdresse;
         this.idAdresse = Adresses.definirId();
        this.batAdresse = batAdresse;
        this.noAdresse = noAdresse;
        this.rueAdresse = rueAdresse;
        this.cpAdresse = cpAdresse;
        this.villeAdresse = villeAdresse;
        this.paysAdresse = paysAdresse;
    }

    public int getIdAdresse() {
        return idAdresse;
    }

    public void setIdAdresse(int idAdresse) {
        this.idAdresse = idAdresse;
    }



 

    public int getBatAdresse() {
        return batAdresse;
    }

    public void setBatAdresse(int batAdresse) {
        this.batAdresse = batAdresse;
    }

    public int getNoAdresse() {
        return noAdresse;
    }

    public void setNoAdresse(int noAdresse) {
        this.noAdresse = noAdresse;
    }

    public String getRueAdresse() {
        return rueAdresse;
    }

    public void setRueAdresse(String rueAdresse) {
        this.rueAdresse = rueAdresse;
    }

    public int getCpAdresse() {
        return cpAdresse;
    }

    public void setCpAdresse(int cpAdresse) {
        this.cpAdresse = cpAdresse;
    }

    public String getVilleAdresse() {
        return villeAdresse;
    }

    public void setVilleAdresse(String villeAdresse) {
        this.villeAdresse = villeAdresse;
    }

    public String getPaysAdresse() {
        return paysAdresse;
    }

    public void setPaysAdresse(String paysAdresse) {
        this.paysAdresse = paysAdresse;
    }
    
    
    
    
    
   
    
}
