

public class Test {
    public static void main(String[] args){
        
        System.out.println();

        System.out.println("Datatypes in Java with range");
        System.out.println("-----------------------------");

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
        System.out.println("-----------");
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
        System.out.println("----------");
        int c = 2;
        System.out.println("Example int value: " + c);
        System.out.println("Minimum int value: " + Integer.MIN_VALUE);  // -2^31 OR -2,147,483,648 (32 bites)
        System.out.println("Maximum int value: " + Integer.MAX_VALUE);  // 2^31 - 1 OR 2,147,483,647
        System.out.println();

        System.out.println();

        System.out.println("Long Range:");
        System.out.println("-----------");
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

        System.out.println();

        char g = 'A';
        System.out.println("Character Ranges:");
        System.out.println("-----------------");
        System.out.println("Example char value: " + g);
        System.out.println("Minimum char value: " + (int) Character.MIN_VALUE);  // 0
        System.out.println("Maximum char value: " + (int) Character.MAX_VALUE);  // 65535
        System.out.println("Specific char from value: " + ((char) 10084));  // 
        // Common ASCII examples (0-127 range) 
        // all alphabets form a-z to A-Z
        System.out.println();

        System.out.println("Widening or Implicit Conversion Examples:");
        System.out.println("-----------------------------------------");
        byte byteValue = 10;  // 1 byte // cup
        short shortValue = byteValue;  // 2 bytes // glass
        int intValue = shortValue;  // 4 bytes // jug
        long longValue = intValue;  // 8 bytes // bucket
        float floatValue = longValue;  // 4 bytes
        double doubleValue = floatValue;  // 8 bytes
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println();

        System.out.println("Narrowing or Explicit Conversion Examples:");
        System.out.println("------------------------------------------");
        double doubleValue2 = 123.456;  // 8 bytes
        float floatValue2 = (float) doubleValue2;
        long longValue2 = (long) floatValue2;
        int intValue2 = (int) longValue2;
        System.out.println("double: " + doubleValue2);
        System.out.println("float: " + floatValue2);
        System.out.println("long: " + longValue2);
        System.out.println("int: " + intValue2);
        System.out.println();

        // Non-Primitive Datatypes

        // Classes
        // String 
        // Arrays
        // Enums

        // String Creation Methods
        // We can create a string using two methods:
        
        //1. String n = "char";
        // Using String literals

        //2. String n = new String("char");
        // Using Constructor from String Class

        // Lets understand how a string assigns value
        // Inside JVM their is a dedicated space for stroring objects known as heap memory in which their is a dedicated part for referencing unique string literals called string pool.
        // The Java String Pool, also known as the String Constant Pool or String Literal Pool, is a special storage area within the Java Heap memory. Its primary purpose is to optimize memory usage by storing unique string literals and preventing the creation of duplicate string objects.
        // see whenever we create a variable for example:
        // int a = 1;
        // It gets stored in stack memory in JVM evaluating there is a variable name 'a' in which value 1 is stored.
        // when a string is created, a reference gets assigned for that string in the heap memory inside string pool.
        // And when another string having same value is created at such instance that same reference gets assigned, pointing to the same memory space for that newly created variable.
        // Strings are immutable in Java
        // The immutability of String objects in Java is crucial for the String Pool to function effectively, as it ensures that shared string objects in the pool cannot be modified, preventing unexpected side effects.
        // This is only considered in terms of using string literal method
        // when we create a string using constructor in such case new memory gets assigned for that new object inside heap memory and outside string pool.

        System.out.println("String Creation:");
        System.out.println("----------------");


        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println("Comparing variables having same reference from pool - " + (str1 == str2)); // true (same reference in pool)
        System.out.println("Comparing different objects - " + (str2 == str3)); // false (different objects)
        System.out.println("Comparing similar context using .equals method - " + str1.equals(str3)); // true as it is comparing values using .equals method from String class (same content)

        System.out.println();

        String name = "John";
        name.toUpperCase();
        System.out.println(name); // Still prints John

        // Correct way
        name = name.toUpperCase();
        System.out.println(name); // Prints JOHN

        System.out.println();
        
        // Common String Operations

        String text = "Hello World";

        // Length
        System.out.println(text.length()); // 10

        // Accessing characters
        System.out.println(text.charAt(0)); // 'H'

        // Substring
        System.out.println(text.substring(0,5)); // "Hello"

        // Contains, startsWith, endsWith
        System.out.println(text.contains( "World")); // true

        // Replace
        String newText = text. replace("World", "Java");
        System.out.println(newText);

    }
}
