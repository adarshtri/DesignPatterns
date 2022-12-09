package patterns.abstractfactory.materials

class Plastic: MaterialType {
    override fun getMaterialType(): String {
        return "Plastic"
    }

    override fun getMaterialCostPerUnit(): Double {
        return 3.5
    }
}