record Employee(int empID, String empName){} // record are used for the to write our code in very Concise form and Very little and sort form.
public class Recorddemo {
    public static void main(String[] args) {
    Employee emp1 = new Employee(1, "Kartikey Rajput");
    Employee emp2 = new Employee(1, "Kartikey Rajput");
    System.out.println(emp1.empID());
    System.out.println(emp1.empName());

    System.out.println(emp2.empID());
    System.out.println(emp2.empName());
    
    System.out.println(emp1.equals(emp2));

    System.out.println(emp1.hashCode());
    System.out.println(emp2.hashCode());
    
    System.out.println(emp1);
    System.out.println(emp2);


    }
    
    
}

