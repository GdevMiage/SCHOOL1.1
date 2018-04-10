 
package gestionetablissement.modele;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

 
public class Matieres {
    
    private int idMatiere;
    private Modules module;
    private String libelMatiere;

     public static final ListPro<Matieres> listeMatieres = new ListPro<Matieres>();
   
    {
        this.listeMatieres.add(this);
    }
  
        //pour definir a chaque fois les ID
    public static int definirId(){
        Iterator it = listeMatieres.iterator();
        
        //année actuelle 
       
        int annee =Calendar.getInstance().get(Calendar.YEAR);
        
        Matieres MatieresPlusGrandId=null;
        boolean vide =true;
        if(it.hasNext())  MatieresPlusGrandId=  (Matieres) it.next();
        while(it.hasNext()){
            Matieres Matieres = (Matieres) it.next();
            vide=false;
            if(Matieres.getIdMatiere()>MatieresPlusGrandId.getIdMatiere()) MatieresPlusGrandId =Matieres;
        }
            
            if(vide) {System.out.println((annee *10)+1);return ((annee *100000)+1);}
            else {System.out.println(MatieresPlusGrandId.getIdMatiere()+1);return MatieresPlusGrandId.getIdMatiere()+1;}
        
        
    }
    
    public static ArrayList<Matieres> of(String id ){
        Iterator it = listeMatieres.iterator();
        ArrayList<Matieres> listRecherche=null;
        while(it.hasNext()){
            Matieres Matieres = (Matieres) it.next();
            String idd = Matieres.getIdMatiere()+"";
            if(idd.indexOf(id)!=0){
                
                listRecherche.add(Matieres);
            }
        }
        return listRecherche;
    }
    public Matieres(int idMatiere, Modules module, String libelMatiere) {
        this.idMatiere = idMatiere;
        this.module = module;
        this.libelMatiere = libelMatiere;
    }

    public int getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(int idMatiere) {
        this.idMatiere = idMatiere;
    }

    public Modules getModule() {
        return module;
    }

    public void setModule(Modules module) {
        this.module = module;
    }


    public String getLibelMatiere() {
        return libelMatiere;
    }

    public void setLibelMatiere(String libelMatiere) {
        this.libelMatiere = libelMatiere;
    }
    
    

}
