package patterns.abstractfactory.materials

class Wooden: MaterialType {
    override fun getMaterialType(): String {
        return "Wood"
    }

    override fun getMaterialCostPerUnit(): Double {
        return 10.0
    }
}