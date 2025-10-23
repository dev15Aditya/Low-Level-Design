
import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private final int capacity;
    private final Map<Integer, Node> cache;
    private final DoublyLinkedList ddl;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.ddl = new DoublyLinkedList();
    }

    public int get(int key){
        if(!cache.containsKey(key)) return -1;

        Node node = cache.get(key);
        ddl.remove(node);
        ddl.addFirst(node);
        return node.val;
    }

    public void put(int key, int val){
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            ddl.remove(node);
            node.val = val;
            ddl.addFirst(node);
        } else{
            Node node = new Node(key, val);
            cache.put(key, node);
            ddl.addFirst(node);

            if(cache.size() > capacity){
                Node lastNode = ddl.removeLast();
                cache.remove(lastNode.key);
            }
        }
    }

    public void printLRU(){
        Node lru = ddl.head;

        while(lru != null){
            System.out.print("(" + lru.key + ", " + lru.val + ")");
            lru = lru.next;
            if(lru != null) System.out.print("->");
        }
        System.out.println();
    }
    
}
