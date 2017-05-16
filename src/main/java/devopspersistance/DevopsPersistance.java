/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devopspersistance;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author Administrateur
 */
public class DevopsPersistance {
    public DevopsPersistance() {
        Connection conn;
        Statement stnt;
        ResultSet rs;
            try{
    String nom;
    String prenom;

    conn = DriverManager.getConnection("jdbc:derby://localhost:1527/devops","devops","devops");
    stnt = conn.createStatement();
    rs = stnt.executeQuery("Select * from EMPLOYES where id<2 and id>9");
            }
    catch(SQLException sqle)
    {
    sqle.printStackTrace();
    }
    
    }
}
