package patterns.abstractfactory.furniture.set

import patterns.abstractfactory.furniture.chair.Chair
import patterns.abstractfactory.furniture.chair.MetalChair
import patterns.abstractfactory.furniture.table.MetalTable
import patterns.abstractfactory.furniture.table.Table

class Metal(private val chair: Chair = MetalChair(), private val table: Table = MetalTable()): FurnitureSet(chair, table)