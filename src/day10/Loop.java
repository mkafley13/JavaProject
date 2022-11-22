package day10;

public class Loop {

    public static void main(String[] args) {

        int i = 1;

        while (i <=10){
            System.out.println(i);
            i++;
        }
        System.out.println("The last value of i is : " + i);

        int j = 11;

        do {
            System.out.println(j);
            j++;
        }
        while (j <=10); {
            System.out.println("The last value of j is : " + j);
        }

        int k = 1;
        String result = "";
        while (k <=100){
            result += "a";
            k++;
        }
        System.out.println(result);

        String result1 = "a";
       String finalResult = result1.repeat(100);

       System.out.println(finalResult);

       for (int l =1; l <=10; l++){
           System.out.println(l);
       }

        for (int m =1; m <=10; m++){
            if (m % 2 ==0) continue;
            System.out.println(m);
        }

       double totalSaving = 0;

       for (;;){
           double earned = 1000;
           double interest = 1000*0.7*1/100;

           totalSaving += earned + interest;

           if (totalSaving >= 100000) break;
       }
    }
}
