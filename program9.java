import java.io.*;
import java.util.*;
import java.math.*;

public class program9{
   public static void main (String [] args){
   //given a number from 1-12, it returns the name of the appropriate month
   
   int monthNum;
   
   Scanner console = new Scanner (System.in);
   System.out.println("Enter in a number to mirror a month");
   monthNum = console.nextInt();
   String monthName = monthNameIs(monthNum);
   }
  
   public static String monthNameIs (int monthNum){
   String[] month = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };
// have to use a method so from here down would become the method 
        if (monthNum >= 1 && monthNum <= 12) {
            String x;
            x = month[monthNum-1];
            System.out.println(x);
        } 
        
        else {
            System.out.println( "Invalid month number");
        }
        
        return null;
        }
        
}
