package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> unique = new HashSet<>();
        for(int arr:numbers){
            unique.add(arr);
        }

        System.out.println(unique);
    }
}

