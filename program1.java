import java.util.*;

public class program1 {

   public static void main (String [] args){
       System.out.println("enter a number of times you woulld like to know if a number is divisible by 10 or 15 ");
               try (Scanner console = new Scanner(System.in)) {
                float n = console.nextFloat();
      System.out.println("enter a number  ");
                   float m = console.nextFloat();
                   
                  for (float i = 1; i <= n ; i++)
                   if ((m % 10 == 0) || (m % 15 == 0))
                   System.out.println(m + " is m. M is divisible by 10 or 15");
                      else 
                      System.out.println(m + " is m. M is not divisible by 10 or 15");
            }
   }
}
