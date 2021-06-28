import java.util.*;
import java.lang.*;


class RootsOfQuadraticEqn
{
    public static void main(String[] args)
    {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b and c of quadratic equation ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double root1 = ((-b) + Math.sqrt((b*b)-(4*a*c)))/(2*a);
        double root2 = ((-b) - Math.sqrt((b*b)-(4*a*c)))/(2*a); 
        System.out.println("root 1: " + root1);
        System.out.println("root 2: " + root2);
    }
}
