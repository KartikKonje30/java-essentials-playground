
public class Operator {
    public static void main(String[] args){
        
        // Operators in Java

        // 1. Arithmetic Operators

        // +, -, /, *, %
        // ++, --

        int a = 5 + 3; // result is 8
        int b = 10 - 4; // result is 6
        int c = 6 * 7; // result is 42
        float d = 10 / 3.0f; // result is 3 (integer division)
        double e = 10.0 / 3.0; // result is 3.333... (floating-point division)
        int f = 10% 3; // result is 1
        System.out.println(d);

        // One more method for performing operations

        // instead of a = a + 5;

        a += 5; // 13
        a -= 3; // 5
        a *= 4; // 32
        a /= 5; // 2
        a %= 2; // 0

        // similarly

        a++; // post increment
        ++a; // pre increment
        a--; // post decrement
        --a; // pre decrement

        // 2. Bitwise Operators

        // &(AND), |(OR), ^(XOR), ~(NOT), <<(LEFT SHIFT), >>(RIGHT SHIFT)

        // To perform operations wrt bits
        // for example;
        
        int binary = 2;
        System.out.println(Integer.toBinaryString(binary));


        int b1 = 5; // 0101
        int b2 = 3; // 0011

        // AND operator (&)
        System.out.println("\nAND Operation:");
        System.out.println("--------------");
        System.out.println("5 & 3 = " + (b1 & b2)) ;
        System.out.println("Binary: " + Integer.toBinaryString(b1 & b2));

        // OR operator (|)
        System.out.println("\nOR Operation:");
        System.out.println("--------------");
        System.out.println("5 | 3 = " + (b1 | b2));
        System.out.println("Binary: " + Integer.toBinaryString(b1 | b2));

        // XOR operator (^)
        System.out.println("\nXOR Operation:");
        System.out.println("--------------");
        System.out.println("5 ^ 3 = " + (b1 ^ b2)) ;
        System.out.println("Binary: " + Integer.toBinaryString(b1 ^ b2));

        // NOT operator (~)
        System.out.println("\nNOT Operation:");
        System.out.println("--------------");
        System.out.println("~5 = " + (~ b1));
        System.out.println("Binary: " + Integer.toBinaryString(~ b1));

        // LEFT SHIFT operator (<<)
        System.out.println("\nLEFT SHIFT Operation:");
        System.out.println("---------------------");
        System.out.println("5 << 1 = " + (b1 << 1)) ;
        System.out.println("Binary: " + Integer.toBinaryString(b1 << 1));

        // RIGHT SHIFT operator (>>)
        System.out.println("\nRIGHT SHIFT Operation:");
        System.out.println("---------------------");
        System.out.println("5 >> 1 = " + (b1 >> 1));
        System.out.println("Binary: " + Integer.toBinaryString(b1 >> 1));

        // Relational Operators
        // They return a boolean result; true | false
        // < (less than), 
        // > (greater than), 
        // <= (less than equal to), 
        // >= (greater than equal to), 
        // == (equals equal to), 
        // != (Not equal to )

        // example: 
        System.out.println(b1 < b2);
        System.out.println(b1 >= b2);
        System.out.println(b1 == b2);
        System.out.println(b1 != b2);


        // Logical Operators
        // They are used to combine multiple boolean expressions or conditions
        // && (AND), 
        // || (OR), 
        // ! (NOT)

        // example:
        System.out.println(b1 < b2 && b2 > 5);

    }
}
