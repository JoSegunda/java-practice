/*
Calculate the area of a rectangle, triangle, or circle.

Instructions
Read a shape and its measurements from input.

The shape is one of these three words:

rectangle - next two lines are width and height
triangle - next two lines are base and height
circle - next line is the radius
Print the area with two decimal places:

Area: [result]
Triangle area = base × height / 2. Circle area = pi × radius × radius.
*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        DecimalFormat fm = new DecimalFormat("#.00");


        System.out.print("Enter Shape: ");    
        String shape = sc.nextLine().trim().toLowerCase();

        double width, height, base, radius,result = 0;

        if (shape.equals("rectangle"))
        {
            System.out.print("Enter width: ");
            width = sc.nextDouble();

            System.out.print("Enter height: ");
            height = sc.nextDouble();

            result = width * height;
        }
        else if (shape.equals("circle"))
        {
            System.out.print("Enter radius: ");
            radius = sc.nextDouble();

            result = Math.PI * Math.pow(radius, 2);
        }else if (shape.equals("triangle"))
        {
            System.out.print("Enter base: ");
            base = sc.nextDouble();

            System.out.print("Enter height: ");
            height = sc.nextDouble();

            result = (base * height) / 2;
        }

        System.out.println("Area: "+ fm.format(result));

        sc.close();
    }
}
