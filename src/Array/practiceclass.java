package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class practiceclass {
    public static void main(String[] args){

        int[] arr = {3,4,5,3,4,5,8};

        Set<Object> set = new HashSet<>();
       for(int num : arr){
           set.add(num);

       }
           System.out.println(set);
             System.out.println();

       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   System.out.println("Duplicate: "+ arr[i]);
               }

           }

       }
        System.out.println();

        HashMap<Integer,Integer> map = new HashMap<>();

       for(int num:arr){
           if(map.containsKey(num)){
               map.put(num, map.get(num)+1);
           }
           else{
               map.put(num, 1);
           }
       }

        System.out.println(map);

    }

}



