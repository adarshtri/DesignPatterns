package patterns.decorator

class Mozzarella(pizza: Pizza): Topping(pizza) {

    override fun getDescription(): String {
        return "${pizza.getDescription()}, mozzarella"
    }

    override fun getCost(): Int {
        return pizza.getCost() + 2
    }
}