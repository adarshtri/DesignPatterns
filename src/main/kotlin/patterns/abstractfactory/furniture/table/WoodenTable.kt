package patterns.abstractfactory.furniture.table

import patterns.abstractfactory.materials.MaterialType
import patterns.abstractfactory.materials.Wooden

class WoodenTable(private val materialType: MaterialType = Wooden()): Table(materialType) {
    override fun getUnitMaterialRequired(): Int {
        return 11
    }
}