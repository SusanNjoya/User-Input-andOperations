import java.io.*;
import java.util.*;

public class la6{
   public static void main (String []args)throws FileNotFoundException{
      Scanner inFile = new Scanner(new File("input.txt"));
      String text;
      double count=0;
      PrintStream outFile = new PrintStream(new File("output.txt"));
      
      while (inFile.hasNextLine())
      {text = inFile.nextLine();
      count++;
      outFile.println("***********************************");
      outFile.println("Statistic for line: " + count);
      statistic(text,outFile);
      }
            }
           
      public static void statistic (String S, PrintStream outFile){
      
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
       outFile.println("total numbers = " + count);
       outFile.println("sum of numbers = " + sum);
       outFile.println("avg of numbers = " + avg);
       outFile.println("max of numbers = " + max);
}
     }
}
