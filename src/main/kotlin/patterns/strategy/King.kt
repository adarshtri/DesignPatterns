package patterns.strategy

class King(
    private val characterName: String,
    private val behavior: WeaponBehavior
): Character(characterName) {
    init {
        this.setBehavior(SwordBehavior())
    }
}