import kotlin.random.Random

class Pistola(
    municion: Int,
    radio: ValoresRadio,

    tipoDeMunicion: String = "9mm",
    nombre: String = "Pistola",
    municionARestar: Int = 1,

): ArmaDeFuego(nombre, municion, municionARestar, tipoDeMunicion) {

    var radio = radio
        set(value) {
            requireradio()
            field = value
        }

    var danio: Int = Random.nextInt(1,5)
        set(value) {
            requiredanio()
            field = value
        }

    init {
        requiredanio()
        requireradio()
    }

    fun requireradio(){
        require(radio == ValoresRadio.Corto || radio == ValoresRadio.Reducido) {"El rango de la pistola debe ser corto o Reducido"}
    }


    fun requiredanio(){
        require(danio in 1..5){"El daño de la pistola no puede ser mayor a 5 y menor que 1"}
    }


    override fun toString(): String {
        return super.toString() + ",Daño: $danio, Radio: $radio"
    }

}