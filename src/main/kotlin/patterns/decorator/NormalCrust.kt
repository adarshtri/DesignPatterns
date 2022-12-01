package patterns.decorator

class NormalCrust: Pizza() {
    override fun getDescription(): String {
        return "Normal crust base"
    }

    override fun getCost(): Int {
        return 15
    }
}