import java.util.Scanner;

public class Exercise50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().trim().toLowerCase();
        String []words = sentence.split(" ");

        // Count and print the number of words
        System.out.println(words.length);

        sc.close();
    }
}
