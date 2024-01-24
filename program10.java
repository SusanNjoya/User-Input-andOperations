import java.io.*;
import java.util.*;
import java.math.*;

public class program10{
   public static void main (String [] args){
      
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter a number");
        int num1 = scanner.nextInt();

        if (isEven(num1)) {
          System.out.println("All integers are even.");
        } 
        
          else {
             System.out.println("All integers are not even.");
          }
    }
      
        }

   public static boolean isEven(int num2){
   
    while (num2 > 0) {
       
         int digit = num2 % 10;
           
            if (digit % 2 != 0) {
                
                return false;
                   }
                      num2 /= 10;
                }
                return true;
  }

        }
