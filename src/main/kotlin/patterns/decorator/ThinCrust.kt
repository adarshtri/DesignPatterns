package patterns.decorator

class ThinCrust: Pizza() {
    override fun getDescription(): String {
        return "Thin crust base"
    }

    override fun getCost(): Int {
        return 20
    }
}