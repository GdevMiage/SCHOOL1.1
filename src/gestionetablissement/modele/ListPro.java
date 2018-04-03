/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetablissement.modele;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Ouadie
 */
public class ListPro<T> extends HashSet {

    /**
     * les differentes liste qu'on va travailler dessus pour 
     * extraire tout nos donners si on veut et pour tracker
     * les differents actions afin de les enregistrer dans notre base 
     */
private HashSet<T> metier  ;
private HashSet<T> asupprimer ;
private HashSet<T> amodifier ;
private HashSet<T> ainserer  ;


//le constructeur par defaut de la liste

public ListPro(){
        metier = new HashSet<T>();
	asupprimer = new HashSet<T>();
	amodifier = new HashSet<T>();
	ainserer  = new HashSet<T>();
}



    public HashSet<T> getMetier() {
        return metier;
    }

    public void setMetier(HashSet<T> metier) {
        this.metier = metier;
    }

    public HashSet<T> getAsupprimer() {
        return asupprimer;
    }

    public void setAsupprimer(HashSet<T> asupprimer) {
        this.asupprimer = asupprimer;
    }

    public HashSet<T> getAmodifier() {
        return amodifier;
    }

    public void setAmodifier(HashSet<T> amodifier) {
        this.amodifier = amodifier;
    }

    public HashSet<T> getAinserer() {
        return ainserer;
    }

    public void setAinserer(HashSet<T> ainserer) {
        this.ainserer = ainserer;
    }



 public void add(){
    /*
	T entite = new Client();
	client.ajoutClient();
	this.getMetier().add(client);
	this.getAinserer().add(client);
	return client;
*/
 }
    
}
