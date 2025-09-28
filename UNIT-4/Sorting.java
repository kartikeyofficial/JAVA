import java.util.*;
class Sorting implements Comparator<Sorting>{
    int rollNo;
    String name;
    int marks;
    public Sorting(int rollNo, String name, int marks){
        this.rollNo= rollNo;
        this.name= name;
        this.marks= marks;
    }
    public String toString(){
        return "{Roll No: "+rollNo+",Name: "+name+",Marks: "+marks+"}";
    }
    
    public int compareTo(Sorting o){
        return rollNo - o.rollNo;
    }

    
}
class NameCompare implements Comparator<Sorting>{
    @Override
    public int compare(Sorting s1, Sorting s2){
        return s1.name.compareTo(s2.name);
    }
}
class MarksCompare implements Comparator<Sorting>{
    @Override
    public int compare(Sorting s1, Sorting s2){
        return s1.marks- s2.marks;
    }
}

class CompareDemo{
    public static void main(String[] args) {
        Sorting student1= new Sorting(73, "Kumar Kartikey", 98);
        Sorting student2= new Sorting(118, "Rohit Singh", 91);
        Sorting student3= new Sorting(25, "Aditys Singh", 95);

        List<Sorting> students= new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println("Unsorted Data: "+students);

        Collections.sort(students);
        System.out.println("Sorted by RollNo.: "+students);

        Collections.sort(students,new NameCompare());
        System.out.println("Sorted By Name:"+students);

        Collections.sort(students, new MarksCompare());
        System.out.println("Sorted By Marks: "+students);
        }

    }

