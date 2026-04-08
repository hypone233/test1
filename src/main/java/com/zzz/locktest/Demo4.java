package com.zzz.locktest;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo4 {
    public static void main(String[] args) {
        int i = 1;
        AtomicInteger atomicInteger = new AtomicInteger();
        i = atomicInteger.addAndGet(10);
        i = atomicInteger.getAndIncrement();
        System.out.println(i);
        System.out.println(atomicInteger);
    }
}
