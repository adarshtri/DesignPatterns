import patterns.strategy.BowAndArrowBehavior
import patterns.strategy.King
import patterns.strategy.Queen
import patterns.strategy.SwordBehavior

fun main(args: Array<String>) {
    val king = King("King", SwordBehavior())
    king.fight()

    val queen = Queen("Queen")
    queen.fight()
    queen.setBehavior(BowAndArrowBehavior())
    queen.fight()
}