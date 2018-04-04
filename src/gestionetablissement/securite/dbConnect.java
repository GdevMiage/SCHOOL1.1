/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetablissement.securite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Ouadie
 */
public class dbConnect {
    Connection connect ;
    Statement statement;
    /**
     * La classe dbConnect sert a se connecter a la base de donner avec la variable connect et le drive sql 
     * et elle crée un statement par defaut et l'affecte a la variable statement de la classe
     * (la variable statement c'est l'environnement sql pour executer nos requette a chaque fois 
     * a l'aide de statement.executeQuery(string)
     */
    public dbConnect()
	{
	    try {
                  Class.forName("com.mysql.jdbc.Driver");
	          Connection  conn = DriverManager.getConnection("jdbc:mysql://localhost/magasinfo1","root", "");
                  this.statement =  conn.createStatement();  
                } catch (Exception e) {
	      e.printStackTrace();	               
	      
	    }
		  
	}
    }


	
	
	

