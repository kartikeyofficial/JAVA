public class MyThread implements Runnable{
    public void run(){
        String threadName= Thread.currentThread().getName();
        System.out.println(threadName+"Starts: ...");
        System.out.println("Thread Start: ");
        for(int i =0;i<=5;i++){
            try{
            Thread.sleep(5000);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
            System.out.println(threadName+"i= "+i);
        }
        System.out.println(threadName+"Ends.....");
    }
    
}
class ThreadCreationRunnable{
    public static void main(String[] args)throws InterruptedException{
        MyThread obj1= new MyThread();
        MyThread obj2= new MyThread();

        Thread thread1= new Thread(obj1,"Thread 1");
        Thread thread2= new Thread(obj2,"Thread 2");
        thread1.start();
        thread2.start();

        thread1.join();
        thread1.join();
        System.out.println("Main Ends..");


        
    }
}
