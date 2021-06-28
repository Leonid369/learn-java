/* Literals
 *   - Literals are constant values used in a program 
 *   - Literals have data types 
 *   - any value with decimal point is double by default
 *   - any value without decimal point is int by default
 *   - there are also character literals and string literals
 *   - byte, short,long and int data types all accept int literals
 */

import java.lang.*;

class Literals
{
    public static void main(String[] args)
    {
        // Example of representing int literal 10 using different number systems
        byte b1 = 10;       // decimal
        byte b2 = 0b1010;   // binary
        byte b3 = 012;      // octal
        byte b4 = 0XA;      // hexadecimal
        System.out.println(b1); 
        System.out.println(b2); 
        System.out.println(b3);
        System.out.println(b4);
    }
}
