package patterns.abstractfactory.materials

import patterns.abstractfactory.furniture.chair.Chair
import patterns.abstractfactory.furniture.set.FurnitureSet
import patterns.abstractfactory.furniture.table.Table

class Mixed(private val chair: Chair, private val table: Table): FurnitureSet(chair, table)