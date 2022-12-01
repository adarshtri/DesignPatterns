package patterns.decorator

class RisingCrust: Pizza() {
    override fun getDescription(): String {
        return "Rising crust base"
    }

    override fun getCost(): Int {
        return 25
    }
}