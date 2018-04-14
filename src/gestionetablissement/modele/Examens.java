
package gestionetablissement.modele;

import java.util.ArrayList;
import java.util.Date;


public class Examens extends Seances{
    
  private int numExamen;
  ArrayList<Supports> listeSupports;
  private String typeExamen; 
  private String formeExamen; 
  private int baremExamen; 
  private String descrExamen;

  public static final ListPro<Examens> listeExamens = new ListPro<Examens>();
   
    {
        this.listeExamens.add(this);
    }
  
 public Examens(int idSeance, Groupes groupe, Horaires horaire,
            Enseignants enseignant, String rattrapageSeance,
            boolean annulationSeance, Date reportSeance,ListPro<Assiduites> listeAssiduite,
            int numExamen,ArrayList<Supports> listeSupports, 
            String typeExamen, String formeExamen, int baremExamen,
            String descrExamen ) {
     
     super(idSeance, groupe, horaire,
             enseignant,  rattrapageSeance,
             annulationSeance,  reportSeance,listeAssiduite);
        
        this.numExamen = numExamen;
        this.listeSupports = listeSupports;
        this.formeExamen = formeExamen;
        this.typeExamen = typeExamen;
        this.baremExamen = baremExamen;
        this.descrExamen = descrExamen;

    }
 public Examens(int idSeance, Groupes groupe, Horaires horaire,
            Enseignants enseignant, String rattrapageSeance,
            boolean annulationSeance, Date reportSeance,ListPro<Assiduites> listeAssiduite,
            int numExamen,ArrayList<Supports> listeSupports, 
            String typeExamen, String formeExamen, int baremExamen,
            String descrExamen,ListPro<Examens>listeExamens ) {
     
     super(idSeance, groupe, horaire,
             enseignant,  rattrapageSeance,
             annulationSeance,  reportSeance,listeAssiduite);
        
        this.numExamen = numExamen;
        this.listeSupports = listeSupports;
        this.formeExamen = formeExamen;
        this.typeExamen = typeExamen;
        this.baremExamen = baremExamen;
        this.descrExamen = descrExamen;
      
    }
 
  
    

 


    public String getTypeExamen() {
        return typeExamen;
    }

    public void setTypeExamen(String typeExamen) {
        this.typeExamen = typeExamen;
    }

    public String getFormeExamen() {
        return formeExamen;
    }

    public void setFormeExamen(String formeExamen) {
        this.formeExamen = formeExamen;
    }





  
    
}
