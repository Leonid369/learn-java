import java.lang.*;

public class UnicodeExample
{
    public static void main(String[] args)
    {
        // Unicodes for all Natural languages are available at unicode.org/charts/
        // Unicodes are hex codes
        for(char c = 0x0900; c<= 0x0970; c++)
        {
            System.out.println(c);
        }
    }
}
