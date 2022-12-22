package day16;

public class InnerClassPractice {

    public static void main(String[] args) {

        Outer outer = new Outer();

        Outer.Inner inner = outer.new Inner();
        inner.increaseOuterVal();
    }
}
