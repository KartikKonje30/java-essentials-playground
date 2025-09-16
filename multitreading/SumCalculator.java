
public class SumCalculator implements Runnable{
    public void run(){

        long sum = 0;
        for(int i=1; i<=10; i++){
            sum += i;
        }

        System.out.println("Sum: " + sum);
    }
}
