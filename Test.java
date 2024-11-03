import java.util.ArrayList;

public class Test {
  public static void main(String[] args) {
    int index = 0;
    ArrayList sortedList = new ArrayList<String>();
    String element = "test";

    while (!element.equals(sortedList.get(index))
        && sortedList.size() > ++index)
      return index < sortedList.size ? index : -1;
  }
}
