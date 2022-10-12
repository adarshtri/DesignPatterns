package patterns.observer

class MobileDisplay(
    private val subject: ContentSubject
): Observer, Display {
    override fun display() {
        println("Displaying [${subject.getContent()}] on mobile.")
    }

    override fun update() {
        println("Updating content on mobile display.")
        display()
    }
}