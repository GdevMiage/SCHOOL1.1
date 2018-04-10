 
package gestionetablissement.modele;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

 
public class Salles {
    
    private int idSalle;
    private String libelSalle;
    private int capaSalle;
    private ListPro<Salles> listeSalle;
    
    public static final ListPro<Salles> listeSalles = new ListPro<Salles>();
   
    {
        this.listeSalles.add(this);
    }
  
        //pour definir a chaque fois les ID
    public static int definirId(){
        Iterator it = listeSalles.iterator();
        
        //année actuelle 
       
        int annee =Calendar.getInstance().get(Calendar.YEAR);
        
        Salles SallesPlusGrandId=null;
        boolean vide =true;
        if(it.hasNext())  SallesPlusGrandId=  (Salles) it.next();
        while(it.hasNext()){
            Salles Salles = (Salles) it.next();
            vide=false;
            if(Salles.getIdSalle()>SallesPlusGrandId.getIdSalle())SallesPlusGrandId = Salles;
        }
            
            if(vide) {System.out.println((annee *10)+1);return ((annee *100000)+1);}
            else {System.out.println(SallesPlusGrandId.getIdSalle()+1);return SallesPlusGrandId.getIdSalle()+1;}
        
        
    }
    
    public static ArrayList<Salles> of(String id ){
        Iterator it = listeSalles.iterator();
        ArrayList<Salles> listRecherche=null;
        while(it.hasNext()){
            Salles Salles = (Salles) it.next();
            String idd = Salles.getIdSalle()+"";
            if(idd.indexOf(id)!=0){
                
                listRecherche.add(Salles);
            }
        }
        return listRecherche;
    }
    public Salles(){
        
    }

    /**
     *
     * @param idSalle
     * @param libelSalle
     * @param capaSalle
     * @param listeSalle
     */
    public Salles(int idSalle, String libelSalle,int capaSalle, ListPro<Salles> listeSalle) {
        this.idSalle = idSalle;
        this.libelSalle = libelSalle;
        this.capaSalle = capaSalle;
        this.listeSalle = listeSalle;
        listeSalle.add(this);
    }
   public Salles(int idSalle, String libelSalle,int capaSalle) {
        this.idSalle = idSalle;
        this.libelSalle = libelSalle;
        this.capaSalle = capaSalle;
        
       
    }
    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public String getLibelSalle() {
        return libelSalle;
    }

    public void setLibelSalle(String libelSalle) {
        this.libelSalle = libelSalle;
    }

    public int getCapaSalle() {
        return capaSalle;
    }

    public void setCapaSalle(int capaSalle) {
        this.capaSalle = capaSalle;
    }


    
}
