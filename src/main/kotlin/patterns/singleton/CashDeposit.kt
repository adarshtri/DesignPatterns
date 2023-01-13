package patterns.singleton

import java.time.Instant

object CashDeposit {

    private val name: String

    init {
        name = "Creation:${getInvocationTime()}"
    }

    fun getName(): String{
        println("Initializing cash deposit singleton.")
        return name
    }

    fun getInvocationTime(): Long{
        return Instant.now().toEpochMilli()
    }
}