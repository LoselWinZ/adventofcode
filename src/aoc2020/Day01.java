package aoc2020;

import common.FileReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Day01 {

    public static void main(String[] args) throws FileNotFoundException {
        String filename = "src/aoc2020/inputs/input";
        List<Integer> input;
        input = FileReader.readFileToIntList(filename);
        partTwo(input);
    }

    private static void partOne(List<Integer> list) {
        for (int number1 : list) {
            for (int number2 : list) {
                if (number2 + number1 == 2020) {
                    System.out.println(number2 + " + " + number1 + " = 2020");
                    System.out.println(number2 + " * " + number1 + " = " + (number2 * number1));
                    return;
                }
            }
        }
    }

    private static void partTwo(List<Integer> list) {
        for (int number1 : list) {
            for (int number2 : list) {
                for (int number3 : list) {
                    if (number2 + number1 + number3 == 2020) {
                        System.out.println(number2 + " + " + number1 + " + " + number3 + " = 2020");
                        System.out.println(number2 + " * " + number1 + " * " + number3 + " = " + (number2 * number1 * number3));
                        return;
                    }
                }
            }
        }
    }
}
