package webcamDATA;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import com.github.sarxos.webcam.Webcam;

public class webcam {
public static void main(String[] args ) throws IOException {
	
	Webcam webcam = Webcam.getDefault();
	for( Dimension supportedSize: webcam.getViewSizes()) {
		
		System.out.println(supportedSize.toString());
	}
//	webcam.open();
//	ImageIO.write(webcam.getImage(), "JPG", new File("firstCapture.jpg"));
//	webcam.close();
	
}
}
