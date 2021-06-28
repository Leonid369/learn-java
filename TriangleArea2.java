import java.lang.*;
import java.util.*;

class TriangleArea2
{
    public static void main(String[] args)
    {
        double a,b,c,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle ");
        double[] x = Arrays.stream(sc.nextLine().split(" "))
                                .mapToDouble(Double::parseDouble)
                                .toArray();
        double s = 0.5 * (x[0]+x[1]+x[2]);
        area = Math.sqrt(s*(s-x[0])*(s-x[1])*(s-x[2]));
        
        
        System.out.println("Area of triangle is " + area);
                
    }
}
