public class Test {
    public static void main(String[] args){
        
        System.out.println();

        System.out.println("Hello Java!");

        // Datatypes in Java

        // Primitive Datatypes

        // Integral Numbers:
        // byte (1 byte)
        // short (2 bytes)
        // int (4 bytes)
        // long (8 bytes)

        // Decimal Numbers:
        // float (4 bytes)
        // double (8 bytes)

        // True/False:
        // boolean (1 bit)

        // Characters:
        // char (2 bytes)

        System.out.println();

        System.out.println("Byte Range:");
        System.out.println("------------");
        byte a = 127;
        System.out.println("Example byte value: " + a);
        System.out.println("Minimum byte value: " + Byte.MIN_VALUE);  // -2^7 OR -128 (8 bits)
        System.out.println("Maximum byte value: " + Byte.MAX_VALUE);  // 2^7 - 1 OR 127
        System.out.println();

        System.out.println();

        System.out.println("Short Range:");
        System.out.println("------------");
        short b = 2;
        System.out.println("Example short value: " + b);
        System.out.println("Minimum short value: " + Short.MIN_VALUE);  // -2^15 OR -32,768 (16 bites)
        System.out.println("Maximum short value: " + Short.MAX_VALUE);  // 2^15 - 1 OR 32,767
        System.out.println();

        System.out.println();

        System.out.println("Int Range:");
        System.out.println("-----------");
        int c = 2;
        System.out.println("Example int value: " + c);
        System.out.println("Minimum int value: " + Integer.MIN_VALUE);  // -2^31 OR -2,147,483,648 (32 bites)
        System.out.println("Maximum int value: " + Integer.MAX_VALUE);  // 2^31 - 1 OR 2,147,483,647
        System.out.println();

        System.out.println();

        System.out.println("Long Range:");
        System.out.println("------------");
        long d = 922337203685477580l;
        System.out.println("Example int value: " + d);
        System.out.println("Minimum int value: " + Long.MIN_VALUE);  // -2^63 (64 bites)
        System.out.println("Maximum int value: " + Long.MAX_VALUE);  // 2^63 - 1
        System.out.println();

        System.out.println();

        float e = 123.456789f; // ~7 significant digits
        System.out.println("Float Examples:");
        System.out.println("---------------");
        System.out.println("Original float value: " + e);
        System.out.println("Smallest positive float: " + Float.MIN_VALUE);
        System.out.println("Largest positive float: " + Float. MAX_VALUE) ;
        System.out.println("Largest negative float: -" + Float.MAX_VALUE);
        System.out.println("Smallest negative float: -" + Float.MIN_VALUE);
        System.out.println();

        System.out.println();

        double f = 123.456789012345678; // ~15 significant digits
        System.out.println("Double Examples:");
        System.out.println("---------------");
        System.out.println("Original double value: " + f);
        System.out.println("Smallest positive double: " + Double.MIN_VALUE);
        System.out.println("Largest positive double: " + Double. MAX_VALUE) ;
        System.out.println("Largest negative double: -" + Double.MAX_VALUE);
        System.out.println("Smallest negative double: -" + Double.MIN_VALUE);
        System.out.println();

    }
}
