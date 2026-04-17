package String;

public class ReverseSentence {
    public static void main(String[] args){
        String sentence = "Reverse this sentence";
        String rev = "";

        String[] stnce = sentence.split(" ");

        for (String word : stnce) {
            String temp = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                temp += word.charAt(i);
            }

            rev += temp + " ";
        }

        System.out.print(rev.trim());
    }
}