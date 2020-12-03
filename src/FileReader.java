import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
}
