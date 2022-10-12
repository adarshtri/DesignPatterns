package patterns.strategy

class AxeBehavior: WeaponBehavior {
    override fun useWeapon() {
        println("I use axe for attacking.")
    }
}