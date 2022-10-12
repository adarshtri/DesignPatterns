package patterns.strategy

abstract class Character(private val characterName: String) {

    private lateinit var weapon: WeaponBehavior

    open fun fight(){
        if(!::weapon.isInitialized){
            println("Please set the weapon for this character to fight.")
            return
        }
        println("I'm $characterName.")
        this.weapon.useWeapon()
    }

    fun setBehavior(behavior: WeaponBehavior){
        this.weapon = behavior
    }
}