package com.szetty.kotlinExtensions

inline fun <T, R> Pair<T, T>.map(predicate: (T) -> R): Pair<R, R> {
    return Pair(predicate(this.first), predicate(this.second))
}