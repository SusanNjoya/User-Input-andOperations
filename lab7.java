import java.io.*;
import java.util.*;
import java.math.*;

public class lab7{
   public static void main (String [] args){
   Scanner console = new Scanner (System.in);
      int menu;
      double [] temp = new double[10];
      
      for (int i =0; i<= temp.length; i++){
      
      System.out.println("Input 10 temperatures");
      Scanner console = new Scanner (System.in);
      temp[i] = console.nextDouble();
         }
      System.out.println(temp[i]);
      System.out.println("Enter menu choice ");
      menu = console.nextInt();
    while (menu != -1){
    
       if (menu == 1)
       tempreturn(temp);
              
       else if (menu == 2)
       avg(temp);
       
       
       else if (menu == 3)
       cold(temp);
       
       
       else if (menu == 4)
       high(temp);
       
       
       else if (menu == 5)
       low(temp);
       
      
       
       System.out.println("Menu:" + menu);
       System.out.println("1. Print temperatures");
       System.out.println("2. Temperatures average");
       System.out.println("3. Cold temperature");
       System.out.println("4. High freezing");
       System.out.println("5. Low temperature");
              }
              
    }
    
    
    public static void tempreturn(double []temp){
      for (int i =0; i<= temp.length; i++){
      System.out.println("Temperatures  are " + temp [i] );}
      
    public static void avg(double [] temp){
      double sum = 0;
      double avg1 = 0;
      double count = 0;
     
      for (int i =0; i<= temp.length; i++){
      count++;
      sum = sum + temp[i];
      avg1= sum/count;
      
      }
      System.out.println("The average temperature is " + avg1);
      }
      
      
    public static void cold (double [] temp){
    
    int above32=0;
    int below32= 0;
    
    for (int i =0; i<= temp.length; i++){
    if (temp[i]<32)
    below32++;
    else 
    above32++;
    }
    
    System.out.println(below32 + "days below 32 degrees");
    System.out.println(above32 + "days above 32 degrees");
    }
    
    
    public static void high(double[]temp){
    double max = Integer.MIN_VALUE;
    for (int i = 0; i < temp.length; i++)
    max = Math.max(max, temp[10]);
      
       System.out.println("The max temperature is " + max);
     }  
    
     
    public static void low(double[]temp){
    
    double min = Integer.MAX_VALUE;
    for (int i = 0; i < temp.length; i++)
    min = Math.min(min, temp[10]);
    
    System.out.println("The min temperature is " + min);
    }
    
    }
