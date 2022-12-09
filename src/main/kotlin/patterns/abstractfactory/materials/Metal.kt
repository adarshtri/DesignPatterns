package patterns.abstractfactory.materials

class Metal: MaterialType {
    override fun getMaterialType(): String {
        return "Metal"
    }

    override fun getMaterialCostPerUnit(): Double {
        return 7.8
    }
}