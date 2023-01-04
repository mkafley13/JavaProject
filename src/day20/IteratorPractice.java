package day20;

import day12.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice {

    public static void main(String[] args) {

        ArrayList employees = new ArrayList<Employee>();

        employees.add(new Employee(1,"A",LocalDate.now(),500));
        employees.add(new Employee(2,"B",LocalDate.now(),500));
        employees.add(new Employee(3,"C",LocalDate.now(),500));
        employees.add(new Employee(4,"D",LocalDate.now(),500));

        Iterator<Employee> iter = employees.iterator();

        while (iter.hasNext()){
            Employee emp = iter.next();
            System.out.println(emp);
        }
    }
}
