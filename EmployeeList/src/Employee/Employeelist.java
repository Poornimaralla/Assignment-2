package Employee;
import java.util.*;
import java.math.*;
public class Employeelist {
    public static void main(String[] args) {

        Employee obj = new Employee("Sathish", "Param", 36, 34000);
        Employee obj1 = new Employee("Poornima", "Ralla", 24, 30000);
        Employee obj2 = new Employee("Hema", "Buddareddy", 22, 35000);
        Employee obj3 = new Employee("Rajesh", "Manubolu", 43, 50000);
        Employee obj4 = new Employee("Swathi", "Rajolu", 34, 35000);
        Employee obj5 = new Employee("Sindhu", "Tupili", 26, 45000);
        Employee obj6 = new Employee("Balaji", "Kapuluru", 43, 56000);
        Employee obj7 = new Employee("Prasad", "Anepudi", 37, 46000);
        Employee obj8 = new Employee("Sandeep", "Kalluru", 56, 42000);
        Employee obj9 = new Employee("Giri", "Karam", 37, 37000);
        List<Employee> emp1 = new ArrayList<Employee>();
        emp1.add(obj);
        emp1.add(obj1);
        emp1.add(obj2);
        emp1.add(obj3);
        emp1.add(obj4);
        emp1.add(obj5);
        emp1.add(obj6);
        emp1.add(obj7);
        emp1.add(obj8);
        emp1.add(obj9);
        
        Employeelist e = new Employeelist();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last name : ");
        String lastname = sc.nextLine();
        e.emplastname(emp1, lastname);
        e.empmaxsalary(emp1);
        e.empminsalary(emp1);
    }

    public void empdetails(List<Employee> emp1) {
        for (Employee emp : emp1) {
            System.out.println(emp.f_name + " " + emp.l_name + " " + emp.e_age + " " + emp.e_salary + " ");

        }
    }

    public void emplastname(List<Employee> emp1, String lastname) {
        for (Employee last : emp1) {
            if ((last.l_name).equals(lastname)) {
                System.out.println("Details by last name: " + last.f_name + " " + last.e_age + "");
            }

        }
    }

    public void empmaxsalary(List<Employee> emp1) {
        int max = 0;
        for (Employee sal : emp1) {
            if (sal.e_salary > max) {
                max = sal.e_salary;


        System.out.println("Max salrary Employee:" +max);}}
    }

    public void empminsalary(List<Employee> emp1) {
        int min = 0;
        for (Employee ms : emp1) {
            if (ms.e_salary < min) {
                min = ms.e_salary;
            }
        }
        System.out.println("Min Salary Employee : " + min);
   // }public void
}}








