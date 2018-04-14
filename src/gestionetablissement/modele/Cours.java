 
package gestionetablissement.modele;

import static gestionetablissement.modele.Contrats.listeContrats;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;


public class Cours extends Seances {
    
    private int idCours;
    private ArrayList<Supports> listeSupports;
    private String typeDocCours;  
    private String libelCours;
    private String niveauCours; 
    private String partieCours;  
    private int volHorCours; 
    private String descriptifCours; 
    
    
    public static final ListPro<Cours> listeCours = new ListPro<Cours>();
   
    {
        this.listeCours.add(this);
        
    }
    
    //pour definir a chaque fois les ID
    public static int definirId(){
        Iterator it = listeCours.iterator();
        
        //année actuelle 
       
        int annee =Calendar.getInstance().get(Calendar.YEAR);
        
        Cours CoursPlusGrandId=null;
        boolean vide =true;
        if(it.hasNext())  CoursPlusGrandId=  (Cours) it.next();
        while(it.hasNext()){
            Cours Cours = (Cours) it.next();
            vide=false;
            if(Cours.getIdCours()>CoursPlusGrandId.getIdCours()) CoursPlusGrandId =Cours;
        }
            
            if(vide) {System.out.println((annee *10)+1);return ((annee *100000)+1);}
            else {System.out.println(CoursPlusGrandId.getIdCours()+1);return CoursPlusGrandId.getIdCours()+1;}
        
        
    }
    
    public static ArrayList<Cours> of(String id ){
        Iterator it = listeCours.iterator();
        ArrayList<Cours> listRecherche=null;
        while(it.hasNext()){
            Cours Cours = (Cours) it.next();
            String idd = Cours.getIdCours()+"";
            if(idd.indexOf(id)!=0){
                
                listRecherche.add(Cours);
            }
        }
        return listRecherche;
    }
    
 public Cours(int idSeance, Groupes groupe, Horaires horaire,
            Enseignants enseignant, String rattrapageSeance,
            boolean annulationSeance, Date reportSeance,ListPro<Assiduites> listeAssiduite,
            int idCours,ArrayList<Supports> listeSupports, 
            String typeDocCours, String libelCours, String niveauCours,
            String partieCours, int volHorCours, String descriptifCours) {
     
     super( idSeance,  groupe,  horaire,
             enseignant,  rattrapageSeance,
             annulationSeance,  reportSeance, listeAssiduite);
        
        this.idCours = idCours;
        this.listeSupports = listeSupports;
        this.typeDocCours = typeDocCours;
        this.libelCours = libelCours;
        this.niveauCours = niveauCours;
        this.partieCours = partieCours;
        this.volHorCours = volHorCours;
        this.descriptifCours = descriptifCours;
    }
 public Cours(int idSeance, Groupes groupe, Horaires horaire,
            Enseignants enseignant, String rattrapageSeance,
            boolean annulationSeance, Date reportSeance,ListPro<Assiduites> listeAssiduite,
            int idCours,ArrayList<Supports> listeSupports, 
            String typeDocCours, String libelCours, String niveauCours,
            String partieCours, int volHorCours, String descriptifCours,ListPro<Cours> listeCours) {
     
     super( idSeance,  groupe,  horaire,
             enseignant,  rattrapageSeance,
             annulationSeance,  reportSeance,listeAssiduite);
        
        this.idCours = idCours;
        this.listeSupports = listeSupports;
        this.typeDocCours = typeDocCours;
        this.libelCours = libelCours;
        this.niveauCours = niveauCours;
        this.partieCours = partieCours;
        this.volHorCours = volHorCours;
        this.descriptifCours = descriptifCours;
        
    }
/**
 * 
 * @return 
 */
    public int getIdCours() {
        return idCours;
    }
    
    public void setIdCours(int idCours) {
        this.idCours = idCours;
    }


 

    public String getTypeDocCours() {
        return typeDocCours;
    }

    public void setTypeDocCours(String typeDocCours) {
        this.typeDocCours = typeDocCours;
    }


    public String getLibelCours() {
        return libelCours;
    }

    public void setLibelCours(String libelCours) {
        this.libelCours = libelCours;
    }

    public String getNiveauCours() {
        return niveauCours;
    }

    public void setNiveauCours(String niveauCours) {
        this.niveauCours = niveauCours;
    }

    public String getPartieCours() {
        return partieCours;
    }

    public void setPartieCours(String partieCours) {
        this.partieCours = partieCours;
    }

    public int getVolHorCours() {
        return volHorCours;
    }

    public void setVolHorCours(int volHorCours) {
        this.volHorCours = volHorCours;
    }

    public String getDescriptifCours() {
        return descriptifCours;
    }

    public void setDescriptifCours(String descriptifCours) {
        this.descriptifCours = descriptifCours;
    }
    
    
}
