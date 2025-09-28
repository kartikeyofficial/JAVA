public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread= Thread.currentThread(); // Thread Object
        System.out.println(thread.getName());// main is The Default Name
        thread.setName("MyThreadName");
        System.out.println(thread.getName());

        System.out.println(thread.getPriority());// the Default Priority is the 5
        thread.setPriority(7);
        System.out.println(thread.getPriority());

        System.out.println(thread.MIN_PRIORITY); // Min Priority is the 1.
        System.out.println(thread.NORM_PRIORITY);// The Norm Priority is the 5.
        System.out.println(thread.MAX_PRIORITY);   // Max preiority is the 10
        try{
        Thread.sleep(3000);
        }
        catch(InterruptedException ie){
        System.out.println(ie);

        }
        System.out.println("Sleep Is Over!");
        System.out.println(thread.getState());

        System.out.println(thread.isAlive());

    }
}
