package com.ideil.basket

/**
 * Processes this result value.
 *
 * @param T Type of result
 *
 * @param successFunction    Function to process success value
 * @param failureFunction    Function to process failure [Throwable]
 * @param completionFunction Function to be called after success/failure handling
 */
inline fun <T> Result<T>.process(
    crossinline successFunction: (T) -> Unit,
    crossinline failureFunction: (Throwable) -> Unit,
    crossinline completionFunction: () -> Unit
) {
    try {
        getOrThrow().let(successFunction)
    } catch (throwable: Throwable) {
        failureFunction(throwable)
    }
    completionFunction()
}

/**
 * Processes this result value.
 *
 * @param T Type of result
 *
 * @param successFunction Function to process success value
 * @param failureFunction Function to process failure [Throwable]
 */
inline fun <T> Result<T>.process(
    crossinline successFunction: (T) -> Unit,
    crossinline failureFunction: (Throwable) -> Unit
) {
    try {
        getOrThrow().let(successFunction)
    } catch (throwable: Throwable) {
        failureFunction(throwable)
    }
}

/**
 * Processes this result value but ignores failure result.
 *
 * @param T Type of result
 *
 * @param successFunction Function to process success value
 */
inline fun <T> Result<T>.processSuccess(
    crossinline successFunction: (T) -> Unit
) {
    getOrNull()?.let(successFunction)
}

/**
 * Processes this result failure [Throwable] but ignores success result.
 *
 * @param T Type of result
 *
 * @param failureFunction Function to process failure [Throwable]
 */
inline fun <T> Result<T>.processFailure(
    crossinline failureFunction: (Throwable) -> Unit
) {
    exceptionOrNull()?.let(failureFunction)
}