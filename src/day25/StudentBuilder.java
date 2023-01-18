package day25;

public class StudentBuilder {

    private Student student;


    public StudentBuilder(){
        student = new Student();
    }

    public StudentBuilder setName(String name) {
        student.setName(name);
        return this;
    }

    public StudentBuilder setRollNumber(int rollNumber) {
        student.setRollNumber(rollNumber);
        return this;
    }

    public Student build(){
        return student;
    }
}
