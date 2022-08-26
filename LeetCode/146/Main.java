import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // 缓存是 {1=1}
        lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
        lRUCache.get(1);    // 返回 1
        lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        lRUCache.get(2);    // 返回 -1 (未找到)
        lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
        lRUCache.get(1);    // 返回 -1 (未找到)
        lRUCache.get(3);    // 返回 3
        lRUCache.get(4);    // 返回 4
    }
}

class LRUCache {

    int capacity = 0;
    int count = 0;
    List<Integer> keys = new LinkedList<>();
    List<Integer> values = new LinkedList<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        int i = keys.indexOf(key);
        if(i != -1){
            int value = values.get(i);
            keys.remove(i);keys.add(key);
            values.remove(i);values.add(value);
            return value;
        } else return -1;
    }
    
    public void put(int key, int value) {
        int i = keys.indexOf(key);
        if(i != -1){
            keys.remove(i);keys.add(key);
            values.remove(i);values.add(value);
        } else {
            if(count + 1 <= capacity){
                keys.add(key);
                values.add(value);
                count ++;
            } else {
                keys.remove(0);values.remove(0);
                keys.add(key);values.add(key);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */