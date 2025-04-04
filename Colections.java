import java.util.ArrayList;
import java.util.*;

public class Colections {
    public static void main(String[] args) {
        List<String> tout = new ArrayList<>();

        String t1 = "C";
        String t2 = "B";
        String t3 = "A";

        tout.add(t1);
        tout.add(t2);
        tout.add(t3);

        Collections.sort(tout);

        System.out.println(tout);
    }
}
