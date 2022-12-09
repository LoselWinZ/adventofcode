package aoc2020;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Day02 {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> inputs = new ArrayList<>();
        inputs = FileReader.readFileToStringList("src/inputs/input2");
        System.out.println(getValidPasswordAmountWithRuleTwo(inputs));
    }

    private static int getValidPasswordAmountWithRuleOne(List<String> inputs) {
        int validPasswordCounter = 0;
        HashMap<String, Integer> letters;
        for (String input : inputs) {
            letters = new HashMap<>();
            String rule = getRule(input);
            String password = getPassword(input);
            for (char letter : password.toCharArray()) {
                letters.merge(String.valueOf(letter), 1, Integer::sum);
            }
            validPasswordCounter += isValidWithRuleOne(letters, rule) ? 1 : 0;
        }
        return validPasswordCounter;
    }

    private static int getValidPasswordAmountWithRuleTwo(List<String> inputs) {
        int validPasswordCounter = 0;
        for (String input : inputs) {
            String rule = getRule(input);
            String password = getPassword(input);
            validPasswordCounter += isValidWithRuleTwo(password, rule) ? 1 : 0;
        }
        return validPasswordCounter;
    }

    private static boolean isValidWithRuleOne(HashMap<String, Integer> letters, String rule) {
        return letters.get(getRuleLetter(rule)) != null && letters.get(getRuleLetter(rule)) >= getFirstNumberOfRule(rule) && letters.get(getRuleLetter(rule)) <= getLastNumberOfRule(rule);
    }

    private static boolean isValidWithRuleTwo(String password, String rule) {
        return Integer.parseInt(String.valueOf(getLastNumberOfRule(rule) - 1)) <= password.length()
                && ((postionOneEqualsRule(password, rule) && !positionTwoEqualsRule(password, rule))
                || (positionTwoEqualsRule(password, rule) && !postionOneEqualsRule(password, rule)));
    }

    private static boolean positionTwoEqualsRule(String password, String rule) {
        return String.valueOf(password.charAt(getLastNumberOfRule(rule) - 1)).equals(getRuleLetter(rule));
    }

    private static boolean postionOneEqualsRule(String password, String rule) {
        return String.valueOf(password.charAt(getFirstNumberOfRule(rule) - 1)).equals(getRuleLetter(rule));
    }

    private static int getLastNumberOfRule(String rule) {
        return Integer.parseInt(rule.split("-")[1].substring(0, rule.split("-")[1].length() - 2));
    }

    private static int getFirstNumberOfRule(String rule) {
        return Integer.parseInt(rule.split("-")[0]);
    }

    private static String getRuleLetter(String rule) {
        return rule.substring(rule.lastIndexOf(" ") + 1);
    }

    private static String getRule(String input) {
        return input.split(":")[0];
    }

    private static String getPassword(String input) {
        return input.split(":")[1].trim();
    }
}
