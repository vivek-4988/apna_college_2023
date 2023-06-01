package com.vivekjava.stacks;


import java.util.Stack;

public class SpanOfStock {


    public static void main(String[] args) {
        int stocks[] = {100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        stockSpan(stocks,span);
        for (int i = 0; i < span.length  ; i++) {
            System.out.print(span[i] + " ");
        }
    }

    private static void stockSpan(int[] stocks, int[] span) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stocks.length ; i++) {
            int curPrice = stocks[i];
            while (!s.isEmpty() && curPrice > stocks[s.peek()]){
                s.pop();
            }
            if (s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh =  s.peek();
                span[i] = i - prevHigh;
            }

            s.push(i);
        }

    }

    private static void print(Stack<Integer> s) {
        while (!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }

}
