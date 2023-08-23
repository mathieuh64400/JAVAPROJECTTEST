package eltpackage;
import java.io.*;
public class manipulationFile {
	
	public static void main(String[] args) throws IOException{
		
//		int i;
//		String st= "element de test pour fichier";
//		String data =" Donnée issue de l'ajout de fout.write";
//		FileOutputStream fout = new FileOutputStream("./src/name3.txt",true);
//		
//		byte[] array = data.getBytes();
//		
//		fout.write(array);
//		
//		  char ch[] = st.toCharArray();
//	        for (i = 0; i < st.length(); i++) {
//	           
//	            // we will write the string by writing each
//	            // character one by one to file
//	            fout.write(ch[i]);
//	        }
//	        
	      // creation d'un fichier depuis une classe
	        
	        //etape 1:
	      //attach keyboard to DataInputStream
	        DataInputStream dis=new DataInputStream(System.in);
	        //etape 2 creer un fichier 
	        FileOutputStream fout = new FileOutputStream("./src/file.txt",true);
	        
	      //attach FileOutputStream to BufferedOutputStream ( buffer avec memoire tampon sans passer par disque dur)
	        BufferedOutputStream bout=new BufferedOutputStream(fout,1024);
	        System.out.println("Enter text (@ at the end):");
	        
	        char ch;
	        
	        //read characters from dis into ch. Then write them into bout.
	        //repeat this as long as the read character is not @
	        while((ch=(char)dis.read())!='@')
	        {
	            bout.write(ch);
	        }
	        bout.close();
	        
	        fout.close();
		
		
	}

}
