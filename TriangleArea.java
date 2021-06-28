import java.lang.*;
import java.util.*;


class TriangleArea
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double base; 
        double height;
        System.out.println("Enter base measurement of triangle: ");
        base = sc.nextFloat();
        System.out.print("Enter height measurement of triangle: ");
        height = sc.nextFloat();
        System.out.println("Area of the triangle is: " + (base*height/2));

    }

}
