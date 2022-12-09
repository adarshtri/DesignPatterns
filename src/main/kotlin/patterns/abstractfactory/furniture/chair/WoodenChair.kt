package patterns.abstractfactory.furniture.chair

import patterns.abstractfactory.materials.MaterialType
import patterns.abstractfactory.materials.Wooden

class WoodenChair(private val materialType: MaterialType = Wooden()): Chair(materialType) {

    override fun getUnitMaterialRequired(): Int {
        return 5
    }
}