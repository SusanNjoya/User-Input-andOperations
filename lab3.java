import java.util.*;

public class lab3 {
   
   public static void main (String [] args){
      System.out.println("Enter a number :");
      double n;
      double sum;
      double avg;
      double counter;
      counter = 0;
      n = 0;
      sum = 0;
      avg = 0;
      Scanner console = new Scanner(System.in);
      n = console.nextDouble();
           
     while (n >= 0){
     n = console.nextDouble();
     counter++;
     sum = sum + n;
     avg = sum/counter;
      
      }   
      System.out.println("The average is " + avg);
   }
   
   }
