/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetablissement.controleur;

import gestionetablissement.GestionEtablissement;
import gestionetablissement.modele.Individus;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import javafx.scene.shape.*;

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
private Individus individusSelectionner;
@FXML Label num;
@FXML Label nom;
@FXML Label prenom;
@FXML Label sex;
@FXML Label dateN;
@FXML Label lieuN;
@FXML Label niveau;
@FXML Label domaine;
@FXML Label tel;
@FXML Label mail;
@FXML Label adresse;
@FXML Label cAdresse;
@FXML ImageView photoIndiv;
@FXML AnchorPane afficheEtudiant;
@FXML TextField rechercheIdTextField;
@FXML private Button ajoutButton;
 private ObservableList<Individus> data;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    void setApp(GestionEtablissement application) throws FileNotFoundException {
       this.application = application;   
       
    remplirTableView();
    
    
    }
    
    
@FXML private void revenirAdminView() {
        try {
            application.gotoAdminView();
        } catch (Exception ex) {
            Logger.getLogger(GestionEtablissement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
private void remplirTableView() throws FileNotFoundException{
          numCol.setCellValueFactory(
                new PropertyValueFactory<Individus, String>("idIndividu"));
          nomCol.setCellValueFactory(
                new PropertyValueFactory<Individus, String>("nomIndividu"));
          prenomCol.setCellValueFactory(
                new PropertyValueFactory<Individus, String>("prenomIndividu"));
           
            data = FXCollections.observableArrayList(Individus.listeIndividusEtablissement);
          
          etudiantTableView.setItems(data);
         afficheIndividusSelectionner ();
      }


@FXML void afficheIndividusSelectionner () throws FileNotFoundException{
    if(individusSelectionner==null)individusSelectionner =etudiantTableView.getItems().get(1);
    else  individusSelectionner =etudiantTableView.getSelectionModel().getSelectedItem();
    
    
     
     num.setText((individusSelectionner.getIdIndividu())+"");
     
     nom.setText(individusSelectionner.getNomIndividu());
     prenom.setText(individusSelectionner.getPrenomIndividu());
     sex.setText(individusSelectionner.getGenreIndividu());
     dateN.setText(individusSelectionner.getDatNaisIndividu().toString());
     lieuN.setText(individusSelectionner.getLieuNaisIndividu());
     niveau.setText(individusSelectionner.getNivEtudIndividu());
     domaine.setText(individusSelectionner.getDomEtudIndividu());
     tel.setText(individusSelectionner.getTel());
     mail.setText(individusSelectionner.getMail());
     affichePhotoSelectedIndiv();
     adresse.setText(individusSelectionner.getDomCompetIndividu().toString());
     cAdresse.setText(individusSelectionner.getDomCompetIndividu().toString());
    
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
     
     @FXML void rechercheIndividusID () throws FileNotFoundException{
        
           data = FXCollections.observableArrayList(Individus.of(rechercheIdTextField.getText()));
          
          etudiantTableView.setItems(data);
         afficheIndividusSelectionner ();
     }
     
       @FXML private void gotoAjoutEtudiant() {
        try {
            AjoutEtudiantController ajoutEtudiant = (AjoutEtudiantController) replaceSceneContent("vue/AjoutEtudiant.fxml");
            ajoutEtudiant.setApp(application);
        } catch (Exception ex) {
            Logger.getLogger(GestionEtablissement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
      @FXML private void gotoAfficheEtudiant() {
        try {
            AjoutEtudiantController ajoutEtudiant = (AjoutEtudiantController) replaceSceneContent("vue/AfficheEtudiant.fxml");
            ajoutEtudiant.setApp(application);
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
            System.out.println("hhhhhhhhhhhhhhhhhhhh"+fxml+"**"+GestionEtablissement.class.getResource(fxml));
             in.close();
            
        } 
        
        
       if(!afficheEtudiant.getChildren().isEmpty()){
           
            afficheEtudiant.getChildren().clear();
        }
         afficheEtudiant.getChildren().removeAll();
        afficheEtudiant.getChildren().add(page);
       
       
       
       
        
        application.init();
        return (Initializable) loader.getController();
    }
}
