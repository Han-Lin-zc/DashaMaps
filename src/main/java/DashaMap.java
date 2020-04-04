
public abstract class DashaMap implements HashMapX {

    Node[] hashArr;

    public DashaMap() {
        this.hashArr = new Node[26];
        char a = 'a';
        for (int i = 0; i < 26; i++) {
            char alphabet = (char) (a + i);
            hashArr[i] = new Node(Character.toString(alphabet), null, null);
        }
    }


    public String delete(String key) {
        return null;
    }

    public String get(String key) {
        return null;
    }

    public boolean isEmpty() {
        for (Node n : hashArr) {
            if (n.value > 0) return false;
        }
        return true;
    }

    public long size() {
        long result = 0;
        for (Node n : hashArr) {
            result += n.value;
        }
        return result;
    }

    public boolean bucketSize(String key) {
        return false;
    }
}
