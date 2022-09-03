import java.io.*;
class swap2
  {
    public static void main(String args[])
      {  try
	         {
	           int a,b;
		       DataInputStream d= new DataInputStream(System.in);
	           System.out.println("Enter the first number");
		       a=Integer.parseInt(d.readLine());
			   System.out.println("Enter the second number");
			   b=Integer.parseInt(d.readLine());
			   System.out.println("\nBefore Swap");
			   System.out.println("A= "+a+" B= "+b);
			   a=a+b;
			   b=a-b;
			   a=a-b;
			   System.out.println("\nAfter Swap");
			   System.out.println("A= "+a+" B= "+b);
						     
		        
	        }catch (Exception e){}
	   }

}