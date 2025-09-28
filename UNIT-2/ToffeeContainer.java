class ToffeeContainer{
    private boolean hasToffee= false;
    public synchronized void putToffee(){
        while(hasToffee){
            try{
                wait();
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
        System.out.println("Mother Puts a Toffee In the Container..");
        hasToffee= true;
        notify();
    }
    public synchronized void takeToffee(){
        while(!hasToffee){
            try{
                wait();
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }

        }
        System.out.println("Son Take The toffee from The Container..");
        hasToffee= false;
        notify();
    }
}

class Mother implements Runnable{
    ToffeeContainer container;
    Mother(ToffeeContainer container){
        this.container= container;
    }
    public void run(){
        for(int i=1; i<=5;i++){
            container.putToffee();
            try{
                Thread.sleep(400);
            }
            catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
    }
}
class Son implements Runnable{
    ToffeeContainer container;
    Son(ToffeeContainer container){
        this.container= container;
    }
    public void run(){
        for (int i=1;i<=5;i++){
            container.takeToffee();
            try{
                Thread.sleep(400);
            }
            catch(InterruptedException ie){
                System.out.println(ie);
            }
        }

    }
}
 class ThreadCommunicationExample{
    public static void main(String[] args) {
        ToffeeContainer container= new ToffeeContainer();
        Thread mother= new Thread(new Mother(container));
        Thread son = new Thread(new Son(container));
        mother.start();
        son.start();
    }
 }

