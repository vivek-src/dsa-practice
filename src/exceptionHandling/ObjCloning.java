package exceptionHandling;

import java.util.Arrays;

public class ObjCloning {
    static void main() throws CloneNotSupportedException{
        Employee emp = new Employee("ABC", 86767);
//        Employee empClone = new Employee(emp); //Clones the employee  but uses new

        //Using Cloneable
        Employee newClone = (Employee) emp.clone();

        System.out.println(emp.name+"  "+ emp.salary);
        System.out.println(Arrays.toString(emp.arr));

        newClone.raiseSalary(30);
        newClone.arr[0] = 30;
        System.out.println(newClone.name+"  "+ newClone.salary);
        System.out.println(Arrays.toString(newClone.arr));


        System.out.println(emp.name+"  "+ emp.salary);
        System.out.println(Arrays.toString(emp.arr)); //Shallow copy affects original object non primitive data


    }
}
