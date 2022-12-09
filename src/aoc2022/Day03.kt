package aoc2022

import java.io.File

class Day03 {
    fun partOne() {
        val alphabets =
            CharRange('a', 'z')
                .toMutableList()
                .mapIndexed { index: Int, c: Char -> Pair(c, index + 1) }
                .toMap()

        val lines = File("src/aoc2022/inputs/input3.txt").readLines()
            .map { listOf(it.substring(0, it.length / 2), it.substring(it.length / 2, it.length)) }
            .mapNotNull { rucksack ->
                rucksack.first().find { c -> rucksack.last().contains(c) }
            }
            .sumOf { char -> if (char.isLowerCase()) alphabets[char]!! else alphabets[char.toLowerCase()]!! + alphabets.size }
        println(lines)
    }

    fun partTwo() {
        val alphabets =
            CharRange('a', 'z')
                .toMutableList()
                .mapIndexed { index: Int, c: Char -> Pair(c, index + 1) }
                .toMap()

        val lines = File("src/aoc2022/inputs/input3.txt").readLines()
            .asSequence()
            .map { it.toCharArray() }
            .chunked(3)
            .map { chunk ->
                val map = mutableSetOf<Char>()
                chunk.first().forEach { c ->
                    if (chunk[0].indexOf(c) != -1 && chunk[1].indexOf(c) != -1 && chunk[2].indexOf(c) != -1) map.add(c)
                }
                return@map map
            }.flatten()
            .sumOf { char -> if (char.isLowerCase()) alphabets[char]!! else alphabets[char.toLowerCase()]!! + alphabets.size }
        println(lines)
    }

}

