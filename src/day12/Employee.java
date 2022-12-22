package day12;

import java.time.LocalDate;

public class Employee extends Staff implements Comparable<Employee> {

    public Employee(long id, String name, LocalDate hireDate, float salary) {
        super(id, name, hireDate, salary);
    }

    @Override
    protected void getDescription() {
        System.out.println("This is description of Employee");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", hireDate=" + getHireDate() +
                ", salary=" + getSalary() +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
       // return this.getId().compareTo(o.getId()); for ascending order
        // return o.getId().compareTo(this.getId()); for descending order
    }
}
