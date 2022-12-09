package aoc2020;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

public class Day04 {
//    public static void main(String[] args) throws FileNotFoundException {
//        List<String> input = FileReader.readFileToStringListAsParagraph("src/inputs/input4");
//        HashMap<Integer, String[]> map = FileReader.toMap(input);
//        String[] properties = {"byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid",};
//        //        int validPassportCounter = getValidPassportsPartOne(input, properties);
//        int validPassportCounter = getValidPassportsPartTwo(map, properties);
//        System.out.println(validPassportCounter);
//    }
//
//    private static int getValidPassportsPartOne(List<String> input, String[] properties) {
//        int validPassportCounter = 0;
//        for (String s : input) {
//            if (Arrays.stream(properties).allMatch(s::contains)) {
//                validPassportCounter++;
//            }
//        }
//        return validPassportCounter;
//    }
//
//    private static int getValidPassportsPartTwo(HashMap<Integer, String[]> input, String[] properties) {
//        int validPassportCounter = 0;
//        for (String[] value : input.values()) {
//            System.out.println(value.length);
//            for (String s : value) {
//                if (s.contains(properties[0] + ":")) {
//                    System.out.println(s);
//                }
//            }
//        }
//        return validPassportCounter;
//    }
//
//    private static boolean checkPropertyValue(String[] properties, String property, String s) {
//        switch (property) {
//            case "byr":
//                return byr(property, s);
//            case "iyr":
//                return iyr(property, s);
//            case "eyr":
//                return eyr(property, s);
//            case "hgt":
//                return hgt(property, s);
//            case "hcl":
//                return iyr(property, s);
//            case "ecl":
//                return iyr(property, s);
//            case "pid":
//                return iyr(property, s);
//        }
//        return false;
//    }
//
//    private static boolean byr(String property, String s) {
//        int propertyIndex = getPropertyIndex(property, s);
//        String iyrValue = s.substring(propertyIndex, propertyIndex + 4);
//        if (iyrValue.contains("[0-9]")) {
//            int year = Integer.parseInt(iyrValue);
//            return (year >= 1920 && year <= 2002);
//        }
//        return false;
//    }
//
//    private static boolean iyr(String property, String s) {
//        int propertyIndex = getPropertyIndex(property, s);
//        String iyrValue = s.substring(propertyIndex, propertyIndex + 4);
//        if (iyrValue.contains("[0-9]")) {
//            int year = Integer.parseInt(iyrValue);
//            return (year >= 2010 && year <= 2020);
//        }
//        return false;
//    }
//
//    private static boolean eyr(String property, String s) {
//        int propertyIndex = getPropertyIndex(property, s);
//        String iyrValue = s.substring(propertyIndex, propertyIndex + 4);
//        if (iyrValue.contains("[0-9]")) {
//            int year = Integer.parseInt(iyrValue);
//            return (year >= 2020 && year <= 2030);
//        }
//        return false;
//    }
//
//    private static boolean hgt(String property, String s) {
//        int propertyIndex = getPropertyIndex(property, s);
//        String hgtValue = "";
//        String height = "";
//        if (Pattern.compile(property + ":[0-9]cm").matcher(s).find()) {
//            hgtValue = s.substring(propertyIndex, propertyIndex + 5);
//            height = hgtValue.replaceAll("cm", "").trim();
//        } else if (Pattern.compile(property + ":[0-9]in").matcher(s).find()) {
//            hgtValue = s.substring(propertyIndex, propertyIndex + 5);
//            System.out.println(hgtValue);
//            height = hgtValue.replaceAll("in", "").trim();
//        }
//        System.out.println(height);
//        return false;
//    }
//
//    private static int getPropertyIndex(String property, String s) {
//        return (s.indexOf(property) + property.length() + 1);
//    }
}
