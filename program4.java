import java.util.*;
import java.lang.Math.*;

public class program4 {
   
   public static void main (String [] args){
   
   double x;
   double n;
   double y;
   double sum;
   sum = 1;
   
      Scanner console = new Scanner (System.in);
      
      System.out.println("Enter an integer for X");
      x = console.nextDouble();
      System.out.println("X is " + x);
     
      System.out.println("Enter an integer for N");
      n = console.nextDouble();
      System.out.println("N is " + n);
      
      for (y=1; y<=n;y++){
         sum += Math.pow(x,y);
      }
      System.out.println("Sum of series: " + sum);
   }
   }
