package patterns.observer

class ContentSubject: Subject {
    private lateinit var content: String
    private val observerList: MutableList<Observer> = mutableListOf()

    override fun addObserver(o: Observer) {
        if(o !in observerList)
            observerList.add(o)
        else
            println("Observer already in the list.")
    }

    override fun removeObserver(o: Observer) {
        observerList.remove(o)
    }

    override fun notifyObserver() {
        observerList.forEach{ observer ->
            observer.update()
        }
    }

    fun getContent(): String{
        return this.content
    }

    fun setContent(content: String){
        this.content = content
        notifyObserver()
    }
}