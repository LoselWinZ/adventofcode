package aoc2022

import java.io.File

class Day01 {
    fun partOne() {
        val sorted = getCalorieList()
        println(sorted.first())
    }

    fun partTwo() {
        val sorted = getCalorieList()
        println(sorted[0] + sorted[1] + sorted[2])
    }

    private fun getCalorieList(): List<Int> {
        val lines = File("src/aoc2022/inputs/input1.txt").readLines()
        val list = mutableListOf<Int>()
        var sum = 0
        lines.forEach { s ->
            val currentNumber = s.toIntOrNull()
            if (currentNumber != null) {
                sum += currentNumber
            } else {
                list.add(sum)
                sum = 0
            }
        }
        val sorted = list.sortedDescending()
        return sorted
    }

    fun partOneV2() {
        val lines = File("src/aoc2022/inputs/input1.txt").readText().split("\n\n")
            .maxOfOrNull { s: String -> s.lines().filter { it.isNotEmpty() }.sumBy { it.toInt() } }
        println(lines)
    }

    fun partTwoV2() {
        val lines = File("src/aoc2022/inputs/input1.txt").readText()
            .split("\n\n")
            .map { s: String ->
                s.lines()
                    .filter { it.isNotEmpty() }
                    .sumBy { it.toInt() }
            }
            .sortedDescending()
            .take(3)
            .sum()
        println(lines)
    }
}

