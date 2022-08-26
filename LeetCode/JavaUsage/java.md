# Data Structures in Java

API documentation: https://docs.oracle.com/en/java/javase/18/docs/api/

## java.util.Collection

https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Collection.html

### 1. Queue

https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Queue.html

![image-20220705130632612](C:\Users\15879\Desktop\学习\LeetCode\JavaUsage\image-20220705130632612.png)

<img src="C:\Users\15879\Desktop\学习\LeetCode\JavaUsage\image-20220705144940907.png" alt="image-20220705144940907" style="zoom:67%;" /> 

<img src="https://img-blog.csdnimg.cn/20210424172014888.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzI3MTg0NDk3,size_16,color_FFFFFF,t_70" alt="img" style="zoom: 33%;" />   

- #### Deque (-> ArrayDeque / LinkedList)

  https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Deque.html

  A linear collection that supports element insertion and removal at both ends. The name *deque* is short for "double ended queue" and is usually pronounced "deck".

  A replacement for **Stack**.

  <img src="C:\Users\15879\Desktop\学习\LeetCode\JavaUsage\image-20220705113152044.png" alt="image-20220705113152044" style="zoom: 50%;" />  

  <img src="C:\Users\15879\Desktop\学习\LeetCode\JavaUsage\image-20220705113108979.png" alt="image-20220705113108979" style="zoom:67%;" /> 

- #### Blocking Queue (-> )

  https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/concurrent/BlockingQueue.html

  A Queue that additionally supports operations that wait for the queue to become non-empty when retrieving an element, and wait for space to become available in the queue when storing an element.

  <img src="C:\Users\15879\Desktop\学习\LeetCode\JavaUsage\image-20220705131701739.png" alt="image-20220705131701739" style="zoom:67%;" /> 

  `BlockingQueue` methods come in four forms, with different ways of handling operations that cannot be satisfied immediately, but may be satisfied at some point in the future: one throws an exception, the second returns a special value (either `null` or `false`, depending on the operation), the third blocks the current thread indefinitely until the operation can succeed, and the fourth blocks for only a given maximum time limit before giving up. These methods are summarized in the following table:

  <img src="C:\Users\15879\Desktop\学习\LeetCode\JavaUsage\image-20220705131724485.png" alt="image-20220705131724485" style="zoom:67%;" /> 

- #### Abstract Queue (-> PriorityQueue)

  https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/AbstractQueue.html

  <img src="C:\Users\15879\Desktop\学习\LeetCode\JavaUsage\image-20220705150738847.png" alt="image-20220705150738847" style="zoom:67%;" /> 

### 2. Set

https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Set.html

![image-20220705145829199](C:\Users\15879\Desktop\学习\LeetCode\JavaUsage\image-20220705145829199.png) 

