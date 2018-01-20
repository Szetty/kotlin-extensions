package com.szetty.kotlinExtensions

inline fun <T> Iterable<T>.filterInTwo(predicate: (T) -> Boolean): Pair<List<T>, List<T>> {
    val positive = ArrayList<T>()
    val negative = ArrayList<T>()
    for(element in this) {
        if (predicate(element)) {
            positive.add(element)
        } else {
            negative.add(element)
        }
    }
    return Pair(positive, negative)
}