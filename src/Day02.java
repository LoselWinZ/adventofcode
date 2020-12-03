import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Day02 {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> inputs = new ArrayList<>();
        inputs = FileReader.readFileToStringList("src/inputs/input2");
        System.out.println(getValidPasswordAmount(inputs));
    }

    private static int getValidPasswordAmount(List<String> inputs) {
        int validPasswordCounter = 0;
        HashMap<String, Integer> letters;
        for (String input : inputs) {
//        String input = "10-15 n: nnnnnnnnnqnnnnf";
            letters = new HashMap<>();
            String rule = input.split(":")[0];
            String password = input.split(":")[1].trim();
            for (char letter : password.toCharArray()) {
                letters.merge(String.valueOf(letter), 1, Integer::sum);
            }
            validPasswordCounter += isValid(letters, rule) ? 1 : 0;
        }
        return validPasswordCounter;
    }

    private static boolean isValid(HashMap<String, Integer> letters, String rule) {
        return letters.get(getRuleLetter(rule)) != null && letters.get(getRuleLetter(rule)) >= getMinNumber(rule) && letters.get(getRuleLetter(rule)) <= getMaxNumber(rule);
    }

    private static int getMaxNumber(String rule) {
        return Integer.parseInt(rule.split("-")[1].substring(0, rule.split("-")[1].length() - 2));
    }

    private static int getMinNumber(String rule) {
        return Integer.parseInt(rule.split("-")[0]);
    }

    private static String getRuleLetter(String rule) {
        return rule.substring(rule.lastIndexOf(" ") + 1);
    }
}
