package Numbers;

public class reverseNum {
    public static void main(String[] args){
        int num = 2436534;
        int rev = 0;
        while(num != 0){
            int digit = num % 10;    // Divide num with 10 and keep the remainder
            rev = rev * 10 + digit;  // multiply rev with 10 and add the digit fetched with remainder function.
            num /= 10;               // Divide the  number with 10 and keep the divident and rerun the loop
        }
        System.out.println(rev);
    }
}
