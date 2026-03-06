package com.zzz;

import java.util.LinkedList;
import java.util.ListIterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //ArrayList
        /*List<Integer> list = new ArrayList<>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayList<Integer> list1 = new ArrayList<>(list);
        System.out.println(list.equals(list1));
        System.out.println(list);
        list.add(1,5);
        System.out.println(list);
        System.out.println(list.size());
        list.remove(Integer.valueOf(5));
        System.out.println(list);
        list.remove(0);
        if(!list.contains(Integer.valueOf(1))){
            System.out.println("没有1");
        }
        list.add(1);
        list.add(1);
        System.out.println(list.indexOf(1));
        System.out.println(list.lastIndexOf(1));
        for(Integer integer : list){
            System.out.println(integer);
        }
        Iterator<Integer> iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        /*List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }*/
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list.size());
        System.out.println(list);
        list.add(0,0);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while(iterator.hasPrevious()){

            System.out.println(iterator.previous()+"");
        }

    }
}