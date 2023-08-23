package testpackageInjava;

import java.util.*;
import java.text.*;

public class InfoDate {
	public static void main(String[] args) {
		Date dNow= new Date();
		 SimpleDateFormat ft = 
			      new SimpleDateFormat ("yyyy-MM-dd");
		  System.out.println("Current Date: " + ft.format(dNow));
		
		 
		System.out.println(dNow.toString());
		System.out.println(dNow.hashCode());
	}
	}


