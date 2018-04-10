 
package gestionetablissement.modele;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

 
public class Modules {
    
    private int idModule;
    private String libelModule;

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
            Modules Modules = (Modules) it.next();
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
    public Modules(int idModule, String libelModule) {
        this.idModule = idModule;
        this.libelModule = libelModule;
    }

    public int getIdModule() {
        return idModule;
    }

    public void setIdModule(int idModule) {
        this.idModule = idModule;
    }

    public String getLibelModule() {
        return libelModule;
    }

    public void setLibelModule(String libelModule) {
        this.libelModule = libelModule;
    }
    
    
}
