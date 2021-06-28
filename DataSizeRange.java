import java.lang.*;

class DataSizeRange
{
    public static void main(String[] args)
    {
        // primitive data type
        int x;
        // Integer is a wrapper class around primitive data types like int,
        // so every primitive data type has a wrapper class which contains info about range
        // and size of that primitive data type.
        System.out.println("Int max value: " + Integer.MIN_VALUE);
        System.out.println("Int min value: " + Integer.MAX_VALUE);
        System.out.println("Int bytes: " + Integer.BYTES);
    }
}
