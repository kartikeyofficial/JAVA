public class Students {
    @postConstruct
    public void init(){
        System.out.println("Student bean is Initialized:");

    }
    @pretDestroy
    public void cleanup(){
        System.out.println("Student bean is being Destroyed:");
    }

    
}
