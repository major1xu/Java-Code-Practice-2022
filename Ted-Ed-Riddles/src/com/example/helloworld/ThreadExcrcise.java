package com.example.helloworld;

import java.io.IOException;

/*

 
Thread (T1) -> A a1 = new A() -> a1.method1();


Thread (T2) -> A a2 = new A1() -> a2.method1();
 
Thread (T2) ->  a1.method1();
 
class A {


sync method1() {



wait(2 mins);


}
 
sync method2() {


.....


}


}



Thread (T1) -> A a1 = new A() -> a1.method1();


Thread (T2) -> a1.method2();


public class ThreadExcrcise {
     public synchronized method1() throws InterruptedException {

        wait(2000);

    }
    public static void main(String[] args) throws IOException {

    }
}
*/
// https://www.geeksforgeeks.org/java/synchronization-in-java/
class Counter{

    // Shared variable
    private int c = 0;

    // Synchronized method to increment counter
    public synchronized void inc(){
        c++;

    }

    // Synchronized method to get counter value
    public synchronized int get(){
        return c;

    }
}

public class ThreadExcrcise{

    public static void main(String[] args){

        // Shared resource
        Counter cnt = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                cnt.inc();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                cnt.inc();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter: " + cnt.get());
    }
}
