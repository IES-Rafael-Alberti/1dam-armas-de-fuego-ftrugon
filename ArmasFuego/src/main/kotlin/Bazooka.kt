import kotlin.random.Random

class Bazooka(
    municion: Int,
    radio: ValoresRadio,

    tipoDeMunicion: String = "RPG",
    municionARestar: Int = 3,
    nombre: String = "Bazooka",
): ArmaDeFuego(nombre, municion, municionARestar, tipoDeMunicion) {

    var radio = radio
        set(value) {
            requireradio()
            field = value
        }

    var danio: Int = Random.nextInt(10,30)
        set(value) {
            requiredanio()
            field = value
        }

    init {
        requiredanio()
        requireradio()
    }


    fun requireradio(){
        require(radio == ValoresRadio.Intermedio || radio == ValoresRadio.Amplio || radio == ValoresRadio.Enorme) {"El rango del bazooka debe ser entre Intermedio y Amplio"}
    }

    fun requiredanio(){
        require(danio in 10..30){"El daño del bazooka no puede ser mayor a 30 y menor que 10"}
    }

    override fun toString(): String {
        return super.toString() + ",Daño: $danio, Radio: $radio"
    }

}