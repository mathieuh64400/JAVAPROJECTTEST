package image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class startImage {
// type objet particulier 
	// Java implémente un type particulier d'objet appelé BufferedImage pour les
	// images en Java.
	// Une BufferedImage peut être lue à partir de plusieurs types d'images
	// distincts (c'est-à-dire BMP, HEIC, etc.).
	// Tous ces éléments ne sont pas pris en charge par ImageIO lui-même, mais il
	// existe des plugins pour étendre ImageIO
	// et d'autres bibliothèques telles que Apache Imaging et JDeli.

	// 4 classes utiles
	// java .io.file : lire/ ecrire un fichier => import de classe File. Noms de
	// chemin de fichiers/repertoires

	// java.io.IoException : Pour gerer les erreurs, nous utilisons classe
	// IoException
	// java.awt.image.BufferedImage: Pour contenir l'image, nous créons
	// BuffreredImage object=> stocker Image dans RAM
	// javax.imageio.ImageIo: opération de lecture-ecriture => importerons image
	// classe ImageIo => image statique pour écrire une image

	public static void main(String[] args) throws IOException {
		// definir paramétre de taille toujours
		int width = 963;
		int heigth = 640;
		// Stockage data dans RAM
		BufferedImage image = null;
		// lire une image
		try {
			File in_File = new File("C:\\Users\\mhedot\\git\\JAVAPROJECTTEST\\test_demo\\outtest.jpg");

			// image file path create an object of
			// BufferedImage type and pass as parameter the
			// width, height and image int
			// type. TYPE_INT_ARGB means that we are
			// representing the Alpha , Red, Green and Blue
			// component of the image pixel using 8 bit
			// integer value

			image = new BufferedImage(width, heigth, BufferedImage.TYPE_INT_ARGB);
			// lire cette image
			image = ImageIO.read(in_File);

		} catch (IOException e) {
			e.printStackTrace();
		}
		// WRITE IMAGE
		try {
			// Output file path
			File output_file = new File("C:\\Users\\mhedot\\Desktop\\mathieuCVimage.png");

			// Writing to file taking type and path as
			ImageIO.write(image, "png", output_file);

			System.out.println("Writing complete.");
			
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
	}

}
