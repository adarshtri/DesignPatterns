package patterns.abstractfactory.furniture.table

import patterns.abstractfactory.materials.MaterialType
import patterns.abstractfactory.materials.Metal

class MetalTable(private val materialType: MaterialType = Metal()): Table(materialType) {
    override fun getUnitMaterialRequired(): Int {
        return 8
    }
}