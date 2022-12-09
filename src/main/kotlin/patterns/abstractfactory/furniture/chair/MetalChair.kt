package patterns.abstractfactory.furniture.chair

import patterns.abstractfactory.materials.MaterialType
import patterns.abstractfactory.materials.Metal

class MetalChair(private val materialType: MaterialType = Metal()): Chair(materialType) {
    override fun getUnitMaterialRequired(): Int {
        return 4
    }
}