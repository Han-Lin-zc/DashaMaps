public class Node {

    String key;
    Integer value;
    Node next;

    public Node(String key, Integer value, Node next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public Node() {
        this.key = "";
        this.value = 0;
        this.next = null;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
