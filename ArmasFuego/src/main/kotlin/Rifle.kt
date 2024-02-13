import kotlin.random.Random

class Rifle(
    municion: Int,
    municionARestar: Int,
    tipoDeMunicion: String,
    var radio: ValoresRadio,
    nombre: String = "Rifle"
): ArmaDeFuego(nombre, municion, municionARestar, tipoDeMunicion) {

    val danio: Int = Random.nextInt(5,10)

    init {
        require(danio in 5..10){"El daño del rifle no puede ser mayor a 10 y menor que 5"}
        require(radio == ValoresRadio.Corto || radio == ValoresRadio.Intermedio) {"El rango del rifle debe ser corto o Intermedio"}
    }

    override fun toString(): String {
        return super.toString() + ",Daño: $danio, Radio: $radio"
    }

}