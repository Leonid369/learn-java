import java.lang.*;
import java.util.*;

class VariableNaming
{
    public static void main(String[] args)
        {
            // 1. Case sensitive
            // 2. Contains alphabets, numbers, _ or $
            // 3. Starts with alphabets, _ or $
            // 4. Should not be a keyword
            // 5. Should not be a class name, if class is also in use
            // 6. No limit on length of name
            // 7. Follow Camel Case

            int rollNumberOfStudent; 
            System.out.println("Enter your roll number ");
            Scanner sc = new Scanner(System.in);
            rollNumberOfStudent = sc.nextInt();
            System.out.println("Cool, All the best for your exams roll number "+ rollNumberOfStudent);    
        }
}
