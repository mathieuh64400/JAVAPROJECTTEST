package EXEMPLENIO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.*;
import java.nio.*;

public class DEMONIO {
//	main traitement de l'ajout de donnée dans le systeme
	public static void main(String[] args) throws IOException {
		
//		FileInputStream fin = new FileInputStream("C:\\Users\\mhedot\\eclipse-workspace\\test_demo\\src\\file.txt");
//		FileChannel r =fin.getChannel();
//		ByteBuffer  rBuffer =ByteBuffer.allocate(2000);
//		int result = r.read(rBuffer); // chiffre correspond au nombre octet contenu dans le fichier ici 13 car  longueur text = 13;
//		
//		System.out.println(result);
		
		
		FileOutputStream fout  = new FileOutputStream("C:\\Users\\mhedot\\eclipse-workspace\\test_demo\\src\\name3.txt");
		//ecrire une data sous forme octet
		FileChannel r =fout.getChannel(); //creation d'un channel;
		ByteBuffer wBuffer = ByteBuffer.allocate(1024); // allocation du nombre d'octet au tampon;
		String message = " message de test";
		wBuffer.put(message.toUpperCase().getBytes()); // met a jour  les données dans le tampon;
		wBuffer.flip(); //fixe a zero la position de depart du message dans le fichier;
		r.write(wBuffer);
		
		System.out.println("succes");
	}

}
