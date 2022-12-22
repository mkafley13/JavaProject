package day18;

public class AssertionPractice {

    public static void main(String[] args) {

        int x = getX();

        // if (x > 0){
           // double y = Math.sqrt(x);
            //System.out.println(y);
        //}

        //  if (x < 0) throw new  IllegalArgumentException ("x < 0");

        assert x > 0 : "The value of x is less than 0"; // configure and add vm option -ea

        double y = Math.sqrt(x);
        System.out.println(y);

    }
    public static int getX(){
        return 4;
    }
}
