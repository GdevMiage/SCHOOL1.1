/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetablissement.controleur;

import gestionetablissement.GestionEtablissement;
import gestionetablissement.modele.Individus;
import gestionetablissement.modele.User;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author lyess
 * @author Ouadie
 */
public class AdminViewController implements Initializable {
    
    
    
    //Notre variable d'application
    private GestionEtablissement application;
    private Label success;
    @FXML
   private  MenuButton menuButon; 
    @FXML 
    private ImageView imageView;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    public void setApp(GestionEtablissement application){
        
        Individus loggedUser = application.getLoggedUser();
        menuButon.getItems().add(0,new MenuItem(loggedUser.getNomIndividu()+" "+loggedUser.getPrenomIndividu()));
    
        Image image = new Image(getClass().getResource(loggedUser.getPhotoIndividu()).toString());
         imageView.setImage(image);
  
         imageView.setFitWidth(100);
         imageView.setPreserveRatio(true);
         imageView.setSmooth(true);
         imageView.setCache(true);
       


        
     this.application = application;
      
    }


    public void processLogout(ActionEvent event) {
        if (application == null){
            // We are running in isolated FXML, possibly in Scene Builder.
            // NO-OP.
            return;
        }
        
        application.userLogout();
    }
    
    public void saveAdminView(ActionEvent event) {
        if (application == null){
            // We are running in isolated FXML, possibly in Scene Builder.
            // NO-OP.
            animateMessage();
            return;
        }
        Individus loggedUser = application.getLoggedUser();
      
        animateMessage();
    }
    
        private void animateMessage() {
        FadeTransition ft = new FadeTransition(Duration.millis(1000), success);
        ft.setFromValue(0.0);
        ft.setToValue(1);
        ft.play();
    }
}
