package day15;

import day12.Employee;

import java.time.LocalDate;

public class InterfaceProperty {

    public static void main(String[] args) {

       // Comparable<Employee> comp = new Comparable<>();

       // Comparable<Employee> comp1 = new Employee(1,"A", LocalDate.now(),500);

        Comparable<Employee> comp1 = new ComparableImpl(); //Using separate class

        Comparable<Employee> comp2 = new Comparable<Employee>() { //by overriding function itself
            @Override
            public int compareTo(Employee o) {
                return 0;
            }
        };

        Comparable<Employee> comp3 = o -> 0; //Using Lambda
    }
}
