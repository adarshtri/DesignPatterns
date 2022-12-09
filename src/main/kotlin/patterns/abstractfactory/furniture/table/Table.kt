package patterns.abstractfactory.furniture.table

import patterns.abstractfactory.furniture.Furniture
import patterns.abstractfactory.materials.MaterialType

abstract class Table(
    private val materialType: MaterialType
): Furniture(materialType) {

    override fun getNumberOfLegs(): Int {
        return 4
    }

    override fun getFurnitureType(): String {
        return "Table"
    }
}