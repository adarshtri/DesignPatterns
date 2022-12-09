package patterns.abstractfactory.furniture.set

import patterns.abstractfactory.furniture.chair.Chair
import patterns.abstractfactory.furniture.table.Table

abstract class FurnitureSet(private val chair: Chair, private val table: Table) {

    fun getDescription(): String{
        return "Chair: ${chair.getFurnitureMaterialType()}, Table: ${table.getFurnitureMaterialType()}"
    }

    fun getFurnitureSetCost(): Double{
        return chair.getCost() + table.getCost()
    }
}