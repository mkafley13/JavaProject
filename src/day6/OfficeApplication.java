package day6;

import java.time.LocalDate;

public class OfficeApplication {

    public static void main(String[] args) {

        Employee employee1 = new Employee("ABC",200, LocalDate.of(2022,11,10));

        Employee employee2 = new Employee("DEF",300, null);

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
