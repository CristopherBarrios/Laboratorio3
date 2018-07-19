import labo.*

fun c (lab: ArrayList<labo>) {
    lab.forEach { it.turnOn() }
}

fun main(args: Array<String>) {

        args.forEach { println(it) }
        print("Escriba la lista:")
        val menu = labo(
                lista = readLine()!!
        )
        val b: ArrayList<labo> = arrayListOf(
                menu
        )
        c(b)
        b.forEach { println(it) }
}
