package controlflow;

public class Loops {

    public static void main(String[] args){
    
    // Loops in Java for control flow

    //1. while Loop

    System.out.println("\nWhile Loop Example:");
    System.out.println("-------------------");

    int num = 1;

    while (num <= 10){
        System.out.println("(" + num + ") Hello");
        num++;
    }

    //2. Do-while Loop 
    // similar to the while loop, but do while loop will atleast run once apart from whatever the condition might be given
    // first it will run the statement inside do block and then check condition

    System.out.println("\nDo-While Loop Example:");
    System.out.println("------------------------");

    int num2 = 11;

    do{
        System.out.println("(" + num2 + ") Hello");
        num2++;
    }while (num2 <= 10);


    //3. For Loop

    System.out.println("\nFor Loop Example:");
    System.out.println("-------------------");

    for(int i = 0; i<=10; i++){
        System.out.println("(" + i + ") Hello");
    }

    //3. For-each Loop

    System.out.println("\nFor-each Loop Example:");
    System.out.println("-------------------");

    int[] arr = new int[5];
    arr[4] = 20;

    // Here i is not referring to the index but the element present in every index
    
    for(int i : arr){
        System.out.println("arr[" + i + "]");
    }

}

}
