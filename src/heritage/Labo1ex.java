package heritage;

import interfaceelt.int1;
//import java.io.*;
import java.util.*;

public class Labo1ex implements int1 {
	
int temp=30;
float newtemp;
ArrayList<Float> t= new ArrayList<Float>();
@Override
public void chauffer() {
	
	for(int i=0; i<temp ;i++) {
		t.add((i+this.a));
		
		System.out.println(" temperature a :"+ t.get(i)+ "K");
		
	}
	

}
@Override public void maintenir() {
	newtemp= temp +this.a;
	
	System.out.println(" temperature a :"+ newtemp+ "K");
	
}


@Override public void refroidir() {	
	
	
	System.out.println(" temperature a :"+ t + "K");
//for(int i=0; i<temp ;i++) {
//	t.remove(((temp-1)-i));
//	if(i>0) {
//	System.out.println(" temperature a :"+ t.get(i)+ "K");}
//	
//}
}
	







}
