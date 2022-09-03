import java.io.*;
public class myam
  {
    public static void main(String args[])
      {  try
	         {
	           int ln,un,sum=0,i,a,n;
		       DataInputStream d= new DataInputStream(System.in);
	           System.out.println("Enter the lower and upper limit");
		       ln=Integer.parseInt(d.readLine());
		       un=Integer.parseInt(d.readLine());
			   System.out.println("Amstrong number between "+ln+" and " +un +" are :");
		       for (i=ln;i<=un;i++)
		         {
					  n=i;
		          
		            while(n>0)
		              {
		                 a=n%10;
		                 sum=sum+(a*a*a);
		                 n=n/10;
		              } 
		           if (sum==i)
		              {
			             System.out.println(i+"  ");
			          }
			       sum=0;
		         }	
	        }catch (Exception e){}
	   }

}