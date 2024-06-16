import java.util.Objects;

public class MyHashMap<K, V> {
    private static final int DEFAULT_SIZE = 16;
    private int size = 0;
    private Entry<K, V>[] context = new Entry[DEFAULT_SIZE];

    public void put(K key, V value) {
        int index;
        if (key == null){
            index = 0;
        }
        else {
            index = calculateIndex(key.hashCode());
        }
        Entry<K, V> newEntry = new Entry<>(key, value);
        if (context[index] == null) {
            context[index] = newEntry;
        } else {
                Entry<K, V> curent = context[index];
                Entry<K, V> previus = null;

                while (curent != null){
                    if(Objects.equals(curent.key,key)){
                        curent.value = value;
                        return;
                    }
                    previus = curent;
                    curent = curent.next;
                }
            previus.next = newEntry;
        }
        size++;
    }
    public V get(K key) {
        int index;
        if (key == null){
            index = 0;
        }
        else {
            index = calculateIndex(key.hashCode());
        }
        Entry<K, V> current = context[index];
        try {
            if (Objects.equals(current.key,key)) {
                return current.value;
            }
            else {
                while (current != null){
                    if (Objects.equals(current.key,key)) {
                        return current.value;
                    }
                    current = current.next;
                }
            }
        }
        catch (NullPointerException e){
            return null;
        }
        return null;

    }
    public void remove(K key){
        int index;
        if (key == null){
            index = 0;
        }
        else {
            index = calculateIndex(key.hashCode());
        }
        Entry<K, V> current = context[index];
        Entry<K, V> previos = null;

        while (current != null){
            if (Objects.equals(current.key,key)){
                if (previos == null){
                    context[index] = current.next;
                }
                else {
                    previos.next = current.next;
                }
                size--;
            }
            previos = current;
            current = current.next;
        }
    }
    private int calculateIndex(int hashCode) {
        return Math.abs(hashCode % context.length);
    }
    static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    public int size(){
        return size;
    }
    public void clear(){
        for (int i = 0; i < context.length; i++) {
            context[i] = null;
        }
        size = 0;
    }
}