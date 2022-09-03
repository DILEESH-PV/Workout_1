import java.io.*;
public class rev
  {
    public static void main(String args[])
      {  try
	         {
	           int n,rev=0,l;
		       DataInputStream d= new DataInputStream(System.in);
	           System.out.println("Enter the number");
		       n=Integer.parseInt(d.readLine());
			   int a=n;
			           
		            while(n!=0)
		              {
		                 l=n%10;
		                 rev=rev*10+l;
		                 n=n/10;
		              } 
			System.out.println("\nThe reverse of "+ a+" is :" +rev); 
	        }catch (Exception e){}
	   }

}