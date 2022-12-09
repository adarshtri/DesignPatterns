package patterns.abstractfactory.furniture.chair

import patterns.abstractfactory.materials.MaterialType
import patterns.abstractfactory.materials.Plastic

class PlasticChair(private val materialType: MaterialType = Plastic()): Chair(materialType) {
    override fun getUnitMaterialRequired(): Int {
        return 3
    }
}