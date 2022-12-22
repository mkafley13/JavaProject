package day12;

import java.time.LocalDate;

public class OfficeApplication {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "ABC", LocalDate.now(), 500);
        System.out.println(employee1);

        Manager manager1 = new Manager(2, "DEF", LocalDate.now(), 1000);
        manager1.setBonus(1000);
        System.out.println(manager1);

        System.out.println("Employee Salary : " + employee1.getSalary());
        System.out.println("Manager Salary : " + manager1.getSalary());

        //Parent class can hold Child class but a Child class can not hold a Parent class object
        Staff employee2 = new Employee(3, "CDE", LocalDate.now(), 500);
        Staff manager2 = new Manager(4, "DCE", LocalDate.now(), 1000);
        ((Manager)manager2).setBonus(1000); //To get bonus from Manager class as it is not in Staff class

        System.out.println("Employee Salary : " + employee2.getSalary());
        System.out.println("Manager Salary : " + manager2.getSalary());
    }
}
