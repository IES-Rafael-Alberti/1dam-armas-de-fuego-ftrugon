import kotlin.random.Random

class Rifle(
    municion: Int,
    radio: ValoresRadio,

    tipoDeMunicion: String = "7.62mm",
    municionARestar: Int = 2,
    nombre: String = "Rifle"
): ArmaDeFuego(nombre, municion, municionARestar, tipoDeMunicion) {

    var radio = radio
        set(value) {
            requireradio()
            field = value
        }

    var danio: Int = Random.nextInt(5,10)
        set(value) {
            requiredanio()
            field = value
        }

    init {
        requiredanio()
        requireradio()
    }

    fun requireradio(){
        require(radio == ValoresRadio.Corto || radio == ValoresRadio.Intermedio) {"El rango del rifle debe ser corto o Intermedio"}
    }

    fun requiredanio(){
        require(danio in 5..10){"El daño del rifle no puede ser mayor a 10 y menor que 5"}
    }


    override fun toString(): String {
        return super.toString() + ",Daño: $danio, Radio: $radio"
    }

}