/*Suppose, there is a text file say billions.txt that contains 1 billions of integer numbers. 
  	Write an efficient Java program that calculate
1.	the frequency of each number in the file 
2.	total number of even numbers in the file 
3.	total number of odd numbers in the file 
4.	the smallest number in the file 
5.	the largest number in the file
*/
package pack01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {

	public static void main (String[] args){

	  	String filePath="C:/SoftwareConstruction/billions.txt";
	  	ArrayList<Integer> list=new ArrayList<Integer>();
	  	
	  	Scanner reader;
	try {
		 reader = new Scanner(new File(filePath));
	
      
      int largest=0;
      int smallest=0;
      int evens=0;
      int odds=0;

      while (reader.hasNextInt())  {        
         list.add(reader.nextInt());
         
         if (!reader.hasNextInt()) {
             break;
         }
        
      }
      
      
      largest=Collections.max(list);
      smallest=Collections.min(list);
      list.sort(null);

      for(int l:list){ 
    	  System.out.println(l+":"+Collections.frequency(list,l));
    	  if(l%2==0){
         	 evens++;
          }else if(l%2!=0){
         	 odds++;
          }
      }
      System.out.println("Largest value in File="+largest);
      System.out.println("Smallest value in File="+smallest);
      System.out.println("Even values in File="+evens);
      System.out.println("Odd values in File="+odds);

	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
	  	
	}
}
