package com.telran.org.lessontwelve;

import java.util.HashMap;

public class TestArrayHashMap {

    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 3, 4, 8, 7};
        int k = 2;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int element : arr){
            if(map.containsKey(element)){
                int value = map.get(element);
                map.put(element,value +1);
            }else{
                map.put(element,1);
            }
        }
        map.forEach((key,value) ->{
            System.out.println("Key = " + k + "value = " + value );
        });
        for(int i = 0; i <arr.length; i ++){
            int current = arr[i];
            Integer value = map.get(current);
            if(value == k){
                System.out.println("First Element " + current + " contains " + k+ " times ");
                break;
            }
        }
    }
}
