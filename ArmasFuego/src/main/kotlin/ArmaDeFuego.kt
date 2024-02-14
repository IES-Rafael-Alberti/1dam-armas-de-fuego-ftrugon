import kotlin.random.Random

abstract class ArmaDeFuego(
    val nombre: String,
    private var municion: Int,
    private val municionARestar: Int,
    private val tipoDeMunicion: String,

    ) {



    companion object{
        var cantidadMunicionExtra: Int = Random.nextInt(5,15)
        var dispanum = 1
    }


    fun dispara(){
        if (municion < municionARestar){
            recarga()
        }else{
            municion -= municionARestar
            dispanum ++
            println("$nombre dispara, municion restante: $municion")
        }
    }


    fun recarga() {
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
