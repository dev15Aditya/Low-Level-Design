public class App {
    public static void main(String[] args) throws Exception {
        LRUCache lruCache = new LRUCache(2);

        lruCache.put(1, 4);
        lruCache.put(2, 4);
        lruCache.put(1, 5);
        lruCache.put(3, 5);

        lruCache.printLRU();
    }
}
