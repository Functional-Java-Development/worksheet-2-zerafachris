import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Question 1:");
        Stream.iterate(0, num -> num + 1)
                .map(num -> num * (num + 1) / 2)
                .limit(10)
                .forEach(System.out::println);


        System.out.println("\nQuestion 2:");
        var stopwords = new ArrayList<String>();
        stopwords.addAll(List.of("a", "an", "the", "so", "it", "do", "did", "for", "by", "of", "to"));

        Scanner wordScanner = new Scanner(System.in);
        System.out.println("Enter some strings:");
        List<String> words = new ArrayList<String>();
        boolean loop = true;
        while (loop) {
            String s = wordScanner.nextLine();
            if (s.equals("")) {
                break;
            } else {
                words.add(s);
            }
        }
        System.out.println("Saved words:");
        words.stream()
                .filter(word -> !stopwords.contains(word))
                .distinct()
                .sorted(Comparator.reverseOrder())
//                .sorted(Comparator.comparingInt(String::length).reversed())
                .forEach(System.out::println);


    }
}

