package common;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileReader {
    public static List<Integer> readFileToIntList(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        List<Integer> integers = new ArrayList<>();
        while (scanner.hasNext()) {
            integers.add(Integer.parseInt(scanner.nextLine()));
        }
        return integers;
    }

    public static List<String> readFileToStringList(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        List<String> lines = new ArrayList<>();
        while (scanner.hasNext()) {
            lines.add(scanner.nextLine());
        }
        return lines;
    }

    public static List<String> readFileToStringListAsParagraph(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName)).useDelimiter(Pattern.compile("^\\s*$", Pattern.MULTILINE));
        List<String> paragraphs = new ArrayList<>();
        while (scanner.hasNext()) {
            paragraphs.add(scanner.next());
        }
        return paragraphs;
    }

    public static HashMap<Integer, String[]> toMap(List<String> input) {
        HashMap<Integer, String[]> batches = new HashMap<>();
        int index = 0;
        for (String s : input) {
            String[] test = s.split("");
            batches.put(index++, test);
        }
        return batches;
    }
}
