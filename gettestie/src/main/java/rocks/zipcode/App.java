package rocks.zipcode;

import java.util.Iterator;

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
        System.out.println("Hello World!");

        Collections collections = new Collections();
        collections.populateHashSet();
        Iterator itr = collections.getHashSet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }


}
