package day20;

import day3.inheritance.Student;

import java.util.List;

public class StudentRepository implements CrudRepository<Student> {
    @Override
    public Student create(Student data) {
        return null;
    }

    @Override
    public List<Student> read() {
        return null;
    }

    @Override
    public Student update(Student data) {
        return null;
    }

    @Override
    public void remove(Student data) {

    }
}
