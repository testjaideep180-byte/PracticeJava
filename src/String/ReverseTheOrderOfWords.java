package String;

public class ReverseTheOrderOfWords {
        public static void main(String[] args){
            String sentence = "Reverse this sentence";

            String[] words = sentence.split(" ");

            for (int i = words.length - 1; i >= 0; i--) {
                System.out.print(words[i] + " ");
            }
        }
    }

