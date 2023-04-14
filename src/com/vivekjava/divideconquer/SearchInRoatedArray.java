package com.vivekjava.divideconquer;

public class SearchInRoatedArray {

    public static int search(int[] arr,int tgt,int si,int ei){

        if (si > ei){
            return -1;
        }

        int mid = si + (ei-si)/2;
        if(arr[mid]== tgt){
            return mid;
        }

        //min on line 1
        if(arr[si] <= arr[mid]){
            //case a
            if(arr[si] <= tgt && tgt <= arr[mid]){
                return search(arr,tgt,si,mid-1);
            }else{
                //case b
                return search(arr,tgt,mid+1,ei);
            }
        }
        //mid on line 2
        else{
            if(arr[mid] <= tgt && tgt <= arr[ei]){
                return search(arr,tgt,mid+1,ei);
            }else{
                //case d:right
                return search(arr,tgt,si,mid-1);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int tgIndx = search(arr,0,0,arr.length-1);
        System.out.println(tgIndx);
    }
}
