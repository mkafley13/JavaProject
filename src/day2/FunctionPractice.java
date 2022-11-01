package day2;

public class FunctionPractice {
    public static void main(String[] args) {
        long principal = 500000;
        float rate = 11.03f; //Yearly
        int time = 3; //Months

       double interest = calculateInterest(principal, rate, time);
       System.out.println(interest);

        principal = 600000;
         rate = 11.04f; //Yearly
         time = 6; //Months

        interest = calculateInterest(principal, rate, time);
        System.out.println(interest);

        principal = 700000;
        rate = 11.08f; //Yearly
        time = 11; //Months

        interest = calculateInterest(principal, rate, time);
        System.out.println(interest);
    }

    static double calculateInterest(long p, float r, int t) {

        float timeInYear = t / 12f;
        return (p * r * timeInYear) / 100;

    }

}
