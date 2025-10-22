S (Single Responsibility)
- Node, DoublyLinkedList, and LRUCache each do one job.
O (Open/Closed)	
- You can extend cache behavior (e.g. TTL cache) without modifying LRUCache.
L (Liskov)	
- Node and other helper classes behave predictably — you can subclass safely.
I (Interface Segregation)	
- Not used explicitly here, but if we defined a Cache interface, we’d separate it properly.
D (Dependency Inversion)
- Could inject a Storage or EvictionPolicy abstraction for flexibility.