import java.lang.*;
import java.util.*;

public class ReadKeyboard
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String fruit;
        System.out.println("Enter your favorite fruit");
        fruit = sc.nextLine();
        System.out.println("Cool, " + fruit + " is an awesome fruit!!!");        
    }
}
