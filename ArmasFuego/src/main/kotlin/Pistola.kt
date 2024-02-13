import kotlin.random.Random

class Pistola(
    municion: Int,
    municionARestar: Int,
    tipoDeMunicion: String,
    var radio: ValoresRadio,
    nombre: String = "Pistola"
): ArmaDeFuego(nombre, municion, municionARestar, tipoDeMunicion) {

    val danio: Int = Random.nextInt(1,5)

    init {
        require(danio in 1..5){"El daño de la pistola no puede ser mayor a 5 y menor que 1"}
        require(radio == ValoresRadio.Corto || radio == ValoresRadio.Reducido) {"El rango de la pistola debe ser corto o reducido"}
    }


    override fun toString(): String {
        return super.toString() + ",Daño: $danio, Radio: $radio"
    }

}