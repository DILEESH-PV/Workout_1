import java.io.*;
class la
  {
    public static void main(String args[])
      {  try
	         {
	           int a,b,c,large;
		       DataInputStream d= new DataInputStream(System.in);
	           System.out.println("Enter the first number");
		       a=Integer.parseInt(d.readLine());
			   System.out.println("Enter the second number");
			   b=Integer.parseInt(d.readLine());
			   System.out.println("Enter the third number");
			   c=Integer.parseInt(d.readLine());
			   large=(a>b)?(a>c?a:c):(b>c?b:c);
					  System.out.println("Largest number is "+large);
						     
		        
	        }catch (Exception e){}
	   }

}