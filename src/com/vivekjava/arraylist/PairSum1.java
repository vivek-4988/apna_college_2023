package com.vivekjava.arraylist;

import java.util.ArrayList;

public class PairSum1 {


    public static boolean pairSum1(ArrayList<Integer> height,int tgt){
        for (int i = 0; i < height.size(); i++) {
            for (int j = i+1; j < height.size() ; j++) {
                if(height.get(i) + height.get(j) == tgt){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean pairSum1_2pointer(ArrayList<Integer> height,int tgt){
        int lp= 0;
        int rp = height.size()-1;

        while (lp < rp){
            if(height.get(lp)+height.get(rp) == tgt){
                return true;
            }

            if(height.get(lp) + height.get(rp)<tgt){
                lp++;
            }else{
                rp--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height= new ArrayList<>();
        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);

       // System.out.println(storeWater(height));
         System.out.println(pairSum1_2pointer(height,5));

    }
}
