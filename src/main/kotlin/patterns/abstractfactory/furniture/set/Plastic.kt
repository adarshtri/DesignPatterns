package patterns.abstractfactory.furniture.set

import patterns.abstractfactory.furniture.chair.Chair
import patterns.abstractfactory.furniture.chair.PlasticChair
import patterns.abstractfactory.furniture.table.PlasticTable
import patterns.abstractfactory.furniture.table.Table

class Plastic(private val chair: Chair = PlasticChair(), private val table: Table = PlasticTable()): FurnitureSet(chair, table)