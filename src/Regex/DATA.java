package Regex;
import java.util.regex.*;
public class DATA {
	//pattern class: Used for defining patterns
	//Matcher classes: Used for performing match operations on text using patterns;
	//PatternSyntaxExceptionClass: Used for indicating syntax error in a regular expression pattern;
	//	MatchResult Interface: Used for representing the result of a match operation
	
	
	public static void main(String[] args) {
		System.out.println(Pattern.matches("dttdv*d", "abcd")); // false ne contient pas , true contient
		// on peut aussi utilisé la compilation:
		// create a REGEX String
        String REGEX = ".*www.*";
        String actualString
        = "www.geeksforgeeks.org";
        
        Pattern pattern = Pattern.compile(REGEX);
        
        //creation d'un matcher
        Matcher matcher = pattern.matcher(actualString);
        System.out.println(matcher);
        System.out.println("find:"+matcher.find()+" "+ matcher.start()+" "+ matcher.end());
        //creation d'une verification
        boolean matches = matcher.matches();
    	System.out.println("2:"+matches);
    	
    	//
    	
	}

}
