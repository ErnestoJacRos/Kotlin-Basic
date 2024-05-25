fun main() {
    /*Encapsulamiento, Abstracción, Polimorfismo, Herenco
* propiedades -> variables que específican los atibutos de la clases
* Métodos -> funciones que contienen el comportamiento y acciones de las clases
* Constructores -> crea las instancias de la clases*/
    /*val smartTvDevice = SmartDevice(name = "Android Tv", category = "Entertainment")

    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()*/
    /* println("Valumen -> ${smartTvDevice.speakerVolume} " )
     smartTvDevice.speakerVolume = 100
     println("Valumen -> ${smartTvDevice.speakerVolume} " )
     smartTvDevice.speakerVolume = 300
     println("Valumen -> ${smartTvDevice.speakerVolume} " )*/
    var smartDevice: SmartDevice = SmartTvDevice(deviceName = "Android TV", deviceCategory = "Entertainment")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice(deviceName = "Google Light", deviceCategory = "Utility")
    smartDevice.turnOn()
}

open class SmartDevice constructor(val name: String, val category: String) {
    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    var deviceStatus = "online"
    /*var speakerVolume: Int = 2
        set(value) {
            if (value in 0..100){
                field = value
            }
        }
        get() {
            return field
        }*/
    open val deviceType = "unknown"

    open fun turnOn() {
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }
}

//Relación IS-A
class SmartTvDevice constructor(/*val nara: String = "Sara",*/ deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {
    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    var channelNumber = 1
        set(value) {
            if (value in 1..200) {
                field = value
            }
        }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume")
    }

    fun nextCahnnel() {
        channelNumber++
        println("Channel number increased to $channelNumber")
    }

    override fun turnOn() {
        super.turnOn()
        println("$name is turned on. Speaker volume is set to " +
                " $speakerVolume and channel number is " + "set to $channelNumber.")
    }
    override fun turnOff() {
         super.turnOff()
        println("$name turned off")
    }
}

//Relación IS-A
class SmartLightDevice constructor(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {
    var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel")
    }
    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on, the brightness level is $brightnessLevel")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turn off")
    }
}

class SmartHome constructor(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
    ) {
    fun turnOnTv() {
        smartTvDevice.turnOn()
    }

    fun turnOffTv() {
        smartTvDevice.turnOff()
    }

    fun increaseTvVolumen() {
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextCahnnel()
    }
    fun turnOnLight() {
        smartLightDevice.turnOn()
    }
    fun turnOffLight() {
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }

}