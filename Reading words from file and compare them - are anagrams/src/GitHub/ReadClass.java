package GitHub;

import java.io.File;
import java.util.*;

public class ReadClass {
	
	 public Scanner x;
	 String s1;
	 String s2;
	 
	 public void openFile(){
		 try{
		 x = new Scanner(new File("anagram.txt"));
		 }
		 catch(Exception e){
			 System.out.println("Error");
		 }
	 }
	 
	 public void readFile(){				
		     while(x.hasNext()){
			  s1 = x.next();
			  s2 = x.next();								  
		 }
		 	 		 
       boolean status = true;
		 
		 if(s1.length() != s2.length()){
			 status = false;
		 }
		 else{
			 char[] s1Array = s1.toLowerCase().toCharArray();
			 char[] s2Array = s2.toLowerCase().toCharArray();
			
			 Arrays.sort(s1Array);
			 Arrays.sort(s2Array);
			 
			 status = Arrays.equals(s1Array, s2Array);
		 } 
		 if(status)
	        {
	            System.out.println(s1+" and "+s2+" are anagrams");
	        }
	        else
	        {
	            System.out.println(s1+" and "+s2+" are not anagrams");
	        }
		 }
	 
	 
	 public void closeFile(){
		 x.close();
	 }
	 
 }
