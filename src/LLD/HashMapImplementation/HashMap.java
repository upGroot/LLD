package LLD.HashMapImplementation;

public class HashMap<K, V> {
    private static final int INITIAL_SIZE = 1 << 4; // 16
    private static final int MAXIMUM_CAPACITY = 1 << 30;
    private Entry<K, V>[] hashTable;

    public HashMap() {
        hashTable = createTable(INITIAL_SIZE);
    }

    public HashMap(int capacity) {
        int tableSize = tableSizeFor(capacity);
        hashTable = createTable(tableSize);
    }

    private Entry<K, V>[] createTable(int size) {
        return (Entry<K, V>[]) new Entry[size];
    }

    public int tableSizeFor(int capacity) {
        int n = capacity - 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return n < 0 ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    public V get(K key) {
        int hashCode = key.hashCode() % hashTable.length;
        Entry<K, V> node = hashTable[hashCode];
        while (node != null) {
            if(node.key.equals(key))
                return node.value;
            node = node.next;
        }
        return null;
    }
    public void put(K key, V value) {
        int hashCode = key.hashCode() % hashTable.length;
        if (hashTable[hashCode] == null)
            hashTable[hashCode] = new Entry<K, V>(key, value);
        else {
            Entry<K, V> curr = hashTable[hashCode];
            while (curr.next != null) {
                if(curr.key == key) {
                    curr.value = value;
                    return;
                }
                curr = curr.next;
            }
            curr.next = new Entry<K, V>(key, value);
        }
    }

    class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Entry<K, V> getNext() {
            return next;
        }

        public void setNext(Entry<K, V> next) {
            this.next = next;
        }
    }
}
