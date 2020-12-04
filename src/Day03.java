import java.io.FileNotFoundException;
import java.util.List;

public class Day03 {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> input = FileReader.readFileToStringList("src/inputs/input3");
        partOne(input);
        //Output wrong
        partTwo(input);
    }

    private static void partOne(List<String> input) {
        int stepsRight = 3;
        int stepsDown = 1;
        System.out.println(calculateTreeEncounters(input, stepsRight, stepsDown));
    }

    private static void partTwo(List<String> input) {
        int[] stepsRight = {1, 3, 5, 7, 1};
        int[] stepsDown = {1, 1, 1, 1, 2};
        long multiplied = 1;
        for (int i = 0; i < stepsRight.length; i++) {
            System.out.println(calculateTreeEncounters(input, stepsRight[i], stepsDown[i]));
            multiplied *= calculateTreeEncounters(input, stepsRight[i], stepsDown[i]);
        }
        System.out.println(multiplied);
    }

    private static int calculateTreeEncounters(List<String> input, int stepsRight, int stepsDown) {
        int index = 0;
        String row = "";
        int treeCounter = 0;
        int currentRight = stepsRight;
        while (input.size() > index) {
            index += stepsDown;
            if (index < input.size()) {
                row = input.get(index);
            }
            if (currentRight >= row.length()) {
                currentRight = currentRight - row.length();
            }
            if (String.valueOf(row.charAt(currentRight)).equals("#")) {
                treeCounter += 1;
            }
            currentRight += stepsRight;
        }
        return treeCounter;
    }
}
