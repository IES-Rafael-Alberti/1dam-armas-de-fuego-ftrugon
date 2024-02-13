fun main() {

    println("LA MUNICION EXTRA ES DE ${ArmaDeFuego.cantidadMunicionExtra}")


    val pistol = Pistola(10,1,"9mm",ValoresRadio.Corto)
    println(pistol)
    pistol.dispara()
    println(pistol)

    val rifle = Rifle(20,2,"5,56mm", ValoresRadio.Intermedio)
    println(rifle)


    val bazooka = Bazooka(30,3,"RPG", ValoresRadio.Intermedio)
    println(bazooka)


}