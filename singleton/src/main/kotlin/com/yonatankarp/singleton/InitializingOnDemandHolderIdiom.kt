package com.yonatankarp.singleton

/**
 * The Initialize-on-demand-holder idiom is a secure way of creating a lazy initialized singleton
 * object in Java.
 *
 * The technique is as lazy as possible and works in all known versions of Java. It takes
 * advantage of language guarantees about class initialization, and will therefore work correctly
 * in all Java-compliant compilers and virtual machines.
 *
 * The inner class is referenced no earlier (and therefore loaded no earlier by the class loader)
 * than the moment that getInstance() is called. Thus, this solution is thread-safe without
 * requiring special language constructs (i.e. volatile or synchronized).
 */
class InitializingOnDemandHolderIdiom private constructor() {
    companion object {
        val instance: InitializingOnDemandHolderIdiom by lazy { InitializingOnDemandHolderIdiom() }
    }
}
