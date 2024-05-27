import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

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
    var smartHome: SmartHome = SmartHome(
        SmartTvDevice("RokuTv","Entertaimnet"),
           SmartLightDevice("Xiaomi Light","Uyility") )
    newTopic("Provando")
    smartHome.smartTvDevice.printDeviceInfo()
    smartHome.smartLightDevice.printDeviceInfo()
}

open class SmartDevice public constructor(val name: String, val category: String) {
    var deviceStatus = "online"
        protected set/*(value) {
            field = value
        } lo hemos como no hizo ninguna validación solo se pone "set"*/

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }


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

    fun printDeviceInfo() {
        println("Device name: $name, category: $category, type: $deviceType")
    }
}

//Relación IS-A
class SmartTvDevice constructor(/*val nara: String = "Sara",*/ deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart TV"
    /*private var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }*/
    private var speakerVolume by RangeRegulator(2,0,100)

    /*private var channelNumber = 1
        set(value) {
            if (value in 1..200) {
                field = value
            }
        }*/
    private var channelNumber by RangeRegulator(1, 0, 200)

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume")
    }

    fun decreaseVolume() {
        speakerVolume--
        println("Speaker volume decreased to $speakerVolume")
    }

    fun nextCahnnel() {
        channelNumber++
        println("Channel number increased to $channelNumber")
    }

    fun previousChannel() {
        channelNumber--
        println("Channel number decreased to $channelNumber")
    }

    override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to " +
                    " $speakerVolume and channel number is " + "set to $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }
}

//Relación IS-A
class SmartLightDevice constructor(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {
    override val deviceType = "Smart Light"
    /*private var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }*/
    private var brightnessLevel by RangeRegulator(0, 0,100)

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel")
    }
    fun decreaseBrightness() {
        brightnessLevel--
        println("Brightness decreased to $brightnessLevel")
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
    val encendidoTv = smartTvDevice.deviceStatus == "on"
    val encendidoLight = smartLightDevice.deviceStatus == "on"

    var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {
        if (encendidoTv) {
            deviceTurnOnCount++
            smartTvDevice.turnOn()
            deviceTurnOnCount++
        }
    }

    fun turnOffTv() {
        if (encendidoTv) {
            deviceTurnOnCount--
            smartTvDevice.turnOff()
            deviceTurnOnCount--
        }
    }

    fun increaseTvVolumen() {
        if (encendidoTv) {
            smartTvDevice.increaseSpeakerVolume()
        }
    }

    fun deacreaseTvVolume() {
        if (encendidoTv){
            smartTvDevice.decreaseVolume()
        }
    }

    fun changeTvChannelToNext() {
        if (encendidoTv) {
            smartTvDevice.nextCahnnel()
        }
    }
    fun changeTvCahnnelPrevious() {
        if (encendidoTv){
            smartTvDevice.previousChannel()
        }
    }

    fun turnOnLight() {
        if (encendidoLight) {
            deviceTurnOnCount++
            smartLightDevice.turnOn()
            deviceTurnOnCount++
        }
    }

    fun turnOffLight() {
        if (encendidoLight) {
            deviceTurnOnCount--
            smartLightDevice.turnOff()
            deviceTurnOnCount--
        }
    }

    fun increaseLightBrightness() {
        if (encendidoLight) {
            smartLightDevice.increaseBrightness()
        }
    }
    fun decreaseLighBrightness() {
        if (encendidoLight){
            smartLightDevice.decreaseBrightness()
        }
    }

    fun turnOffAllDevices() {
        if (encendidoTv && encendidoLight) {
            turnOffTv()
            turnOffLight()
            deviceTurnOnCount = 0
        }
    }
    fun printSmartLightInfo() {
        smartTvDevice.printDeviceInfo()
    }

    fun printSmartTvInfo() {
        smartLightDevice.printDeviceInfo()
    }
}

class RangeRegulator constructor(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {
    var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue){
            fieldData = value
        }
    }

}