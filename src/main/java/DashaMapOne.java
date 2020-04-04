public class DashaMapOne extends DashaMap {

    public String hashFunctionOne(String input) {
        if (input.length() > 0) {
            return String.valueOf(input.charAt(0)).toLowerCase();
        }
        return null;
    }

    public void set(String key, Integer value) {
        String keyHash = hashFunctionOne(key);
        Node newNode = new Node(key, value, null);
        appendTo(keyHash, newNode);
    }

    public Integer get(String key) {
        String keyHash = hashFunctionOne(key);
        Node newNode = findNode(keyHash, key);
        return newNode.getValue();
    }

    public void delete(String key) {
        String keyHash = hashFunctionOne(key);
        delete(keyHash, key);
    }

    public boolean bucketSize(String key) {
        key = hashFunctionOne(key);
        return false;
    }
}
