import java.util.*;

class MyThread extends Thread{
    private int threadId;
    public MyThread(int threadId) {
        this.threadId = threadId;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread"+threadId+"-Count"+i);
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class MultiThreadApplication{
    public static void main(String args[]){
        MyThread thread1 = new MyThread(1);
        MyThread thread2 = new MyThread(2);
        MyThread thread3 = new MyThread(3);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}