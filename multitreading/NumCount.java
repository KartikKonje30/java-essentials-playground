
public class NumCount extends Thread{
    
    public void run(){

        int count = 0;
        for(int i=0; i<=10; i++){
            if(i%3 == 0){
                count++;
            }
        }

        System.out.println("Count of numbers completely divisible by 3: " + count);
        
    }
}
