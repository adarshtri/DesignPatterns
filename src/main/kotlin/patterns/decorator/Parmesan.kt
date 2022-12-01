package patterns.decorator

class Parmesan(pizza: Pizza): Topping(pizza) {
    override fun getDescription(): String {
        return "${pizza.getDescription()}, parmesan"
    }

    override fun getCost(): Int {
        return pizza.getCost() + 5
    }
}