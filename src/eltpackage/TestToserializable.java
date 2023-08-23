package eltpackage;
import java.io.*;

import heritage.Labo1ex;

public class TestToserializable {
public static void main(String[] args) throws IOException
{
	
	Labo1ex t1 = new Labo1ex();
	
	
	 String filename="./src/name3.txt";
	 FileOutputStream fileOut=null;
	  ObjectOutputStream objOut=null;
	 //serialization 
	 try {
		 fileOut = new FileOutputStream(filename);
		 objOut = new ObjectOutputStream(fileOut);
		 objOut.writeObject(t1);
		 
		 objOut.close();
		 fileOut.close();
		 
	 }
	 catch(IOException e) {
		 e.printStackTrace();
	 }
}

}
