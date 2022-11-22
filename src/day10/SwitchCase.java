package day10;

public class SwitchCase {

    public static void main(String[] args) {

        String day = "MONDAY";
        String special = "";

        // USE IF(day.equalsIgnoreCase function to ignore lower and upper case

        switch (day){
            case "SUNDAY" :
                special = "A";
                break;
            case "MONDAY" :
                special = "B";
                break;
            case "TUESDAY" :
            case "THURSDAY" :
                special = "C";
                break;
            case "WEDNESDAY" :
                special = "D";
                break;
            case "FRIDAY" :
                special = "F";
                break;
            case "SATURDAY" :
                special = "G";
                break;

            default :
                special = "UNKNOWN";
        }
        System.out.println(special);

    }
}
