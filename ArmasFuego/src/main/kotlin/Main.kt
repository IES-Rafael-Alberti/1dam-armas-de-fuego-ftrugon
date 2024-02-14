fun main() {

    println("LA MUNICION EXTRA ES DE ${ArmaDeFuego.cantidadMunicionExtra}")


    val pistol = Pistola(10,ValoresRadio.Corto)
    println(pistol)

    val rifle = Rifle(20,ValoresRadio.Intermedio)
    println(rifle)

    val bazooka = Bazooka(30,ValoresRadio.Amplio)
    println(bazooka)


    val armas = mutableListOf<ArmaDeFuego>()
    armas.add(pistol)
    armas.add(rifle)
    armas.add(bazooka)

    val disparos = (1..12).map { armas.random() to (1..3).random() }

    disparos.forEach { (arma, disparos) ->
        println("\nInicio del disparo con ${arma.nombre}")
        for (i in 1..disparos) {
            arma.dispara()
            println(arma)
        }
    }


}