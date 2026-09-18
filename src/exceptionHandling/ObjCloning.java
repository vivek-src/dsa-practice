package exceptionHandling;

public class ObjCloning {
    static void main() throws CloneNotSupportedException{
        Employee emp = new Employee("ABC", 86767);
        Employee empClone = new Employee(emp); //Clones the employee  but uses new

        //Using Cloneable
        Employee newClone = (Employee) emp.clone();

        System.out.println(emp.name+"  "+ emp.salary);

        newClone.raiseSalary(30);
        System.out.println(newClone.name+"  "+ newClone.salary);

    }
}
