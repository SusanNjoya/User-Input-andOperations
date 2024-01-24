import java.util.*;

public class lab2 {
   
   public static void main (String [] args){
   
   System.out.println("Enter a value for radius");
   
   double radius;
   double diameter;
   double circumference;
   double area;
   Scanner console = new Scanner(System.in);
   radius = console.nextDouble();   
   
       while (radius >= 0){
    
       diameter= radius * 2;
       
       circumference= ((2* 3.14)*(radius));
       
       area = (radius * radius * 3.14);
       
       System.out.println("Diameter is " + diameter);
       System.out.println("Circumference is " + circumference);
       System.out.println("Area is " + area);
       break;
       }
      
      }

}
