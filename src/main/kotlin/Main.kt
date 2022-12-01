import patterns.decorator.Mozzarella
import patterns.decorator.Pizza
import patterns.decorator.ThinCrust
import patterns.decorator.Tomato
import patterns.observer.ContentSubject
import patterns.observer.MobileDisplay
import patterns.observer.TVDisplay
import patterns.strategy.BowAndArrowBehavior
import patterns.strategy.King
import patterns.strategy.Queen
import patterns.strategy.SwordBehavior

fun main(args: Array<String>) {
    testStrategy()
    testObserver()
    testDecorator()
}

fun testObserver(){
    val subject = ContentSubject()
    val tvDisplay = TVDisplay(subject)
    val mobileDisplay = MobileDisplay(subject)
    val mobile2Display = MobileDisplay(subject)
    subject.addObserver(tvDisplay)
    subject.addObserver(mobileDisplay)
    subject.setContent("Funny content")
    subject.setContent("Serious content")
    subject.addObserver(mobile2Display)
    subject.setContent("Drama content")
}

fun testStrategy(){
    val king = King("King", SwordBehavior())
    king.fight()
    val queen = Queen("Queen")
    queen.fight()
    queen.setBehavior(BowAndArrowBehavior())
    queen.fight()
}

fun testDecorator(){
    var pizza: Pizza = ThinCrust()
    pizza = Mozzarella(pizza)
    pizza = Tomato(pizza)
    println(pizza.getDescription())
    println(pizza.getCost())
}