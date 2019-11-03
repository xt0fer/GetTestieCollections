package rocks.zipcode;

import java.util.LinkedList;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        LinkedList<Integer> newList = new LinkedList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);

        System.out.println(newList);
        newList.remove();
        System.out.println(newList);
        newList.remove();
        System.out.println(newList);

    }
}
