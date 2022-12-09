package patterns.abstractfactory.furniture.table

import patterns.abstractfactory.materials.MaterialType
import patterns.abstractfactory.materials.Plastic

class PlasticTable(private val materialType: MaterialType = Plastic()): Table(materialType) {
    override fun getUnitMaterialRequired(): Int {
        return 5
    }
}