package com.zzz.locktest;

import java.util.concurrent.locks.ReentrantLock;

public class Demo3 {
    static int sum = 0;
    public static void main(String[] args) {

        ReentrantLock reentrantLock = new ReentrantLock();
        Thread t1 =new Thread(){
            @Override
            public void run() {
                int a = 0;
                for(int i = 0; i < 10; i++){
                    a += i;
                }
                sum = a;
                reentrantLock.unlock();
            }
        };
        t1.start();
        reentrantLock.lock();
        System.out.println();

    }

}
