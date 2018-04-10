/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetablissement.controleur;

import gestionetablissement.GestionEtablissement;
import gestionetablissement.modele.Etudiants;
import gestionetablissement.modele.Individus;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author lyess
 */
public class EtudiantViewController implements Initializable {
    private GestionEtablissement application;
    private Individus loggedUser;
    @FXML   private  MenuButton menuButon; 
    @FXML private ImageView imageView;
    private Etudiants individusSelectionner;
@FXML TextArea num;
@FXML TextArea nom;
@FXML TextArea prenom;
@FXML TextArea sex;
@FXML TextArea dateN;
@FXML TextArea lieuN;
@FXML TextArea niveau;
@FXML TextArea domaine;
@FXML TextArea tel;
@FXML TextArea mail;
@FXML TextArea groupe;
@FXML TextArea adresse;
@FXML TextArea cAdresse;
@FXML ImageView photoIndiv;
@FXML AnchorPane afficheEtudiant;
@FXML TextField rechercheIdTextField;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
        public void setApp(GestionEtablissement application) throws FileNotFoundException{
        this.application = application;
        loggedUser = application.getLoggedUser();
        System.out.println(loggedUser.getNomIndividu()+"test5");
        menuButon.getItems().add(0,new MenuItem(loggedUser.getNomIndividu()+" "+loggedUser.getPrenomIndividu()));
        affichePhotoLoggedUser();
        afficheIndividusSelectionner ();
        
        
      
    }
    void afficheIndividusSelectionner () throws FileNotFoundException{
    individusSelectionner=(Etudiants)loggedUser;
    
    
     
     num.setText((individusSelectionner.getIdIndividu())+"");
     
     nom.setText(individusSelectionner.getNomIndividu());
     prenom.setText(individusSelectionner.getPrenomIndividu());
     sex.setText(individusSelectionner.getGenreIndividu());
     dateN.setText(individusSelectionner.getDatNaisIndividu().toString());
     
     niveau.setText(individusSelectionner.getNivEtudIndividu());
     domaine.setText(individusSelectionner.getDomEtudIndividu());
     tel.setText(individusSelectionner.getTel());
     if(individusSelectionner.getListeGroupes()!=null)groupe.setText(individusSelectionner.getListeGroupes().toString());
     mail.setText(individusSelectionner.getMail());
     affichePhotoSelectedIndiv();
     adresse.setText(individusSelectionner.getDomCompetIndividu().toString());
   // if(individusSelectionner.getDomCompetIndividu().toString()!="") cAdresse.setText(individusSelectionner.getDomCompetIndividu().toString());
    
}
    @FXML public void processLogout(ActionEvent event) {
        if (application == null){
            // We are running in isolated FXML, possibly in Scene Builder.
            // NO-OP.
            return;
        }
        
        application.userLogout();
    }
    private void affichePhotoSelectedIndiv() throws FileNotFoundException
    {Image image=null;
        Exception exception = null;
        try{
             image = new Image(getClass().getResource(individusSelectionner.getPhotoIndividu()).toString()) ;
        }catch(Exception e){
            
        }
        if(individusSelectionner.getPhotoIndividu()==null ||individusSelectionner.getPhotoIndividu()==""){
            image = new Image(getClass().getResource("..\\assets\\image\\user.png").toString());
        }
             photoIndiv.setImage(image);
  
         photoIndiv.setFitWidth(100);
         photoIndiv.setFitHeight(100);
        Rectangle rectangle = new Rectangle();
      
         rectangle.setWidth(100.0f); 
      rectangle.setHeight(100.0f); 
       
      //Setting the height and width of the arc 
      rectangle.setArcWidth(30.0); 
      rectangle.setArcHeight(30.0);
      
     
         photoIndiv.setClip(rectangle);
         photoIndiv.setPreserveRatio(true);
         photoIndiv.setSmooth(true);
         photoIndiv.setCache(true);
    }
    
      private void affichePhotoLoggedUser() throws FileNotFoundException
    {Image image=null;
        Exception exception = null;
        try{
             image = new Image(getClass().getResource(loggedUser.getPhotoIndividu()).toString()) ;
        }catch(Exception e){
            
        }
        if(loggedUser.getPhotoIndividu()==null ||loggedUser.getPhotoIndividu()==""){
            image = new Image(getClass().getResource("..\\assets\\image\\admin.png").toString());
        }
             imageView.setImage(image);
  
         imageView.setFitWidth(45);
         imageView.setFitHeight(45);
         Circle circle = new Circle();
        
        circle.setRadius(20.0f);
        circle.setCenterX(40.0f/2);
        circle.setCenterY(40.0f/2);
       imageView.setClip(circle);
         imageView.setPreserveRatio(true);
         imageView.setSmooth(true);
         imageView.setCache(true);
    }
}
