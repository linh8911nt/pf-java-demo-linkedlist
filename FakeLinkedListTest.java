import java.util.LinkedList;

public class FakeLinkedListTest {
    public static void xacNhanRang(boolean expected) {
        System.out.println(expected);
    }

    public static void main(String[] args) {
        FakeLinkedList fakeLinkedList = new FakeLinkedList();
        xacNhanRang(fakeLinkedList.length == 0);

        fakeLinkedList.add(30);
        xacNhanRang(fakeLinkedList.length == 1);

        fakeLinkedList.add(40);
        xacNhanRang(fakeLinkedList.length == 2);

        xacNhanRang(fakeLinkedList.get(0) == 30);

    }
}
