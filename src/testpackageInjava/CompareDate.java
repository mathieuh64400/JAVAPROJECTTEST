package testpackageInjava;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareDate {
	
	public static void main(String[] args) throws ParseException {

    //definition du format
        
		 SimpleDateFormat ft = 
			      new SimpleDateFormat ("yyyy-MM-dd");
		 
		 //definition d'une date sous un certain format 
		 Date date1 = ft.parse("2020-10-30");

	        Date dNow= new Date();
	        
	        Date date2 = ft.parse(ft.format(dNow));
		  System.out.println("Current Date: " + ft.format(dNow));

		  
		 //comparaison des deux dates avec format spécifiques res: 0, 1 , -1

        int result = date1.compareTo(date2);
        System.out.println("result: " + result);

        if (result == 0) {
            System.out.println("Date1 is equal to Date2");
        } else if (result > 0) {
            System.out.println("Date1 is after Date2");
        } else if (result < 0) {
            System.out.println("Date1 is before Date2");
        } else {
            System.out.println("How to get here?");
        }
        
        try { // thread necessite de coupé donc on oit utiliser un try...catch
            long start = System.currentTimeMillis( );
            System.out.println(new Date( ) + "\n");
            
            Thread.sleep(5*60*10);
            System.out.println(new Date( ) + "\n");
            
            long end = System.currentTimeMillis( );
            long diff = end - start;
            System.out.println("Difference is : " + diff);
         } catch (Exception e) {
            System.out.println("Got an exception!");
         }
        
        
        
        
        
        
        

    }

}
