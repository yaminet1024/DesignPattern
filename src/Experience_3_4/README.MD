### 设计模式笔记

---

##### HashMap 和 Hashtable

>Hashtable在JAVA一开始就已经产生了，而HashMap产生于JDK1.2,他们都是键值对的散列表，都是采用链
地址法实现的，他们的区别在于，继承的父类不同，其中HashMap继承于AbstactMap而Hashtable继承于
Dictionary,但Dictionary已经被弃用。最后，他们最大的区别在于前者是属于线性不安全的，但效率
比后者高，后者是属于线性安全的，他的每个方法都提供了Synchronize的方法，在并发和多线程的情况
下可直接使用


