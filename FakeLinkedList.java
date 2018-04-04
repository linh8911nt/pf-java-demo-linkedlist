public class FakeLinkedList {
    public   int length = 0;
    private FakeLinkedListElement first = null;

    public void add(int number) {

        if(first == null) {
            first = new FakeLinkedListElement(number);
        } else {
            FakeLinkedListElement last = first;
            while (last.getNext() != null){
                last = last.getNext();
            }
            last.setNext(new FakeLinkedListElement(number));
        }
        length++;
    }

    public int get(int index) {
        return value;
    }
}

class FakeLinkedListElement {
    private FakeLinkedListElement next;
    private int value;

    public FakeLinkedListElement() {}

    public FakeLinkedListElement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public FakeLinkedListElement getNext() {
        return this.next;
    }

    public void setNext(FakeLinkedListElement e) {
        this.next = e;
    }
}

