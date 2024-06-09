import java.util.List;

public class Main{
    public static void main(String[] args){
        String[] namesArray = {};
        List<String> names = new ArrayList<>();
        names.add("John");
        names.remove("John");

        System.out.println(names.size());
        names.contains("John");
    }
}