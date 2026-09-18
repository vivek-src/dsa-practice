package exceptionHandling;

public class Employee implements Cloneable {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(Employee other){
        this.name = other.name;
        this.salary = other.salary;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
