package patterns.decorator

abstract class Pizza {
    abstract fun getDescription(): String
    abstract fun getCost(): Int
}