/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetablissement.controleur;

import gestionetablissement.GestionEtablissement;
import gestionetablissement.modele.Individus;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author lyess
 */
public class GestionEtudiantController implements Initializable {
private GestionEtablissement application;  
@FXML Button returnButton;
@FXML TableColumn numCol;
@FXML TableColumn nomCol;
@FXML TableColumn prenomCol;
@FXML TableView<Individus> etudiantTableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    void setApp(GestionEtablissement application) {
       this.application = application;   
    remplirTableView();}
    
    
      @FXML private void revenirAdminView() {
        try {
            application.gotoAdminView();
        } catch (Exception ex) {
            Logger.getLogger(GestionEtablissement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
      private void remplirTableView(){
          numCol.setCellValueFactory(
                new PropertyValueFactory<Individus, String>("idIndividu"));
          nomCol.setCellValueFactory(
                new PropertyValueFactory<Individus, String>("nomIndividu"));
          prenomCol.setCellValueFactory(
                new PropertyValueFactory<Individus, String>("prenomIndividu"));
           
      ObservableList<Individus> data =
        FXCollections.observableArrayList(Individus.listeIndividusEtablissement);
                
          etudiantTableView.setItems(data);
      }
    
}
