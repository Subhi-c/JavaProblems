package Strings;

import java.util.Arrays;

public class ReverseprefixWord{
    public static void main(String[] args) {
        String arr = "abcdefd";
        char k = 'd';

        int end =  FindIndex(arr.toCharArray(), k);
        System.out.println(ReverseArray(arr.toCharArray(), end));

    }
    public static int FindIndex(char[] array, char k){
        int i =0;
        for(;i<array.length-1;i++){
            if(array[i] == k){
                return i;
            }
        }
        return i;
    }

    public static String ReverseArray(char[] Array,int end){
        int start = 0;
        String result = "";
        if( end != Array.length){
            while(start < end){
                char temp = Array[start];
                Array[start] = Array[end];
                Array[end] = temp;
                start++;
                end--;
            }
        }
        result = new String(Array);
        return result;
    }
}