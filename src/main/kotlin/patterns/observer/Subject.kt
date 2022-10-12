package patterns.observer

interface Subject {

    fun addObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyObserver()

}