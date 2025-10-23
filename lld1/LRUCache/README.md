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


MindMap:

├── Qualities of good design
│     ├─ Extensible
│     ├─ Scalable
│     ├─ Reliable
│     └─ Reusable
│
├── SOLID Principles
│     ├─ S: Single Responsibility → One reason to change
│     ├─ O: Open/Closed → Extend, don’t modify
│     ├─ L: Liskov → Subclass replaceability
│     ├─ I: Interface Segregation → Smaller, focused interfaces
│     └─ D: Dependency Inversion → Depend on abstractions
│
└── LRU Cache Design
      ├─ HashMap → O(1) lookup
      ├─ Doubly Linked List → O(1) reordering
      ├─ get(key) → move node to head
      ├─ put(key, value) → add node, remove tail if full
      └─ Head = MRU, Tail = LRU
