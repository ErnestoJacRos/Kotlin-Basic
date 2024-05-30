package kotlin14.ejercicios

open class Phone constructor(
    var isScreenLightOn: Boolean = false,

    ) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchLightOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is: $phoneScreenLight")
    }

}

class FoldablePhone constructor(var isFoled: Boolean = true) : Phone() {
    override fun switchOn() {
        if (!isFoled) {
            isScreenLightOn = true
        }
    }

    fun fold() {
        isFoled = true
    }

    fun unFold() {
        isFoled = false
    }
}

fun main() {
val newFoldablePhone = FoldablePhone()
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
    newFoldablePhone.unFold()
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
}