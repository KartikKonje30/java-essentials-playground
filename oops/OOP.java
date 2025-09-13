import java.util.List;

public class OOP {
    
    public static void main(String[] args) {
        
        // Object Oriented Programming System (OOPS)

        // A programming paradigm that uses classes and objects to design and implement software solutions.

        // Key concepts of OOPS in Java:
        //1. Class
        //2. Object
        //3. Encapsulation
        //4. Inheritance
        //5. Polymorphism
        //6. Abstraction


        //1. Class

        // A class is a blueprint for creating objects. 
        // It defines the structure (field) and behaviour (method) of objects.
        // example:

        // class Car {   // ---> blueprint
        //     String color;   //
        //     String type;    // ----> Fields
        //     int speed;      //

        //     void drive(){
        //         System.out.println("Car is driving");  // ---> method
        //     }
        // }

        // 2. Object

        // An object is a instance of a class.
        // It represents a real world entity and has attributes and behaviours.
        // example: 

        // Car mycar = new Car();   // instance of class
        // mycar.color = "White";   // accessing fields known as attributes
        // mycar.speed = 20;
        // mycar.drive();           // accessing methods known as behaviour


        // 3. Encapsulation

        // Encapsulation is the practice of bundling data (fields) and methods (functions) that operate on the data into a single unit (class). 
        // It also involves restricting direct access to some components using access modifiers (e.g., private, protected).
        // example;

        // class Car { 
            
        //     private String color;   
        //     private String type;    
        //     private int speed;      

        //     public void carColor(String color){
        //         this.color = color;
        //     }

        //     public void setSpeed(int speed){
        //         if(speed < 1){
        //         System.out.println("Not possible!");
        //         }
        //         else{
        //         this.speed = speed;
        //         drive();
        //         }

        //     }

        //     void drive(){
        //         System.out.println("Car is driving at speed: " + this.speed);
        //     }

        // }

        // Car car1 = new Car();
        // car1.carColor("white");
        // car1.setSpeed(0);


        // 4. Inheritance
        
        // Inheritance allows a class to acquire properties and method of another class.
        // It supports code reusability.
        // example:

        // class Animal{
        //     void eat(){
        //         System.out.println("This animal eats food.");
        //     }
        // }

        // class Dog extends Animal{
        //     void bark(){
        //         System.out.println("Dog barks.");
        //     }
        // }

        // Types in inheritance

        // 1. Single
        // 2. Multilevel
        // 3. Hierarchical

        // *** Java Does not support Multiple Inheritance ***

        // Above example comes under single

        // But what if there exist one more class named Cat and it extends Animal class 
        // Then this example comes under Hierarchical

        // Example of multilevel

        // class Child extends Parent{
            
        // }

        // class Parent extends GrandParent{

        // }

        // class GrandParent{
        //     String name;
        // }

        // Child child = new Child();
        // child.name = "Mark";


        // 5. Polymorphism

        // Polymorphism allows methods to perform different tasks based on the object that calls them.
        // It can be achieved via:
        // * Runtime Polymorphism (Method Overriding)
        // * Compile-time Polymorphism (Method Overloading)

        // * Method Over-riding OR Runtime Polymorphism
        // Run-time polymorphism is achieved through method overriding, where a subclass provides a specific implementation of a method already defined in its parent class. The method to be called is determined at runtime based on the object.
        // example:

        // class Animal {
        // void sound(){
        // System.out.println( "Animal makes a sound");
        // }
        // }

        // class Dog extends Animal {
        // void sound() {
        // System.out.println("Dog barks");
        // }
        // }

        // class Cat extends Animal {
        // void sound() {
        // System.out.println("Cat meows");
        // }
        // }

        // class Main {
        // public static void main (String[] args) {
        // Animal animal1 = new Dog(); // Upcasting
        // Animal animal2 = new Cat(); // Upcasting
        // animal1.sound(); // Calls Dog's overridden method: "Dog barks" 
        // animal2.sound(); // Calls Cat's overridden method: "Cat meows"
        // }
        // }


        // * Method Over-loading OR Compile time Polymorphism
        // Method Overloading in Java is a feature that allows a class to have multiple methods with the same name but different parameter lists. It enables a method to perform different tasks depending on the arguments passed to it.
        // example:

        // class Calculator {
        // // Add two integers
        // int add(int a, int b){
        // return a + b;
        // }
        // // Add three integers
        // int add(int a, int b, int c) {
        // return a + b + c;
        // }
        // }
        // class main1 {
        // public static void main(String[] args) {
        // Calculator calc = new Calculator();
        // System.out.println(calc.add(2, 3));         // Output: 5
        // System.out.println(calc.add(1, 2, 3));    // Output: 6
        // }
        // }



        //6. Abstraction

        // Abstraction focuses on showing only essentials details while hiding the implementation.
        // It is achieved through abstract classes and interfaces.

        // How to achieve Abstract class:-

        // • Declared using the abstract keyword.
        // • Can include both abstract methods (methods without a body) and concrete methods (methods with a body).
        // • Cannot be instantiated directly.
        // • Acts as a blueprint for subclasses, which must implement the abstract methods.

        // Example: 

        // public class Test { 
        //     public static void main(String[] args) {  
        //         Animal dog = new Dog();
        //         Animal cat = new Cat();
        //         dog.sayHello();
        //         dog.sleep();
        //         cat.sayBye();
        //         cat.sleep();
        //     }
        // }

        // abstract class Animal{
        //     abstract void sayHello();
        //     abstract void sayBye();
        //     void sleep(){
        //         System.out.println("Zzz....");
        //     }
        // }

        // class Dog extends Animal{ 
        //     void sayHello(){
        //         System.out.println("Woof");
        //     }
        //     void sayBye(){
        //         System.out.println("Woof Woof");
        //     }
        // }

        // class Cat extends Animal{ 
        //     void sayHello(){
        //         System.out.println("Meow");
        //     }
        //     void sayBye(){
        //         System.out.println("Meow Meow");
        //     }
        // }

        // Interface:

        // Class --> Blueprint for object
        // Interface ---> Blueprint for class

        // By interface, we achieve abstraction and multiple inheritance
        // It can have abstract methods, static constants, static methods and default methods

        // Example:

        // interface Mobile{
        //     static final int Batteries = 1;
        //     void makeCall();
        // }

        // interface MusicPlayer{
        //     void playMusic();
        // }

        // class SmartPhone implements Mobile, MusicPlayer{
        //     public void makeCall(){
        //         System.out.println("Calling.....");
        //     }
        //     public void playMusic(){
        //         System.out.println("Playing Music.....");
        //     }
        // }

        
        // Static methods in interface:

        // • Used for utility operations that are RELATED to the interface but don't need instance state
        // • Cannot be overridden by implementing classes
        // • Called directly on the interface (not through instance)

        // Example for static method: 

        // interface PaymentValidator{
        // boolean validatePayment(Payment payment);

        // // Static utility method - helper functions related to validation
        //     static boolean isValidCreditCard(String cardNumber){
        //         // Luhn algorithm check
        //     return cardNumber.length() == 16;
        //     }

        //     static boolean isValidAmount(double amount) {
        //     return amount > 0 && amount < 1000000;
        //     }
        // }

        // class PayPalValidator implements PaymentValidator {
        //     public boolean validatePayment(Payment payment) {
        //     // First use static utility method
        //     if (!PaymentValidator. isValidAmount(payment.getAmount())) {
        //     return false;
        //     }
        //     // Then do PayPal specific validation
        //     return true;
        //     }
        // }


        // Default methods in interface:

        // • Provide optional functionality to implementing classes
        // • Can be overridden if needed
        // • Can use other interface methods (abstract or default)
        // • Called through instance

        // Example for default method: 

        // interface PaymentProcessor {
        // void processPayment(Payment payment);
        
        // // Default method using abstract method
        // default void processPayments(List<Payment> payments) {
        //     for(Payment payment: payments) {
        //     processPayment(payment);
        //     }
        // }

        // // Default method with common implementation
        // default void validateAndProcess(Payment payment) {
        //     if(payment.getAmount() <= 0) {
        //         throw new IllegalArgumentException("Invalid amount");
        //     }
        //     processPayment(payment);
        // }
        // }

        // class StripeProcessor implements PaymentProcessor {
        // public void processPayment(Payment payment) {
        // // Stripe specific implementation
        // }

        // // Can use default processPayments() as is
        // // Can override validateAndProcess() if needed
        // }

        


    }
}
