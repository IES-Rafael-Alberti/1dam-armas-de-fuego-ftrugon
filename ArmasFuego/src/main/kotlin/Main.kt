fun main() {

    // PARTE 1

    println("LA MUNICION EXTRA ES DE ${ArmaDeFuego.cantidadMunicionExtra}")


    val pistol = Pistola(10,ValoresRadio.Corto)
    println(pistol)

    val rifle = Rifle(10,ValoresRadio.Intermedio)
    println(rifle)

    val bazooka = Bazooka(10,ValoresRadio.Amplio)
    println(bazooka)


    //val armas = mutableListOf<ArmaDeFuego>()
    //armas.add(pistol)
    //armas.add(rifle)
    //armas.add(bazooka)
//
    //val disparos = (1..12).map { armas.random() to (1..3).random() }
//
    //disparos.forEach { (arma, disparos) ->
    //    println("\nInicio del disparo con ${arma.nombre}")
    //    for (i in 1..disparos) {
    //        arma.dispara()
    //        println(arma)
    //    }
    //}
//

    // PARTE 2

    val armas2 = mutableListOf<Any>()
    armas2.add(pistol)
    armas2.add(rifle)
    armas2.add(bazooka)
    armas2.add(Casa())
    armas2.add(Coche())
    armas2.add(Bocadillo())

    val disparos2 = (1..9).map { armas2.random() to (1..3).random() }

    disparos2.forEach { (cosa,disparos ) ->
        when (cosa) {
            is ArmaDeFuego -> {
                println("\nInicio del disparo con ${cosa.nombre}")
                for (i in 1..disparos) {
                    cosa.dispara()
                    println(cosa)
                }
            }

            is Casa -> {
                println("\nInicio de Casa")
                for (i in 1..disparos) {
                    cosa.dispara()
                    println(cosa)
                }
            }

            is Coche -> {
                println("\nInicio de Coche")
                for (i in 1..disparos) {
                    cosa.dispara()
                    println(cosa)
                }
            }

            is Bocadillo -> {
                println("\nInicio de Bocadillo")
                for (i in 1..disparos) {
                    cosa.dispara()
                    println(cosa)
                }
            }
        }
    }


}