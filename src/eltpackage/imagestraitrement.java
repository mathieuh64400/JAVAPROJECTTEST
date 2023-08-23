package eltpackage;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class imagestraitrement {
//java.awt.Image premiere maniére de traiter les images
	//java.awt.image.BufferedImage 2eme maniere de traité.
	
	
	public static void main(String[] args) throws IOException {
		
		int width= 800;
		int heigth= 750;
		
		BufferedImage image = null;
		image= readFromFile(width,heigth,image);
		writeToFile(image);
	}
	private static BufferedImage readFromFile(int width, int heigth, BufferedImage image) {
		try {
			 File sampleFile = new File("C:\\sample.jpg");
			 image= new BufferedImage(width,heigth, BufferedImage.TYPE_INT_ARGB);
			 image= ImageIO.read(sampleFile);
			 
			 System.out.println("Reading :"+ image);
			 
		}
		catch( Exception e ) {e.printStackTrace();}
		return image;
		
		
	}
	
	
	private static void writeToFile(BufferedImage image) {
		
		try {
			File output= new File("C:\\Users\\mhedot\\eclipse-workspace\\test_demo\\outtest.jpg");
			ImageIO.write(image, "jpg", output);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
