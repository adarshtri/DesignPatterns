package patterns.abstractfactory.furniture.chair

import patterns.abstractfactory.furniture.Furniture
import patterns.abstractfactory.materials.MaterialType

abstract class Chair(private val materialType: MaterialType): Furniture(
    materialType
) {
    override fun getNumberOfLegs(): Int {
        return 4
    }

    override fun getFurnitureType(): String {
        return "Chair"
    }
}