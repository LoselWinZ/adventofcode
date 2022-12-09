package aoc2022

import java.io.File

class Day02 {
    fun partOne() {
        val pointsMap =
            mapOf(Pair("X", 1), Pair("Y", 2), Pair("Z", 3))
        val winMap = mapOf(
            Pair("AY", 6),
            Pair("AX", 3),
            Pair("AZ", 0),
            Pair("BY", 3),
            Pair("BX", 0),
            Pair("BZ", 6),
            Pair("CY", 0),
            Pair("CX", 6),
            Pair("CZ", 3),
        )
        val lines = File("src/aoc2022/inputs/input2.txt").readLines().map { it.split(" ") }.sumOf {
            val outcomeScore: Int = winMap[it.joinToString("")] ?: 0
            val pointScore: Int = pointsMap[it.last()] ?: 0
            outcomeScore + pointScore
        }
        println(lines)
    }

    // Rock(A,1), Paper(B,2), Scissors(C,3)
    fun partTwo() {
        val winMap = mapOf(
            Pair("AY", 3 + 1),
            Pair("AX", 0 + 3),
            Pair("AZ", 6 + 2),
            Pair("BY", 3 + 2),
            Pair("BX", 0 + 1),
            Pair("BZ", 6 + 3),
            Pair("CY", 3 + 3),
            Pair("CX", 0 + 2),
            Pair("CZ", 6 + 1)
        )
        val lines = File("src/aoc2022/inputs/input2.txt").readLines().map { it.split(" ") }.sumOf {
            val outcomeScore: Int = winMap[it.joinToString("")] ?: 0
            outcomeScore
        }
        println(lines)
    }

//    A(Rock)

}

