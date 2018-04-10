/*
 * Copyright (c) 2008, 2012 Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle Corporation nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package gestionetablissement;

import gestionetablissement.controleur.AdminViewController;
import gestionetablissement.controleur.LoginController;

import gestionetablissement.modele.Adresses;
import gestionetablissement.modele.Individus;
import gestionetablissement.modele.ListPro;
import gestionetablissement.modele.Salles;
import gestionetablissement.modele.Sessions;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import gestionetablissement.modele.User;
import gestionetablissement.securite.Affectations;
import gestionetablissement.securite.dbConnect;

import gestionetablissement.securite.dbConnect1;
import java.sql.ResultSet;
import java.util.Date;

/**
 * GestionEtablissement Application. This class handles navigation and user session.
 */
public class GestionEtablissement extends Application {

    private Stage stage;
    private Individus loggedUser;
    private Sessions sessionSchoolActuelle ;
    private final double MINIMUM_WINDOW_WIDTH = 390.0;
    private final double MINIMUM_WINDOW_HEIGHT = 500.0;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Application.launch(GestionEtablissement.class, (java.lang.String[])null);
      
    }
 

    @Override
    public void start(Stage primaryStage) {
        try {
            stage = primaryStage;
            stage.setTitle("School 1.0 ");
            stage.setMinWidth(MINIMUM_WINDOW_WIDTH);
            stage.setMinHeight(MINIMUM_WINDOW_HEIGHT);
            
            ListPro<Affectations> listeAffectation= new ListPro<>();                                                                       

            Individus indi = new Individus("Ben","Aissa","H",new Date(),"Bizerte","L3MIAGE","Informatique","Etudiant",new Adresses(),"Arabe","FR","..\\assets\\image\\ouadie.jpg","","");
           System.out.println(indi.getIdIndividu());

           //Individus indiv = new Individus("Ben","Aissa","H",new Date(),"Bizerte","L3MIAGE","Informatique","Etudiant",new Adresses(),"Arabe","FR","..\\assets\\image\\lyes.jpg","","");

            Affectations aff = new Affectations(3,"CDI","","",new Date(),new Date(),"Prof","c://",indi,listeAffectation);
             indi.setAffectation(aff);
             
            // Affectations affi = new Affectations(4,"CDI","dev","dev",new Date(),new Date(),"Prof","c://",indiv,listeAffectation);

       
            gotoLogin();
            
            primaryStage.setResizable(false);
            primaryStage.show();
            primaryStage.setOnCloseRequest(event -> {userLogout();primaryStage.close();System.out.println("Closed");});
        } catch (Exception ex) {
            Logger.getLogger(GestionEtablissement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
    public Individus getLoggedUser() {
        return loggedUser;
    }
        
    public boolean userLogging(String userId, String password){
        if (Affectations.validate(userId, password)) {
           loggedUser =Affectations.of(userId);
            gotoAdminView();
            return true;
        } else {
            return false;
        }
    }
    
    public void userLogout(){
        loggedUser = null;
        gotoLogin();
    }
    /*
    private void gotoProfile() {
        try {
            ProfileController profile = (ProfileController) replaceSceneContent("vue/profile.fxml");
            profile.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(GestionEtablissement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
    
  public void gotoAdminView() {
        try {
            AdminViewController adminView;
            adminView = (AdminViewController) replaceSceneContent("vue/adminview.fxml");
          
            adminView.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(GestionEtablissement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void gotoLogin() {
        try {
            LoginController login = (LoginController) replaceSceneContent("vue/login.fxml");
            login.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(GestionEtablissement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = GestionEtablissement.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(GestionEtablissement.class.getResource(fxml));
       
        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            System.out.println("test2"+fxml+"**"+GestionEtablissement.class.getResource(fxml));
             in.close();
            
        } 
        Scene scene = new Scene(page, 1024, 743);
        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }
}
