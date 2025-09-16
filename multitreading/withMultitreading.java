
public class withMultitreading {
    
    public static void main(String[] args) {
        
        // Multithreading 
        // Information from pdf


        // Example: 
        // We create two seperate threads for dividing tasks
        // Named NumCount and SumCalculator
        // One will used extends Thread
        // Another will use implements Runnable
        // Both works same for desired result

        long startTime = System.currentTimeMillis();

        NumCount thread1 = new NumCount(); 
        thread1.start();    // using extends we can directly run start as thread class have start method

        SumCalculator sumCalculator = new SumCalculator();
        // Here we need to create a thread and then run start method
        Thread thread2 = new Thread(sumCalculator);
        thread2.start();

        // Here we also need to mention threads to wait for other task as well
        // so to do that we need to use method .join() to tell threads to wait for other thread as well
        // Also .join() throws an exception so we need to handle it in try catch

        try {
            thread1.join();
            thread2.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Time Taken: " + (System.currentTimeMillis() - startTime) + "ms");

        // Here it takes 16ms to finish both thread execution
    }
}
