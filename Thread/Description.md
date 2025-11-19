# Multithreading

Multithreading is a concept in which a program can run multiple parts of the code simultaneously within a single process.  
It is particularly used for **parallel execution** of code.

---

## Key Concepts

### Thread
- A **thread** is a single part of a program's code that has its own **variables** and **stack**.
- Threads **share the same memory space and resources** of the process they belong to.
- Unlike **processes**, which have independent memory spaces, threads can access the shared memory of other threads in the same process.

---

### Concurrency vs Parallelism
- **Concurrency:** Multiple tasks are handled by the **same CPU** (time-sliced execution).  
- **Parallelism:** Multiple tasks are handled by **different CPUs** (simultaneous execution).

## Creation of Threads in Java

Threads in Java can be created in multiple ways:

### 1. By Extending the `Thread` Class

```java
public class Open extends Thread {
    public void run() {
        System.out.println("By extending Thread");
    }

    public static void main(String[] args) {
        Thread thread = new Open(); // creates thread
        thread.start();             // starts thread
    }
}
```
### 2. By Implementing the `Runnable` Interface

```java
public class Open implements Runnable {
    public void run() {
        System.out.println("By implementing Runnable");
    }

    public static void main(String[] args) {
        Open o = new Open();           // create task
        Thread thread = new Thread(o); // wrap task in thread
        thread.start();                // starts thread
    }
}
```
### 3. By Using `Lambda` Expression

```java
public class Program {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("By using Lambda expression");
        });
        thread1.start();
    }
}
```
## KeyPoint
- Generally runnable is prefered in java programs as in runnable interface provides the proper seperation of task and thread, while the extending methods is using direct method that eventually brings flexibility problems.
- Multithreading is not deterministic; thread execution order may vary.

  ## Thread Lifecycle in Java

The **lifecycle of a thread** represents the stages that a thread passes through during its execution:

1. **New**  
   - The thread object is created but **not started** yet.  
   - Created using the `new` keyword.  

2. **Runnable**  
   - The thread is **ready to run** and waiting for the CPU to allocate time.  
   - Achieved by calling the `start()` method.  

3. **Running**  
   - The thread is **actively executing** its task.  
   - Executed via the `run()` method.  

4. **Blocked / Waiting / Sleeping**  
   - The thread is **temporarily inactive**:  
     - **Blocked:** waiting for other resources.  
     - **Waiting:** waiting indefinitely until another thread signals.  
     - **Sleeping:** inactive for a specified time.  
   - Controlled using `wait()`, `sleep()`, or `join()` methods.  

5. **Terminated**  
   - The thread has **completed its task** and cannot be restarted.  

---

**Note:** A thread can move between **Runnable** and **Running** multiple times depending on CPU scheduling.  

<img width="1536" height="715" alt="life cycle" src="https://github.com/user-attachments/assets/8a50348c-8dfd-4f46-9971-4f86494c228c" />

### Example: Thread Sleep and Join

```java
public class Open extends Thread {
    public void run() {
        try {
            System.out.println("Sleep");
            Thread.sleep(2000); // sleeps for 2 seconds
            System.out.println("Woke up");
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Open(); // creates thread
        thread.start();             // starts thread

        try {
            System.out.println("For next task");
            thread.join(); // main thread waits for this thread to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
    }
}
```
## KeyPoint
- **Race Conditon** : condition occurs when multiple thread access the same data without any proper synchronization and timing that causes the lost update and   data corruptions.

### Example 
```java

	class Counter {
    int count = 0;
    void increment() {
        count++; // Not atomic: read, add, write
    }
}

public class RaceDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(() -> { for(int i=0;i<1000;i++) c.increment(); });
        Thread t2 = new Thread(() -> { for(int i=0;i<1000;i++) c.increment(); });
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Final count: " + c.count);
    }
}
```
### Note:
- In the above example code, 
	count =  0 ,initially
	count = 1, thread t1
	count = 1, thread t2 
but output should be count = 2 , this is ***race conditions*** 

## Methods to Solve Race Conditions

Race conditions occur when multiple threads access shared resources concurrently and the final outcome depends on the timing of their execution.  

Two common ways to solve race conditions in Java:

---

### 1. Using the `synchronized` Keyword

- Ensures that **only one thread executes a method at a time**.

```java
class Counter {
    private int count = 0;

    // synchronized ensures mutual exclusion on this instance
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}
```

### 2. Using **Atomic Classes** (java.util.concurrent.atomic)
-After using
```java
import java.util.concurrent.atomic.AtomicInteger;

class AtomicCounter {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.getAndIncrement();  // atomic read-modify-write
    }

    public int getCount() {
        return count.get();
    }
}

public class AtomicDemo {
    public static void main(String[] args) throws InterruptedException {
        AtomicCounter counter = new AtomicCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}
```

