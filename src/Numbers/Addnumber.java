package Numbers;

public class Addnumber {
    public static void main(String[] args){
        int num = 1243235;
        int sum = 0;
        while(num > 0){
             sum += num % 10;
             num /= 10;
        }
        System.out.println(sum);
    }
}
