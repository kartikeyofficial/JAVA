import java.util.*;

class Students {
    int rollNo;
    String name;
    int marks;
    public Students(int rollNo, String name, int marks){
        this.rollNo= rollNo;
        this.name= name;
        this.marks= marks;

    }
    public String toString(){
        return "{ Roll No:"+rollNo+", Name: "+name+", Marks:"+marks+"}";
    }
}
class NameComparator implements Comparator<Students>{
    @Override
    public int compare(Students s1, Students s2){
        return s1.name.compareTo(s2.name);

    }
}
class MarksComparator implements Comparator<Students>{
    @Override
    public int compare(Students s1, Students s2){
        return s1.marks - s2.marks;
    }
}
class ComparatorDemo{
    public static void main(String[] args) {
        Students student1= new Students(73, "Kumar Kartikey", 91);
        Students student2= new Students(118, "Rohit Singh", 92);

        TreeSet<Students> students= new TreeSet<>(new MarksComparator());
        students.add(student1);
        students.add(student2);
        System.out.println(students);

        students = new TreeSet<>(new NameComparator());
        students.add(student1);
        students.add(student2);
        System.out.println(students);

    }
}
