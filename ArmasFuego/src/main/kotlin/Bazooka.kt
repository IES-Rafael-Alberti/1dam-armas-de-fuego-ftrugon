import kotlin.random.Random

class Bazooka(
    municion: Int,
    municionARestar: Int,
    tipoDeMunicion: String,
    var radio: ValoresRadio,
    nombre: String = "Bazooka",
): ArmaDeFuego(nombre, municion, municionARestar, tipoDeMunicion) {

    var danio: Int = Random.nextInt(10,30)

    init {
        require(danio in 10..30){"El daño del Bazooka no puede ser mayor a 30 y menor que 10"}
        require(radio == ValoresRadio.Intermedio || radio == ValoresRadio.Amplio || radio == ValoresRadio.Enorme) {"El rango de la pistola debe ser corto o reducido"}
    }

    override fun toString(): String {
        return super.toString() + ",Daño: $danio, Radio: $radio"
    }

}