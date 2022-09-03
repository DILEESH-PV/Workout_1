import java.io.*;
class month
  {
    public static void main(String args[])
      {  try
	         {
	           int mno;
		       DataInputStream d= new DataInputStream(System.in);
	           System.out.println("Enter the month number (1.Jan   2. Feb ...... 12.Dec) ");
		       mno=Integer.parseInt(d.readLine());
			   System.out.println("\n\n");
			   switch (mno)
			   {
				   case 1 :
				              System.out.println("Corresponding month is January");
							  break;
				   case 2 :
				              System.out.println("Corresponding month is February");
							  break;
				   case 3 :
				              System.out.println("Corresponding month is March");
							  break;
				   case 4 :
				              System.out.println("Corresponding month is April");
							  break;
				   case 5 :
				              System.out.println("Corresponding month is May");
							  break;
				   case 6 :
				              System.out.println("Corresponding month is June");
							  break;
				   case 7 :
				              System.out.println("Corresponding month is July");
							  break;
				   case 8 :
				              System.out.println(" Corresponding month is Auguest");
							  break;
				   case 9 :
				              System.out.println("Corresponding month is September");
							  break;
				   case 10 :
				              System.out.println("Corresponding month is October");
							  break;
				   case 11 :
				              System.out.println("Corresponding month is November");
							  break;
				   case 12 :
				              System.out.println("Corresponding month is December");
							  break;
			       default: System.out.println("Plz enter the valid month number");
			   }
	   
	        }catch (Exception e){}
	   }

}