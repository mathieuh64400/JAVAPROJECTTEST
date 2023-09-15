package dataInput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GFC {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("index.txt");
		
		//creation du BufferedReader
		BufferedReader br = new BufferedReader(fr);
		
		char c[]= new char[10];
		if(br.markSupported()) {
			System.out.print("result "+br.markSupported());
			System.out.println( br.read(c));
			
			for(int i=0;i<10; i++) {
				System.out.println(c[i]);
			}
			
			
			
		}
		
		
	}

}
