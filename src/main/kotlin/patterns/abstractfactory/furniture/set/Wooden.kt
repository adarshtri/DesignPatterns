package patterns.abstractfactory.furniture.set

import patterns.abstractfactory.furniture.chair.Chair
import patterns.abstractfactory.furniture.chair.WoodenChair
import patterns.abstractfactory.furniture.table.Table
import patterns.abstractfactory.furniture.table.WoodenTable

class Wooden(private val chair: Chair = WoodenChair(), private val table: Table = WoodenTable()): FurnitureSet(chair, table)