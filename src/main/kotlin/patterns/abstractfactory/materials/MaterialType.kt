package patterns.abstractfactory.materials

interface MaterialType {
    fun getMaterialType(): String
    fun getMaterialCostPerUnit(): Double
}