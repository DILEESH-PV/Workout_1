import java.io.*;
import java.util.*;
class asciival
  {
    public static void main(String args[])
      {  try
	         { 
			    char a;
			    System.out.println("Enter the character");
			    Scanner sc = new Scanner(System.in);
	            a=sc.next().charAt(0);
				int b=a;		     
		        System.out.println("Ascii value of " +a+" is "+b);
	        }catch (Exception e){}
	   }

}