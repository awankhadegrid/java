import java.util.Scanner;
import java.util.Set;

public class Main {

    private static final Set<Character> VOWELS =
            Set.of('a', 'e', 'i', 'o', 'u', 'y');

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();

        System.out.println(minInsertions(word));
    }

    private static int minInsertions(String word) {
        int count = 1;
        int insertions = 0;

        for (int i = 1; i < word.length(); i++) {
            boolean prevIsVowel = VOWELS.contains(word.charAt(i - 1));
            boolean currIsVowel = VOWELS.contains(word.charAt(i));

            if (prevIsVowel == currIsVowel) {
                count++;
            } else {
                insertions += (count - 1) / 2;
                count = 1;
            }
        }

        insertions += (count - 1) / 2;
        return insertions;
    }
}
