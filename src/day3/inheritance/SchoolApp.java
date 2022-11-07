package day3.inheritance;

public class SchoolApp {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("A");
        student.setAge(10);
        student.setRollNumber(5);

        Teacher teacher = new Teacher();
        teacher.setName("T");
        teacher.setAge(35);
        teacher.setSubject("Computer");

        Staff staff = new Staff();
        staff.setName("S");
        staff.setAge(45);
        staff.setType("Cook");
    }
}
