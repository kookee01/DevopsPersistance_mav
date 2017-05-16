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
import java.util.ArrayList;



/**
 *
 * @author Administrateur
 */
public class Test {
    public static void main(String[] args)  {
        Connection conn ;
        Statement st;
        ResultSet rs;
        ArrayList<Employe> employes;
        try{

        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/devops","devops","devops");
        st = conn.createStatement();
        rs =st.executeQuery("select * from EMPLOYE");
        rs.next();
        employes=new ArrayList<Employe>();
        
        while(rs.next())
        {
        Employe empl =new Employe();
        empl.setNom(rs.getString("Nom"));
        empl.setPrenom(rs.getString("PRENOM"));
        empl.setAdresse(rs.getString("ADRESSE"));

        employes.add(empl);
        }
        int j;
        for(j=1;j<employes.size();j++)
        {
            System.out.println("Employé # " + j);
            System.out.println(employes.get(j));
            System.out.println("---------------------------------------");
        }
        try{
         rs.close();
        st.close();
        conn.close();
        }
        catch(SQLException exp){
            exp.printStackTrace();
        
        }
        }
        catch(SQLException ex)
        {
        ex.printStackTrace();
        }
        
    }
      
       
    }

