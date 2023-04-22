package com.vivekjava.backtracking;

public class FindSubset {

    public static void findSubset(String str,String ans,int i){
        //base
        if (i==str.length()){
            if(ans.length() == 0){
                System.out.print("null");
            }else{
                System.out.print(ans+",");
            }
            return;
        }
        //yes
        findSubset(str,ans+str.charAt(i),i+1);
        //no
        findSubset(str,ans,i+1);
    }


    public static void main(String[] args) {
        String str = "abc";
        findSubset(str,"",0);
    }
}
