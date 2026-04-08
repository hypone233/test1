package com.zzz.locktest;

public class Demo1 {
    static class Ret{
        static int sum = 0;
        Object lock = new Object();


    }
    public static void main(String[] args)throws InterruptedException {
        Ret ret = new Ret();

        Thread thread = new Thread(){
          public void run(){
              int a = 0;
              for (int i = 0; i <= 1000; i++){
                  a += i;
              }
              synchronized (ret.lock){
                  ret.sum = a;
                  ret.lock.notify();
              }
              ret.sum = a;
          }
        };
        thread.start();
        synchronized (ret.lock){
            while(ret.sum == 0){
                ret.lock.wait();
            }
        }
        System.out.println(ret.sum);

    }
}
