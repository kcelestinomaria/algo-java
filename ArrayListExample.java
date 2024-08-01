import java.util.ArrayList;
import java.util.List;


public class ArrayListExample {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("First element: " + arrayList.get(0));

        System.out.println("Elements in ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        arrayList.set(1, "Blueberry");

        arrayList.remove("Cherry");
    }
}