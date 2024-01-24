import java.util.*;

public class program8{
   public static void main(String[]args){
   
   int num;
   int i; 
   System.out.println("Enter # of contents of array");
   try (Scanner console = new Scanner (System.in)) {
    num = console.nextInt();
       
       int [] integers = new int[num];
       
       System.out.println("Enter contents of array");
       for (i=0; i <num; i++){
          integers[i]=console.nextInt();
          break;
       }
      
          for (i=num-1;i>=0; i--){
          System.out.println("Contents of array in reverse are: " + integers[i]);
          break;
          }
}
   }
}
