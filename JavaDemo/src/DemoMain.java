import java.util.HashMap;
import java.util.Map;

public class DemoMain {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("111", "222");
    map.put("333", null);
    System.out.println(map.containsKey("333"));
    System.out.println(map.get("444"));

  }

}
