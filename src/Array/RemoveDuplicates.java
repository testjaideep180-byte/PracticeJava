package Array;


import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> unique = new HashSet<>();
        for(int numbers:arr){
            unique.add(numbers);
        }

        System.out.println(unique);
    }
}

