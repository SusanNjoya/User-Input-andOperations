import java.util.*;

public class lab5{
   public static void main (String []args){
      String S = "5 7 2 8 9 10 12 98 7 14 20 22";
      statistic (S);}
      public static void statistic (String S){
   try (Scanner console = new Scanner (S)) {
      double numbers;
      double count = 0;
      double sum = 0;
      double avg = 0;
      double max = Integer.MIN_VALUE;
      while (console.hasNextInt()){
         numbers = console.nextInt();
         count++;
         sum = sum + numbers;
         avg = sum/count;
         max = Math.max(max, numbers);
      }
      System.out.println("total numbers = " + count);
      System.out.println("sum of numbers = " + sum);
      System.out.println("avg of numbers = " + avg);
      System.out.println("max of numbers = " + max);
   }
     }
}

