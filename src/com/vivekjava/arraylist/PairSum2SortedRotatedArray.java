package com.vivekjava.arraylist;

import java.util.ArrayList;

public class PairSum2SortedRotatedArray {

    public static boolean pairSum1_2pointer(ArrayList<Integer> list,int tgt){
        int bp = -1;
        int n = list.size();
        //searching bp and pivot
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;

        while (lp != rp){
            //case 1
            if (list.get(lp)+list.get(rp) == tgt){
                return true;
            }
            //case 2
            if (list.get(lp)+list.get(rp) < tgt){
                lp = (lp+1) % n;
            }else {
                rp = (n+rp-1) % n;
            }

        }


        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height= new ArrayList<>();
        height.add(11);
        height.add(15);
        height.add(6);
        height.add(8);
        height.add(9);
        height.add(10);

       // System.out.println(storeWater(height));
         System.out.println(pairSum1_2pointer(height,16));

    }
}
