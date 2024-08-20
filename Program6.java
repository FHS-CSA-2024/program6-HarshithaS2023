//import stuff here!
import java.util.Scanner;
//Your code here
public class Program6 {
    public static void main(String[] args){
        final double pi = 3.14159;
        double radius = 0;
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Enter the radius: \n");
        radius=numScanner.nextDouble();
        radius = (double)Math.round(radius*1000)/1000;
        System.out.println("\nThe Radius of the circle = " + radius);
        double diameter = radius*2;
        diameter = (double)Math.round(diameter*1000)/1000;
        System.out.println("\nThe Diameter of the circle = " + diameter);
        double area = pi*radius*radius;
        area = (double)Math.round(area*1000)/1000;
        System.out.println("\nThe Area of the cirle = " + area);
        double circumference = pi*diameter;
        circumference = (double)Math.round(circumference*1000)/1000;
        System.out.println("\nThe Circumference of the circle = " + circumference);
    }
}

//Paste console output below:
/*
Enter the radius: 

3.712

The Radius of the circle = 3.712

The Diameter of the circle = 7.424

The Area of the cirle = 43.288

The Circumference of the circle = 23.323

*/
