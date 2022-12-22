package day12;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Staff {

    private long id;
    private String name;
    private LocalDate hireDate;
    private float salary;

    public Staff(long id, String name, LocalDate hireDate, float salary) {
        this.id = id;
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public float getSalary() {
        return salary;
    }

    protected void getDescription(){

    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return id == staff.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


