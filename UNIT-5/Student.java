package mit.academics;
public class Student {
    int rollNo;
    String name;
    public Student(int rollNo, String name){
        this.name= name;
        this.rollNo= rollNo;
    }
    @Override
    public String toString(){
        return rollNo+" "+name; 
    }
    
}
