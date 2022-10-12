package patterns.strategy

class SwordBehavior: WeaponBehavior {
    override fun useWeapon() {
        println("I use a sword for attacking.")
    }
}