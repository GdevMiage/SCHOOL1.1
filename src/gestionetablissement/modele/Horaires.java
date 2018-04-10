
package gestionetablissement.modele;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;


public class Horaires {
    
  private int idHoraire;
  
  private Date jour;
  private Date debut;
  private Date fin;
  private String libelHoraire;
  
  
  
  public static final ListPro<Horaires> listeHoraire = new ListPro<Horaires>();
   
    {
        this.listeHoraire.add(this);
    }
  
        //pour definir a chaque fois les ID
    public static int definirId(){
        Iterator it = listeHoraire.iterator();
        
        //année actuelle 
       
        int annee =Calendar.getInstance().get(Calendar.YEAR);
        
        Horaires HorairesPlusGrandId=null;
        boolean vide =true;
        if(it.hasNext())  HorairesPlusGrandId=  (Horaires) it.next();
        while(it.hasNext()){
            Horaires Horaires = (Horaires) it.next();
            vide=false;
            if(Horaires.getIdHoraire()>HorairesPlusGrandId.getIdHoraire()) HorairesPlusGrandId =Horaires;
        }
            
            if(vide) {System.out.println((annee *10)+1);return ((annee *100000)+1);}
            else {System.out.println(HorairesPlusGrandId.getIdHoraire()+1);return HorairesPlusGrandId.getIdHoraire()+1;}
        
        
    }
    
    public static ArrayList<Horaires> of(String id ){
        Iterator it = listeHoraire.iterator();
        ArrayList<Horaires> listRecherche=null;
        while(it.hasNext()){
            Horaires Horaires = (Horaires) it.next();
            String idd = Horaires.getIdHoraire()+"";
            if(idd.indexOf(id)!=0){
                
                listRecherche.add(Horaires);
            }
        }
        return listRecherche;
    }
  
    public Horaires(){
        
    }
    
   public Horaires(int idHoraire, Date jour, Date debut, Date fin, String libelHoraire) {
        this.idHoraire = idHoraire;
       
        this.jour = jour;
        this.debut = debut;
        this.fin = fin;
        this.libelHoraire = libelHoraire;
  
    }
    public Horaires(int idHoraire, Date jour, Date debut, Date fin, String libelHoraire,ListPro<Horaires> listeHoraire) {
        this.idHoraire = idHoraire;
       
        this.jour = jour;
        this.debut = debut;
        this.fin = fin;
        this.libelHoraire = libelHoraire;
        ;
    }

    public int getIdHoraire() {
        return idHoraire;
    }

    public void setIdHoraire(int idHoraire) {
        this.idHoraire = idHoraire;
    }



    public Date getJour() {
        return jour;
    }

    public void setJour(Date jour) {
        this.jour = jour;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }



   

    public String getLibelHoraire() {
        return libelHoraire;
    }

    public void setLibelHoraire(String libelHoraire) {
        this.libelHoraire = libelHoraire;
    }
  
  
  
  
    
}
