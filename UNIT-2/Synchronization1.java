public class Synchronization1 {
    int data;
    Synchronization1(int data){
        this.data= data;

    }
    // synchronized display(String threadName )
     void display(String threadName){  // Synchronized Method
        System.out.println(threadName+"Start..");
        try{
        Thread.sleep(2000);
        }
        catch(InterruptedException ie){
            System.out.println(ie);
        }
        System.out.println("Data = "+data);
        System.out.println(threadName+"End..");
    }

}
class DataAccess implements Runnable{
    Synchronization1 dataobj;
    DataAccess(Synchronization1 dataobj){
        this.dataobj= dataobj;
    }
    public void run(){
        synchronized(dataobj){ // sysnchronized Block
        dataobj.display(Thread.currentThread().getName()); 
        }
    }
}
class ThreadSysncDemo{
    public static void main(String[] args) {
        Synchronization1 dataobj= new Synchronization1(12);
        DataAccess dataAccess1= new DataAccess(dataobj);
        DataAccess dataAccess2= new DataAccess(dataobj);

        Thread thread1= new Thread(dataAccess1,"MyThread1");
        Thread thread2= new Thread(dataAccess2,"MyThread2");
        thread1.start();
        thread2.start();
    }
}