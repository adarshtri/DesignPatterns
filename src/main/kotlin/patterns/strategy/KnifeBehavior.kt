package patterns.strategy

class KnifeBehavior: WeaponBehavior {
    override fun useWeapon() {
        println("I use knife for attacking.")
    }
}