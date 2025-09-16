
public class MyThread extends Thread{

    private Counter counter;

    public MyThread(Counter counter){
        this.counter = counter;
    }

    public void run(){
        for(int i = 1; i <= 1000; i++){
            counter.increment();
        }
    }
    
    public static void main(String[] args) {
        
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(Exception e){

        }

        System.out.println(counter.getCount());

    }
}

class Counter{

    private int count; // shared resource

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }

}

// From the above example

// We expect both the threads to run and each counter to increment count by 1000.
// Resulting into total count 2000

// But when put this into action it gives different result everytime we execute.
// This happens because their might be a situation where both of them run increment() at the same time resulting into same result.
// We want the increment() to be given access one at a time to get them synchronus to get the desired result.
// We can simply achieve this by putting synchronized in the increment 
// to give each access to the threads one at a time resulting the count to 2000.