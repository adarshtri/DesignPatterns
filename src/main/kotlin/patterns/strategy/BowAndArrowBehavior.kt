package patterns.strategy

class BowAndArrowBehavior: WeaponBehavior {
    override fun useWeapon() {
        println("I use bow and arrow for attacking.")
    }
}