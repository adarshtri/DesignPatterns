package patterns.observer

class TVDisplay(
    private val subject: ContentSubject
): Observer, Display {
    override fun display() {
        println("Displaying [${subject.getContent()}] on TV.")
    }

    override fun update() {
        println("Updating content on mobile TV.")
        display()
    }
}