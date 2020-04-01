import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest {

    @Test
    void testClass() {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        System.out.println("element 0: " + listInteger.get(0));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));
        System.out.println("element 3: " + listInteger.get(3));
        System.out.println("element 4: " + listInteger.get(4));

        listInteger.get(6);
        System.out.println("element 6: " + listInteger.get(6));
    }

    @Test
    void testClassCase2() {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        System.out.println("element 0: " + listInteger.get(0));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));
        System.out.println("element 3: " + listInteger.get(3));
        System.out.println("element 4: " + listInteger.get(4));

        listInteger.get(-1);
        System.out.println("element -1: " + listInteger.get(-1));
    }
}