import java.io.*;
class large
  {
    public static void main(String args[])
      {  try
	         {
	           int a,b,c;
		       DataInputStream d= new DataInputStream(System.in);
	           System.out.println("Enter the first number");
		       a=Integer.parseInt(d.readLine());
			   System.out.println("Enter the second number");
			   b=Integer.parseInt(d.readLine());
			   System.out.println("Enter the third number");
			   c=Integer.parseInt(d.readLine());
			   if (a>b&&a>c)
			       {
				     System.out.println("Largest number is "+a);
				   }
			   else if(b>a&&b>c)
			       {
				     System.out.println("Largest number is "+b);
				    }
				else
				    {
					  System.out.println("Largest number is "+c);
					 }		     
		        
	        }catch (Exception e){}
	   }

}