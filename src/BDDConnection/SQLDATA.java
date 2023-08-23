package BDDConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.io.*;
import java.util.*;
import java.sql.ResultSet;
public class SQLDATA {
	
	public static void main(String[] args) {
		Connection con=null;
		Connection connect=null;
	      Statement stmt=null;
	      String databaseName="bddtestpourjava2";
	      try {
	    	  
	    	  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test3",
	    		         "mhedot","05011988azerty");
    	  stmt = con.createStatement();
	          int status = stmt.executeUpdate("CREATE DATABASE "+databaseName);
	          
	          if(status>0) {
	        	  System.out.println("Database is created successfully !!!");
	        	  connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+databaseName,
		    		         "mhedot","05011988azerty");
	        	  con.close ();
	        	  
	        	  try {
	        		  stmt = connect.createStatement();
	        		  String SqlTable=" CREATE TABLE userpeople"+"( id INT PRIMARY KEY NOT NULL,"+" nom VARCHAR(100),"+" prenom VARCHAR(100),"+" age INTEGER,"+" ville VARCHAR(100),"+" genre Boolean)";
	        		  stmt.executeUpdate(SqlTable);
	        		   
	        		  String SqlTableInsert= " INSERT INTO userpeople (id, nom, prenom, age, ville, genre) VALUES  (1,'Rébecca', 'Armand',24, 'Saint-Didier-des-Bois',1 ),"
	        		  		+ " (2,'Aimée', 'Hebert',36, 'Marigny-le-Châtel',0 ),"
	        		  		+ " (3,'Marielle', 'Ribeiro',27, 'Maillères',1 ),"
	        		  		+ " (4,'Hilaire', 'Savary',58, 'Conie-Molitard', 0) ,"
	        		  		+ " (5,'Hector', 'Baseline',36, 'Conie-Molitard', 0) ";
	        		  
	        		  
	        		  stmt.executeUpdate(SqlTableInsert);
	        		  
	        		  
	        		  String QUERY = "SELECT id, nom, prenom, age, ville FROM userpeople WHERE genre=0 AND age >36";
	        		  
	        		  ResultSet rs = stmt.executeQuery(QUERY);
	        		  
	        		  while(rs.next()){
	        	            //Display values
	        	            System.out.print("ID: " + rs.getInt("id"));
	        	            System.out.print(", Age: " + rs.getInt("age"));
	        	            System.out.print(", nom: " + rs.getString("nom"));
	        	            System.out.println(", prenom: " + rs.getString("prenom"));
	        	            System.out.println(", ville: " + rs.getString("ville"));
	        	         }
	        		  
	        		  
	        		  String sql = "DELETE FROM userpeople " +
	        		            "WHERE age =58";
	        		         stmt.executeUpdate(sql);
	        		         
	        		         String sqlUpdate = " UPDATE userpeople SET age= 20 WHERE id=3";
	        		         stmt.executeUpdate(sqlUpdate);
	        	 
	        	  }
	        	  catch(Exception e) {
	        		  e.printStackTrace();
	        	  }
	        	  
	          }
	      }
	      catch(Exception e) { e.printStackTrace();}
	}
	
	

}
