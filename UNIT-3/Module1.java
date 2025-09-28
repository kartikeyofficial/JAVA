package mit.academics;
public class Module1 {
    int rollNo;
    String Name;
    public Module1(int rollNo, String Name){
        this.rollNo= rollNo;
        this.Name= Name;
    }
    @Override
    public String toString(){
        return rollNo+" : "+Name;
    }
    
}
