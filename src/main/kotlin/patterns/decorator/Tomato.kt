package patterns.decorator

class Tomato(pizza: Pizza): Topping(pizza) {
    override fun getDescription(): String {
        return "${pizza.getDescription()}, tomatoes"
    }

    override fun getCost(): Int {
        return pizza.getCost() + 4
    }
}