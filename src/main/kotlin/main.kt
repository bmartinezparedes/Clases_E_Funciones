fun main(args: Array<String>) {

    val xogador = Xogador(3, "Pedro", "Torres", 20, 1, "Portero")
    val adestrador = Adestrador(1, "Javier", "Torres", 40, "Receptor de porculeros")
    val xogador2 : Seleccion = Xogador(2, "Marcos", "Torres", 20, 2, "Delantero")

    println(xogador)
    println(xogador2)
    println(adestrador)
    xogador.xogarPartido()
    adestrador.dirixirAdestramento()
}