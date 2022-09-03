import java.io.*;
class swap1
  {
    public static void main(String args[])
      {  try
	         {
	           int a,b,t;
		       DataInputStream d= new DataInputStream(System.in);
	           System.out.println("Enter the first number");
		       a=Integer.parseInt(d.readLine());
			   System.out.println("Enter the second number");
			   b=Integer.parseInt(d.readLine());
			   System.out.println("Before Swap");
			   System.out.println("A= "+a+" B= "+b);
			   t=a;a=b;b=t;
			   System.out.println("After Swap");
			    System.out.println("A= "+a+" B= "+b);
						     
		        
	        }catch (Exception e){}
	   }

}