package exceptionHandling;

public class Employee implements Cloneable {
    String name;
    double salary;
    int arr[];

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.arr = new int[]{3,4,32,41};
    }

//    public Employee(Employee other){
//        this.name = other.name;
//        this.salary = other.salary;
//    }

    public Object clone() throws CloneNotSupportedException{
        //Shallow copy only copies primitives but points to original for non primitive data
        //this is shallow copy
//        return super.clone();
        // Deep Copy Creates new obj for non primitive Data
        Employee cloned = (Employee) super.clone();
        if (this.arr != null) {
            cloned.arr = this.arr.clone();
        }
        return cloned;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
