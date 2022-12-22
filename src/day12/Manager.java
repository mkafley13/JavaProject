package day12;

import java.time.LocalDate;

public class Manager extends Staff{

    private float bonus;

    public Manager(long id, String name, LocalDate hireDate, float salary) {
        super(id, name, hireDate, salary);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public float getSalary() {
        return bonus + super.getSalary();
    }

    @Override
    protected void getDescription() {
        System.out.println("This is description of Manager");

    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", hireDate=" + getHireDate() +
                ", salary=" + super.getSalary() +
                ", bonus=" + bonus +
                '}';
    }
}
