package com.szetty.kotlinExtensions

import org.junit.Assert
import org.junit.Test

class IterableExtensionsTest {

    @Test
    fun filterInTwo() {
        val list = listOf(1, 2, 3, 4)
        val listFilter = { x: Int -> x % 2 == 0 }
        val (positiveList, negativeList) = list.filterInTwo(listFilter)
        Assert.assertEquals(listOf(2, 4), positiveList)
        Assert.assertEquals(listOf(1, 3), negativeList)

        val set = setOf("abc", "1234", "qwerty", "xy")
        val setFilter = { x: String -> x.length >= 4}
        val (positiveSet, negativeSet) = set.filterInTwo(setFilter)
        Assert.assertEquals(listOf("1234", "qwerty"), positiveSet)
        Assert.assertEquals(listOf("abc", "xy"), negativeSet)
    }

}