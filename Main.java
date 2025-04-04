
/**
 * ArrayList : mono-thread, accès direct,
 * LinkedList :
 * Vector : multi-thread, accès direct,
 * Stack
 * 
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cat> group = new ArrayList<Cat>();


        Cat c1 = new Cat("Kiki");
        Cat c2 = new Cat("Whiskers");
        Cat c3 = new Cat("Mittens");
        c1.meow();
        c2.meow();
        c3.meow();

        group.add(c1);
        group.add(c2);
        group.add(c3);

        for(Cat c : group){
            c.meow();
        }

        System.out.println(group.size());
    }
}