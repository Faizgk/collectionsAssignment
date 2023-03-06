public class HashMap<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;

    private Entry<K, V>[] table;
    private int size;

    public HashMap() {
        table = new Entry[INITIAL_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean containsKey(K key) {
        int hash = hash(key);
        Entry<K, V> entry = table[hash];

        while (entry != null) {
            if (entry.key.equals(key)) {
                return true;
            }
            entry = entry.next;
        }

        return false;
    }

    public boolean containsValue(V value) {
        for (Entry<K, V> entry : table) {
            while (entry != null) {
                if (entry.value.equals(value)) {
                    return true;
                }
                entry = entry.next;
            }
        }

        return false;
    }

    public V get(K key) {
        int hash = hash(key);
        Entry<K, V> entry = table[hash];

        while (entry != null) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
            entry = entry.next;
        }

        return null;
    }

    public V put(K key, V value) {
        int hash = hash(key);
        Entry<K, V> entry = table[hash];

        while (entry != null) {
            if (entry.key.equals(key)) {
                V oldValue = entry.value;
                entry.value = value;
                return oldValue;
            }
            entry = entry.next;
        }

        Entry<K, V> newEntry = new Entry<>(key, value);
        newEntry.next = table[hash];
        table[hash] = newEntry;
        size++;

        if ((float) size / table.length >= LOAD_FACTOR) {
            resize();
        }

        return null;
    }

    public V remove(K key) {
        int hash = hash(key);
        Entry<K, V> prev = null;
        Entry<K, V> entry = table[hash];

        while (entry != null) {
            if (entry.key.equals(key)) {
                if (prev == null) {
                    table[hash] = entry.next;
                } else {
                    prev.next = entry.next;
                }
                size--;
                return entry.value;
            }
            prev = entry;
            entry = entry.next;
        }

        return null;
    }

    public void display() {
        for (Entry<K, V> entry : table) {
            while (entry != null) {
                System.out.println(entry.key + " -> " + entry.value);
                entry = entry.next;
            }
        }
    }


    private int hash(K key) {
        return Math.abs(key.hashCode() % table.length);
    }

    private void resize() {
        Entry<K, V>[] oldTable = table;
        table = new Entry[table.length * 2];
        size = 0;

        for (Entry<K, V> entry : oldTable) {
            while (entry != null) {
                put(entry.key, entry.value);
                entry = entry.next;
            }
        }
    }

    private static class Entry<K, V> {
        private final K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
            next = null;
        }

    }

}
