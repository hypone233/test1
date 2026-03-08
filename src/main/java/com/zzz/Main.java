package com.zzz;

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
        /*LinkedList<Integer> list = new LinkedList<>();
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
        }*/
       /* Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        if(!s.empty()) System.out.println("haiyou");*/
        /*Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println(q.size());
        System.out.println(q.peek());
        q.poll();
        System.out.println(q.poll());
        if(!q.isEmpty()) System.out.println("meikong");*/


    }
}
/*
class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        int i=3;
        dp[0] = 0;
        if(n>=1)dp[1] = 1;
        if(n>=2)dp[2] = 1;
        while(i <= n){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            i++;
        }
        return dp[n];
    }
}*/
//贪心860
/*
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0,ten = 0;
        for(int x : bills){
            if(x == 5){
                five++;
            }else if(x == 10){
                if(five == 0)return false;
                five--;
                ten++;
            }else{
                if(five == 0)return false;
                else if(five <=2 && ten == 0)return false;
                else if(ten > 0){ten--;five--;}
                else if(five>=3&&ten==0)five-=3;
            }

        }
        return true;
    }
}
*/
//nk,BC数字统计
/*
import java.util.Scanner;
import java.util.*;
        import java.io.*;

public class Main {
    public static PrintWriter out = new PrintWriter(new BufferedWriter(
            new OutputStreamWriter(System.out)));
    public static Read in = new Read();

    public static void main(String[] args) throws IOException{

        int left = in.nextInt();
        int right = in.nextInt();

        // 使用数位统计方法：count(right) - count(left-1)
        int res = countDigitTwo(right) - countDigitTwo(left - 1);

        out.print(res);
        out.close();
    }

    // 统计1到n中数字2出现的次数
    private static int countDigitTwo(int n) {
        if (n <= 0) return 0;

        int count = 0;
        int factor = 1;  // 位权：1, 10, 100, ...

        while (n / factor > 0) {
            int higher = n / (factor * 10);  // 高位部分
            int current = (n / factor) % 10; // 当前位
            int lower = n % factor;           // 低位部分

            if (current < 2) {
                count += higher * factor;
            } else if (current == 2) {
                count += higher * factor + lower + 1;
            } else { // current > 2
                count += (higher + 1) * factor;
            }

            factor *= 10;
        }

        return count;
    }
}

class Read { // 自定义快速读入
    StringTokenizer st = new StringTokenizer("");
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String next() throws IOException {
        while (!st.hasMoreTokens()) {
            st = new StringTokenizer(bf.readLine());
        }
        return st.nextToken();
    }

    String nextLine() throws IOException {
        return bf.readLine();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}*/
