package day21;

import java.util.HashMap;

public class MapPractice {

    public static void main(String[] args) {

        HashMap<String, String> userMap = new HashMap<>();

        userMap.put("Name", "Manoj");
        userMap.put("Age", "20");
        userMap.put("roll", "10");

        userMap.put("AGENT_CODE", "PAYWELL01");

        HashMap<String, Object> responds = new HashMap<>();

        responds.put("Status", true);
        responds.put("Message", "Click here");
        responds.put("Data", "https://google.com");

        System.out.println(responds);

        responds.put("Status", false); //does not allow duplicate. will change first value of true to false

        System.out.println(responds);

        String data = (String) responds.get("data");
        System.out.println(data); //gives the value in "data"
    }
}
