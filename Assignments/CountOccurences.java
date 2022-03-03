//import java.util.*;
package com.assignment;
import java.util.*;
public class CountOccurences {
	static int findOccurrences(String str, char search, int index)
	  {
	      if(index >= str.length())
	      return 0;
	      
	      int count=0;
	      
	      if(str.charAt(index) == search)
	      count++;
	      
	      return count + findOccurrences(str,search,index+1);
	  }
	   
	  public static void main(String args[]) 
	  {
	      
	
	  Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
	  System.out.print("Enter a string: ");
	  String str= sc.nextLine();
	  System.out.println("Enter the character");
	  char search = sc.next().charAt(0);
	//           
	  
	  int result = findOccurrences(str,search,0); 
	  
	  System.out.println("The Character '"+search+"' appears "+result+" times.");
	  }
	}
	 

