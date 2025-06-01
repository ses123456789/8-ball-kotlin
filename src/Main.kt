import javax.print.DocFlavor

const val RESPUESTA_AFIRMATIVA = "✓"
const val RESPUESTA_NEGATIVA = "X"
const val RESPUESTA_DUDOSA = "?"

//Unimos las respuestas con los valores
val respuestas = mapOf(
    "Yes" to RESPUESTA_AFIRMATIVA,
    "It's true" to RESPUESTA_AFIRMATIVA,
    "totally" to RESPUESTA_AFIRMATIVA,
    "without doubt" to RESPUESTA_AFIRMATIVA,
    "Try it in another moment" to RESPUESTA_DUDOSA,
    "I cant tell you that right now" to RESPUESTA_DUDOSA,
    "Maybe" to RESPUESTA_DUDOSA,
    "It wont happen" to RESPUESTA_NEGATIVA,
    "Dont count on that" to RESPUESTA_NEGATIVA,
    "Definitely not" to RESPUESTA_NEGATIVA,
    "I dont think so" to RESPUESTA_NEGATIVA
)//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println(
        "Hello, I'm the Kotlin 8 ball. What do you want to do?\n  1. Ask something\n2. Check answers\n 3. Exit")
    val valoringresado = readLine()
    when(valoringresado){
        "1" -> realizarpregunta()
        "2" -> mostrarrespuestas()
    "3" -> salir()
        else -> mostrarerror()
    }

}

fun mostrarerror() {
    println("youve picked an invalid option, Try it again")
    main()
}

fun salir() {
    println("See you later")
}

fun mostrarrespuestas() {
    println("Select an option \n 1 Show all the answers\n 2 Show only affirmative answers  3 Show only doubtfu answers  4 Show only negative answers")
    val opcioningresada = readLine()
    when (opcioningresada){
        "1" -> mostratrespuestasportipo()
        "2" -> mostratrespuestasportipo(tipoderespuesta =  RESPUESTA_AFIRMATIVA)
        "3" -> mostratrespuestasportipo(tipoderespuesta =  RESPUESTA_NEGATIVA)
        "4" -> mostratrespuestasportipo(tipoderespuesta = RESPUESTA_DUDOSA)
        else -> println("Invalid option")
    }
}

fun mostratrespuestasportipo(tipoderespuesta : String = "todos") {
when(tipoderespuesta){
    "todos" -> respuestas.keys.forEach { respuesta -> println(respuesta) }

    RESPUESTA_AFIRMATIVA -> respuestas.filterValues { values -> values == RESPUESTA_AFIRMATIVA }
        .also { responseTosPositives -> println(responseTosPositives.keys) }

    RESPUESTA_NEGATIVA-> respuestas.filterValues { values -> values == RESPUESTA_NEGATIVA }
        .also { responseTosNegatives -> println(responseTosNegatives.keys) }

    RESPUESTA_DUDOSA -> respuestas.filterValues { values -> values == RESPUESTA_DUDOSA }
        .also { responseTosDudosos -> println(responseTosDudosos.keys) }
}
}

fun realizarpregunta(){
println("What do you want to ask?")
    readLine()
    println("so that is your question ....... the answer of it is:")
    val respuestagenerada = respuestas.keys.random()
    println(respuestagenerada)
}