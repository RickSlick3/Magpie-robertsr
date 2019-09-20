/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{
	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
				
		//  Try other methods here:
                
                // Demonstrate toUpperCase method
                String upperCase = sample.toUpperCase();
                System.out.println ("sample.toUpperCase() = " + upperCase);
		System.out.println ("After toUpperCase(), sample = " + sample);
                
                // Demonstrate length METHOD
                int l = sample.length();
                System.out.println ("sample.length() = " + l);
                
               // Why is the method emphasised
               String[] students = {"charlie", "liam", "colt"};
               int arrayLength = students.length;
               System.out.println("students.length = " + arrayLength);
               int studentOneLength = students[1].length();
               
               // substrings
               String sub1 = sample.substring(5);
               
	}
}

