
public class withoutMultitreading {
    public static void main(String[] args) {

        // without Multithreading 
        // Example: 
        
        long startTime = System.currentTimeMillis();

        // Task 1 
        long sum = 0;
        for(int i=1; i<=10; i++){
            sum += i;
        }

        System.out.println("Sum: " + sum);

        // Task 2
        int count = 0;
        for(int i=0; i<=10; i++){
            if(i%3 == 0){
                count++;
            }
        }

        System.out.println("Count of numbers completely divisible by 3: " + count);
        
        System.out.println("Time Taken: " + (System.currentTimeMillis() - startTime) + "ms");
        
        // Here it takes 24ms to finish both thread execution

    }
}
