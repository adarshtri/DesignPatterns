package patterns.abstractfactory.furniture

import patterns.abstractfactory.materials.MaterialType

abstract class Furniture(
    private val materialType: MaterialType
) {
    abstract fun getUnitMaterialRequired(): Int
    abstract fun getNumberOfLegs(): Int
    abstract fun getFurnitureType(): String

    fun getCost(): Double{
        return materialType.getMaterialCostPerUnit()*getUnitMaterialRequired()
    }

    fun getFurnitureMaterialType(): String{
        return materialType.getMaterialType()
    }
}