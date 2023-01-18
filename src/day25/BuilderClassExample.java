package day25;

public class BuilderClassExample {

    public static void main(String[] args) {

        StudentBuilder studentBuilder = new StudentBuilder().setName("Manoj").setRollNumber(13);

        Student student2 = new StudentBuilder()
                .setName("Manoj")
                .setRollNumber(13)
                .build();

        Student student1 = studentBuilder.build();



    }
}
