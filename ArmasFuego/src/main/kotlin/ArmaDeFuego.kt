import kotlin.random.Random

interface disparar{
    fun dispara()
}

abstract class ArmaDeFuego(
    val nombre: String,
    private var municion: Int,
    private val municionARestar: Int,
    private val tipoDeMunicion: String,

    ):disparar {

    companion object{
        var cantidadMunicionExtra: Int = Random.nextInt(5,15)
    }


    override fun dispara(){
        if (municion < municionARestar){
            recarga()
        }else{
            municion -= municionARestar
            println("$nombre dispara, municion restante: $municion")
        }
    }

    private fun recarga() {
        val comosequedaria = cantidadMunicionExtra - municionARestar
        if (comosequedaria <= 0){
            println("No queda municion extra para recargar")
        }else {
            val munital = municionARestar * 2
            cantidadMunicionExtra -= munital
            municion += munital
            println("Se ha recaragado el arma")
        }
    }


    override fun toString(): String {
        return "Nombre: $nombre, Munición: $municion, Tipo de Munición: $tipoDeMunicion"
    }
}

enum class ValoresRadio {
    Reducido,
    Corto,
    Intermedio,
    Amplio,
    Enorme
}
