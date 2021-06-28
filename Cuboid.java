import java.lang.*;
import java.util.*;

class Cuboid
{
    public static void main(String[] args)
    {
        double length, height, breadth;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length, height, breadth of the Cuboid: ");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        height = sc.nextDouble();
        double area = 2 * ((length*breadth)+(breadth*height)+(length*height));
        double volume = length*breadth*height;
        System.out.println("Area of the Cuboid is " + area);
        System.out.println("Volume of the Cuboid is " + volume);
    }
}
