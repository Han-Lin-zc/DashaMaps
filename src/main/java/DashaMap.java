
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

    public Node[] getHashArr() {
        return hashArr;
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

    public void appendTo(String letter, Node node) {
        for (Node n : hashArr) {
            if (n.getKey().equals(letter)) {
                Node temp = n;
                while (temp.getNext() != null) {
                    temp = temp.getNext();
                }
                temp.setNext(node);
            }
        }
    }

    public Node findNode(String hashKey, String key) {
        for(Node n : hashArr) {
            if (n.getKey().equals(hashKey)) {
                Node temp = n;
                while (!temp.getKey().equals(key)) {
                    if (temp.getNext() != null) temp = temp.getNext();
                    else break;
                }
                return temp;
            }
        }
        return null;
    }

    public void delete(String keyHash, String key) {
        for (Node n : hashArr) {
            if (n.getKey().equals(keyHash)) {
                Node temp = n;
                Node reconnect = n;
                while (temp.getNext() != null && !temp.getKey().equals(key)) {
                    reconnect = temp;
                    temp = temp.getNext();
                }
                reconnect.setNext(temp.getNext());
                temp.setNext(null);
            }
        }
    }
}
