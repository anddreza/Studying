package Questions;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 12345);
        empIds.put("Andreza", 12344);
        empIds.put("Kenton", 2747);

        System.out.println(empIds);

        System.out.println(empIds.get("Andreza"));
       // System.out.println(empIds.containsKey("George")); -> here will be true or false
      //  System.out.println(empIds.containsValue(6)); -> here will be true or false too
        empIds.replace("John", 98765);

    }
}
