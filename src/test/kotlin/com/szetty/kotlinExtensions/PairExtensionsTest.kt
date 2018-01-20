package com.szetty.kotlinExtensions

import org.junit.Assert
import org.junit.Test

class PairExtensionsTest {

    @Test
    fun map() {
        val numberPair = Pair(2, 3)
        val numberMapper = { x: Int -> x * 2 }
        val (firstNumber, secondNumber) = numberPair.map(numberMapper)
        Assert.assertEquals(firstNumber, 4)
        Assert.assertEquals(secondNumber, 6)

        val stringPair = Pair("abc", "qwerty")
        val stringMapper = { x: String -> x.toUpperCase() }
        val (firstString, secondString) = stringPair.map(stringMapper)
        Assert.assertEquals(firstString, "ABC")
        Assert.assertEquals(secondString, "QWERTY")

        val listPair = Pair(listOf(1, 2, 3), listOf(3, 4, 5))
        val listMapper = { x: List<Int> -> x.sum() }
        val(firstSum, secondSum) = listPair.map(listMapper)
        Assert.assertEquals(firstSum, 6)
        Assert.assertEquals(secondSum, 12)
    }

}