class Student implements Comparable<Student>{
    int rollNo;
    String name;
    int marks;
    public Student(int rollNo, String name, int marks){
        this.rollNo= rollNo;
        this.name= name;
        this.marks= marks;
    }
    public int compareTo(Student s){
        return this.marks - s.marks;
    }

    
}
class ComparableDemo{
    public static void main(String[] args) {
        Student student1= new Student(73, "Kumar Kartikey", 97);
        Student student2= new Student(118, "Rohit Singh", 97);
        if(student1.compareTo(student2)>0){
            System.out.println(student1.name+" Has More Marks Than "+student2.name);
        }
        else if(student1.compareTo(student2)<0){
            System.out.println(student1.name+" Has Less Marks Than "+student2.name);

        }
        else
        {
            System.out.println(student1.name+ " Has Equal Marks as "+ student2.name);
        }
    }
}